//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding com.chronoxor.enums final sender
public class FinalSender extends com.chronoxor.fbe.Sender
{
    // Sender models accessors

    public FinalSender()
    {
        super(true);
    }
    public FinalSender(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, true);
    }

    public long send(Object obj)
    {

        return 0;
    }


    // Send message handler
    @Override
    protected long onSend(byte[] buffer, long offset, long size) { throw new UnsupportedOperationException("com.chronoxor.enums.fbe.Sender.onSend() not implemented!"); }
}
