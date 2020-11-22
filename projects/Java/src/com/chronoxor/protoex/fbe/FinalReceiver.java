// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.5.0.0

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding com.chronoxor.protoex final receiver
public class FinalReceiver extends com.chronoxor.fbe.Receiver
{
    // Imported receivers
    public com.chronoxor.proto.fbe.FinalReceiver protoReceiver;

    // Receiver values accessors
    private final com.chronoxor.protoex.OrderMessage OrderMessageValue;
    private final com.chronoxor.protoex.BalanceMessage BalanceMessageValue;
    private final com.chronoxor.protoex.AccountMessage AccountMessageValue;

    // Receiver models accessors
    private final OrderMessageFinalModel OrderMessageModel;
    private final BalanceMessageFinalModel BalanceMessageModel;
    private final AccountMessageFinalModel AccountMessageModel;

    public FinalReceiver()
    {
        super(true);
        protoReceiver = new com.chronoxor.proto.fbe.FinalReceiver(getBuffer());
        OrderMessageValue = new com.chronoxor.protoex.OrderMessage();
        OrderMessageModel = new OrderMessageFinalModel();
        BalanceMessageValue = new com.chronoxor.protoex.BalanceMessage();
        BalanceMessageModel = new BalanceMessageFinalModel();
        AccountMessageValue = new com.chronoxor.protoex.AccountMessage();
        AccountMessageModel = new AccountMessageFinalModel();
    }
    public FinalReceiver(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
        protoReceiver = new com.chronoxor.proto.fbe.FinalReceiver(getBuffer());
        OrderMessageValue = new com.chronoxor.protoex.OrderMessage();
        OrderMessageModel = new OrderMessageFinalModel();
        BalanceMessageValue = new com.chronoxor.protoex.BalanceMessage();
        BalanceMessageModel = new BalanceMessageFinalModel();
        AccountMessageValue = new com.chronoxor.protoex.AccountMessage();
        AccountMessageModel = new AccountMessageFinalModel();
    }

    // Receive handlers
    protected void onReceive(com.chronoxor.protoex.OrderMessage value) {}
    protected void onReceive(com.chronoxor.protoex.BalanceMessage value) {}
    protected void onReceive(com.chronoxor.protoex.AccountMessage value) {}

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            case (int)com.chronoxor.protoex.fbe.OrderMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                OrderMessageModel.attach(buffer, offset);
                assert OrderMessageModel.verify() : "protoex.OrderMessage validation failed!";
                long deserialized = OrderMessageModel.deserialize(OrderMessageValue);
                assert (deserialized > 0) : "protoex.OrderMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = OrderMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(OrderMessageValue);
                return true;
            }
            case (int)com.chronoxor.protoex.fbe.BalanceMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                BalanceMessageModel.attach(buffer, offset);
                assert BalanceMessageModel.verify() : "protoex.BalanceMessage validation failed!";
                long deserialized = BalanceMessageModel.deserialize(BalanceMessageValue);
                assert (deserialized > 0) : "protoex.BalanceMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = BalanceMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(BalanceMessageValue);
                return true;
            }
            case (int)com.chronoxor.protoex.fbe.AccountMessageFinalModel.fbeTypeConst:
            {
                // Deserialize the value from the FBE stream
                AccountMessageModel.attach(buffer, offset);
                assert AccountMessageModel.verify() : "protoex.AccountMessage validation failed!";
                long deserialized = AccountMessageModel.deserialize(AccountMessageValue);
                assert (deserialized > 0) : "protoex.AccountMessage deserialization failed!";

                // Log the value
                if (getLogging())
                {
                    String message = AccountMessageValue.toString();
                    onReceiveLog(message);
                }

                // Call receive handler with deserialized value
                onReceive(AccountMessageValue);
                return true;
            }
            default: break;
        }

        if ((protoReceiver != null) && protoReceiver.onReceive(type, buffer, offset, size))
            return true;

        return false;
    }
}
