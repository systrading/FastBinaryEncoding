//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex.fbe;

// Fast Binary Encoding BalanceMessage final model
public final class FinalModelBalanceMessage extends com.chronoxor.fbe.FinalModel
{
    public final FinalModelBalance body;

    public FinalModelBalanceMessage(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        body = new FinalModelBalance(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(com.chronoxor.protoex.BalanceMessage fbeValue)
    {
        long fbeResult = 0
            + body.fbeAllocationSize(fbeValue.body)
            ;
        return fbeResult;
    }

    // Get the final type
    public static final long fbeTypeConst = 12;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public long verify()
    {
        _buffer.shift(fbeOffset());
        long fbeResult = verifyFields();
        _buffer.unshift(fbeOffset());
        return fbeResult;
    }

    // Check if the struct fields are valid
    public long verifyFields()
    {
        long fbeCurrentOffset = 0;
        long fbeFieldSize = 0;

        body.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = body.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public com.chronoxor.protoex.BalanceMessage get(com.chronoxor.fbe.Size fbeSize) { return get(fbeSize, new com.chronoxor.protoex.BalanceMessage()); }
    public com.chronoxor.protoex.BalanceMessage get(com.chronoxor.fbe.Size fbeSize, com.chronoxor.protoex.BalanceMessage fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(com.chronoxor.protoex.BalanceMessage fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size(0);

        body.fbeOffset(fbeCurrentOffset);
        fbeValue.body = body.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(com.chronoxor.protoex.BalanceMessage fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(com.chronoxor.protoex.BalanceMessage fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new com.chronoxor.fbe.Size();

        body.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = body.set(fbeValue.body);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
