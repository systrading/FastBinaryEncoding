// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.1.0.0

package protoex.fbe;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.math.*;
import java.nio.ByteBuffer;
import java.nio.charset.*;
import java.time.*;
import java.util.*;

import fbe.*;
import protoex.*;

// Fast Binary Encoding OrderSide final model
public final class FinalModelOrderSide extends FinalModel
{
    public FinalModelOrderSide(Buffer buffer, long offset) { super(buffer, offset); }

    // Get the allocation size
    public long fbeAllocationSize(OrderSide value) { return fbeSize(); }

    // Get the final size
    @Override
    public long fbeSize() { return 1; }

    // Check if the value is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return Long.MAX_VALUE;

        return fbeSize();
    }

    // Get the value
    public OrderSide get(Size size)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return new OrderSide();

        size.value = fbeSize();
        return new OrderSide(readByte(fbeOffset()));
    }

    // Set the value
    public long set(OrderSide value)
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        write(fbeOffset(), value.getRaw());
        return fbeSize();
    }
}
