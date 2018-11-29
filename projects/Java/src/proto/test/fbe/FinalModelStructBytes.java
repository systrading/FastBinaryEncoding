// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.1.0.0

package test.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import test.*;

// Fast Binary Encoding StructBytes final model
public final class FinalModelStructBytes extends FinalModel
{
    public final FinalModelBytes f1;
    public final FinalModelOptionalBytes f2;
    public final FinalModelOptionalBytes f3;

    public FinalModelStructBytes(Buffer buffer, long offset)
    {
        super(buffer, offset);
        f1 = new FinalModelBytes(buffer, 0);
        f2 = new FinalModelOptionalBytes(buffer, 0);
        f3 = new FinalModelOptionalBytes(buffer, 0);
    }

    // Get the allocation size
    public long fbeAllocationSize(StructBytes fbeValue)
    {
        long fbeResult = 0
            + f1.fbeAllocationSize(fbeValue.f1)
            + f2.fbeAllocationSize(fbeValue.f2)
            + f3.fbeAllocationSize(fbeValue.f3)
            ;
        return fbeResult;
    }

    // Get the field type
    public static final long fbeTypeConst = 120;
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

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f1.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f2.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        f3.fbeOffset(fbeCurrentOffset);
        fbeFieldSize = f3.verify();
        if (fbeFieldSize == Long.MAX_VALUE)
            return Long.MAX_VALUE;
        fbeCurrentOffset += fbeFieldSize;

        return fbeCurrentOffset;
    }

    // Get the struct value
    public StructBytes get(Size fbeSize) { return get(fbeSize, new StructBytes()); }
    public StructBytes get(Size fbeSize, StructBytes fbeValue)
    {
        _buffer.shift(fbeOffset());
        fbeSize.value = getFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeValue;
    }

    // Get the struct fields values
    public long getFields(StructBytes fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.fbeOffset(fbeCurrentOffset);
        fbeValue.f1 = f1.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeValue.f2 = f2.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.fbeOffset(fbeCurrentOffset);
        fbeValue.f3 = f3.get(fbeFieldSize);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }

    // Set the struct value
    public long set(StructBytes fbeValue)
    {
        _buffer.shift(fbeOffset());
        long fbeSize = setFields(fbeValue);
        _buffer.unshift(fbeOffset());
        return fbeSize;
    }

    // Set the struct fields values
    public long setFields(StructBytes fbeValue)
    {
        long fbeCurrentOffset = 0;
        long fbeCurrentSize = 0;
        var fbeFieldSize = new Size(0);

        f1.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f1.set(fbeValue.f1);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f2.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f2.set(fbeValue.f2);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        f3.fbeOffset(fbeCurrentOffset);
        fbeFieldSize.value = f3.set(fbeValue.f3);
        fbeCurrentOffset += fbeFieldSize.value;
        fbeCurrentSize += fbeFieldSize.value;

        return fbeCurrentSize;
    }
}
