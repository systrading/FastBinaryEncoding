// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

package com.chronoxor.proto.fbe;

// Fast Binary Encoding com.chronoxor.proto proxy
public class Proxy extends com.chronoxor.fbe.Receiver
{
    // Proxy models accessors
    private final OrderMessageModel OrderMessageModel;
    private final BalanceMessageModel BalanceMessageModel;
    private final AccountMessageModel AccountMessageModel;

    public Proxy()
    {
        super(false);
        OrderMessageModel = new OrderMessageModel();
        BalanceMessageModel = new BalanceMessageModel();
        AccountMessageModel = new AccountMessageModel();
    }
    public Proxy(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, false);
        OrderMessageModel = new OrderMessageModel();
        BalanceMessageModel = new BalanceMessageModel();
        AccountMessageModel = new AccountMessageModel();
    }

    // Proxy handlers
    protected void onProxy(OrderMessageModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(BalanceMessageModel model, long type, byte[] buffer, long offset, long size) {}
    protected void onProxy(AccountMessageModel model, long type, byte[] buffer, long offset, long size) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)com.chronoxor.proto.fbe.OrderMessageModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                OrderMessageModel.attach(buffer, offset);
                assert OrderMessageModel.verify() : "proto.OrderMessage validation failed!";

                long fbeBegin = OrderMessageModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(OrderMessageModel, type, buffer, offset, size);
                OrderMessageModel.model.getEnd(fbeBegin);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.BalanceMessageModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                BalanceMessageModel.attach(buffer, offset);
                assert BalanceMessageModel.verify() : "proto.BalanceMessage validation failed!";

                long fbeBegin = BalanceMessageModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(BalanceMessageModel, type, buffer, offset, size);
                BalanceMessageModel.model.getEnd(fbeBegin);
                return true;
            }
            case (int)com.chronoxor.proto.fbe.AccountMessageModel.fbeTypeConst:
            {
                // Attach the FBE stream to the proxy model
                AccountMessageModel.attach(buffer, offset);
                assert AccountMessageModel.verify() : "proto.AccountMessage validation failed!";

                long fbeBegin = AccountMessageModel.model.getBegin();
                if (fbeBegin == 0)
                    return false;
                // Call proxy handler
                onProxy(AccountMessageModel, type, buffer, offset, size);
                AccountMessageModel.model.getEnd(fbeBegin);
                return true;
            }
            default: break;
        }

        return false;
    }
}
