//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: enums.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.enums.fbe;

// Fast Binary Encoding com.chronoxor.enums receiver
public class Receiver extends com.chronoxor.fbe.Receiver
{
    // Receiver values accessors

    // Receiver models accessors

    public Receiver()
    {
        super(false);
    }
    public Receiver(com.chronoxor.fbe.Buffer buffer)
    {
        super(buffer, false);
    }

    // Receive handlers

    @Override
    public boolean onReceive(long type, byte[] buffer, long offset, long size)
    {
        switch ((int)type)
        {
            default: break;
        }

        return false;
    }
}
