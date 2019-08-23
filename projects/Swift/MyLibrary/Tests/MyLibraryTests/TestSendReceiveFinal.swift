//
//  SendReceiveTest.swift
//

import XCTest
import proto

fileprivate class MyFinalSender: FinalSender {
    override func onSend(buffer: Data, offset: Int, size: Int) throws -> Int {
        // Send nothing...
        return 0
    }
}

fileprivate class MyFinalReceiver: FinalReceiver, proto.FinalReceiverListener {
    private var _order: Bool = false
    private var _balance: Bool = false
    private var _account: Bool = false
    
    var check: Bool {
        return  _order && _balance && _account
    }
    
    func onReceive(value: proto.Order) {
        _order = true
    }
    
    func onReceive(value: proto.Balance) {
        _balance = true
    }
    
    func onReceive(value: proto.Account) {
        _account = true
    }
}

class TestSendReceiveFinal: XCTestCase {
    
    func testSendAndReceive() {
        for i in 0...99 {
            for j in 0...99 {
                XCTAssertTrue(sendAndReceive(i: i, j: j))
            }
        }
    }
    
    func sendAndReceive(i: Int, j: Int) -> Bool {
        let sender = MyFinalSender()
        
        // Create and send a new order
        let order = Order(id: 1, symbol: "EURUSD", side: OrderSide.buy, type: OrderType.market, price: 1.23456, volume: 1000.0)
        _ = try? sender.send(value: order)
        
        // Create and send a new balance wallet
        let balance = Balance(currency: "USD", amount: 1000.0)
        _ = try? sender.send(value: balance)
        
        // Create and send a new account with some orders
        let account = Account(id: 1, name: "Test", state: State.good, wallet: Balance(currency: "USD", amount: 1000.0), asset: Balance(currency: "EUR", amount: 100.0), orders: [])
        account.orders.append(Order(id: 1, symbol: "EURUSD", side: OrderSide.buy, type: OrderType.market, price: 1.23456, volume: 1000.0))
        account.orders.append(Order(id: 2, symbol: "EURUSD", side: OrderSide.sell, type: OrderType.limit, price: 1.0, volume: 100.0))
        account.orders.append(Order(id: 3, symbol: "EURUSD", side: OrderSide.buy, type: OrderType.stop, price: 1.5, volume: 10.0))
        _ = try? sender.send(value: account)
        
        let receiver = MyFinalReceiver()
        // Receive data from the sender
        let index1 = i % sender.buffer.size
        var index2 = j % sender.buffer.size
        index2 = max(index1, index2)
        try? receiver.receive(buffer: sender.buffer, offset: 0, size: index1)
        try? receiver.receive(buffer: sender.buffer, offset: index1, size: index2 - index1)
        try? receiver.receive(buffer: sender.buffer, offset: index2, size: sender.buffer.size - index2)
        return receiver.check
    }
}
