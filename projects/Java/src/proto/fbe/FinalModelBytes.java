// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: fbe
// Version: 1.1.0.0

package fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

// Fast Binary Encoding bytes final model
public final class FinalModelBytes extends FinalModel
{
    public FinalModelBytes(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(ByteBuffer value) { return 4 + value.array().length; }

    // Check if the bytes value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeBytesSize = readInt32(fbeOffset());
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
            return Long.MAX_VALUE;

        return 4 + fbeBytesSize;
    }

    // Get the bytes value
    public ByteBuffer get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
        {
            size.value = 0;
            return ByteBuffer.allocate(0);
        }

        int fbeBytesSize = readInt32(fbeOffset());
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
        {
            size.value = 4;
            return ByteBuffer.allocate(0);
        }

        size.value = 4 + fbeBytesSize;
        return ByteBuffer.wrap(readBytes(fbeOffset() + 4, fbeBytesSize));
    }

    // Set the bytes value
    public long set(ByteBuffer value)
    {
        assert (value != null) : "Invalid bytes value!";
        if (value == null)
            throw new IllegalArgumentException("Invalid bytes value!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        int fbeBytesSize = value.array().length;
        assert ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4 + fbeBytesSize) > _buffer.getSize())
            return 4;

        write(fbeOffset(), fbeBytesSize);
        write(fbeOffset() + 4, value.array());
        return 4 + fbeBytesSize;
    }
}
