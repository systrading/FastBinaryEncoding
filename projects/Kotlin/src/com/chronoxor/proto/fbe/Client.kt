// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

@file:Suppress("UnusedImport", "unused")

package com.chronoxor.proto.fbe

// Fast Binary Encoding com.chronoxor.proto client
@Suppress("MemberVisibilityCanBePrivate", "PropertyName")
open class Client : com.chronoxor.fbe.Client, IClientListener
{
    // Client sender models accessors
    val OrderMessageSenderModel: OrderMessageModel
    val BalanceMessageSenderModel: BalanceMessageModel
    val AccountMessageSenderModel: AccountMessageModel

    // Client receiver values accessors
    private val OrderMessageReceiverValue: com.chronoxor.proto.OrderMessage
    private val BalanceMessageReceiverValue: com.chronoxor.proto.BalanceMessage
    private val AccountMessageReceiverValue: com.chronoxor.proto.AccountMessage

    // Client receiver models accessors
    private val OrderMessageReceiverModel: OrderMessageModel
    private val BalanceMessageReceiverModel: BalanceMessageModel
    private val AccountMessageReceiverModel: AccountMessageModel

    constructor() : super(false)
    {
        OrderMessageSenderModel = OrderMessageModel(sendBuffer)
        OrderMessageReceiverValue = com.chronoxor.proto.OrderMessage()
        OrderMessageReceiverModel = OrderMessageModel()
        BalanceMessageSenderModel = BalanceMessageModel(sendBuffer)
        BalanceMessageReceiverValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageModel()
        AccountMessageSenderModel = AccountMessageModel(sendBuffer)
        AccountMessageReceiverValue = com.chronoxor.proto.AccountMessage()
        AccountMessageReceiverModel = AccountMessageModel()
    }

    constructor(sendBuffer: com.chronoxor.fbe.Buffer, receiveBuffer: com.chronoxor.fbe.Buffer) : super(sendBuffer, receiveBuffer, false)
    {
        OrderMessageSenderModel = OrderMessageModel(sendBuffer)
        OrderMessageReceiverValue = com.chronoxor.proto.OrderMessage()
        OrderMessageReceiverModel = OrderMessageModel()
        BalanceMessageSenderModel = BalanceMessageModel(sendBuffer)
        BalanceMessageReceiverValue = com.chronoxor.proto.BalanceMessage()
        BalanceMessageReceiverModel = BalanceMessageModel()
        AccountMessageSenderModel = AccountMessageModel(sendBuffer)
        AccountMessageReceiverValue = com.chronoxor.proto.AccountMessage()
        AccountMessageReceiverModel = AccountMessageModel()
    }

    fun send(obj: Any): Long
    {
        return sendListener(this, obj)
    }

    @Suppress("JoinDeclarationAndAssignment", "UNUSED_PARAMETER")
    fun sendListener(listener: IClientListener, obj: Any): Long
    {
        when (obj)
        {
            is com.chronoxor.proto.OrderMessage -> if (obj.fbeType == OrderMessageSenderModel.fbeType) return sendListener(listener, obj)
            is com.chronoxor.proto.BalanceMessage -> if (obj.fbeType == BalanceMessageSenderModel.fbeType) return sendListener(listener, obj)
            is com.chronoxor.proto.AccountMessage -> if (obj.fbeType == AccountMessageSenderModel.fbeType) return sendListener(listener, obj)
        }

        return 0
    }

    fun send(value: com.chronoxor.proto.OrderMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: IClientListener, value: com.chronoxor.proto.OrderMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = OrderMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.OrderMessage serialization failed!" }
        assert(OrderMessageSenderModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }
    fun send(value: com.chronoxor.proto.BalanceMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: IClientListener, value: com.chronoxor.proto.BalanceMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = BalanceMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.BalanceMessage serialization failed!" }
        assert(BalanceMessageSenderModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }
    fun send(value: com.chronoxor.proto.AccountMessage): Long
    {
        return sendListener(this, value)
    }

    fun sendListener(listener: IClientListener, value: com.chronoxor.proto.AccountMessage): Long
    {
        // Serialize the value into the FBE stream
        val serialized = AccountMessageSenderModel.serialize(value)
        assert(serialized > 0) { "com.chronoxor.proto.AccountMessage serialization failed!" }
        assert(AccountMessageSenderModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }

        // Log the value
        if (logging)
        {
            val message = value.toString()
            listener.onSendLog(message)
        }

        // Send the serialized value
        return sendSerialized(listener, serialized)
    }

    override fun onReceive(type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        return onReceiveListener(this, type, buffer, offset, size)
    }

    open fun onReceiveListener(listener: IClientListener, type: Long, buffer: ByteArray, offset: Long, size: Long): Boolean
    {
        when (type)
        {
            com.chronoxor.proto.fbe.OrderMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                OrderMessageReceiverModel.attach(buffer, offset)
                assert(OrderMessageReceiverModel.verify()) { "com.chronoxor.proto.OrderMessage validation failed!" }
                val deserialized = OrderMessageReceiverModel.deserialize(OrderMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.proto.OrderMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = OrderMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(OrderMessageReceiverValue)
                return true
            }
            com.chronoxor.proto.fbe.BalanceMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                BalanceMessageReceiverModel.attach(buffer, offset)
                assert(BalanceMessageReceiverModel.verify()) { "com.chronoxor.proto.BalanceMessage validation failed!" }
                val deserialized = BalanceMessageReceiverModel.deserialize(BalanceMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.proto.BalanceMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = BalanceMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(BalanceMessageReceiverValue)
                return true
            }
            com.chronoxor.proto.fbe.AccountMessageModel.fbeTypeConst ->
            {
                // Deserialize the value from the FBE stream
                AccountMessageReceiverModel.attach(buffer, offset)
                assert(AccountMessageReceiverModel.verify()) { "com.chronoxor.proto.AccountMessage validation failed!" }
                val deserialized = AccountMessageReceiverModel.deserialize(AccountMessageReceiverValue)
                assert(deserialized > 0) { "com.chronoxor.proto.AccountMessage deserialization failed!" }

                // Log the value
                if (logging)
                {
                    val message = AccountMessageReceiverValue.toString()
                    onReceiveLog(message)
                }

                // Call receive handler with deserialized value
                listener.onReceive(AccountMessageReceiverValue)
                return true
            }
        }

        return false
    }
}
