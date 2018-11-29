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

// Fast Binary Encoding Order vector final model
public final class FinalModelVectorOrder extends FinalModel
{
    private final FinalModelOrder _model;

    public FinalModelVectorOrder(Buffer buffer, long offset)
    {
        super(buffer, offset);
        _model = new FinalModelOrder(buffer, offset);
    }

    // Get the allocation size
    public long fbeAllocationSize(Order[] values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(ArrayList<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(LinkedList<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }
    public long fbeAllocationSize(HashSet<Order> values)
    {
        long size = 4;
        for (var value : values)
            size += _model.fbeAllocationSize(value);
        return size;
    }

    // Check if the vector is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return Long.MAX_VALUE;

        int fbeVectorSize = readInt32(fbeOffset());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (int i = fbeVectorSize; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the vector as ArrayList
    public long get(ArrayList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        values.ensureCapacity((int)fbeVectorSize);

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as LinkedList
    public long get(LinkedList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the vector as HashSet
    public long get(HashSet<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        long fbeVectorSize = readInt32(fbeOffset());
        if (fbeVectorSize == 0)
            return 4;

        long size = 4;
        var offset = new Size();
        _model.fbeOffset(fbeOffset() + 4);
        for (long i = 0; i < fbeVectorSize; i++)
        {
            offset.value = 0;
            Order value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the vector as ArrayList
    public long set(ArrayList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as LinkedList
    public long set(LinkedList<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the vector as HashSet
    public long set(HashSet<Order> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset() + 4) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + 4) > _buffer.getSize())
            return 0;

        write(fbeOffset(), (int)values.size());

        long size = 4;
        _model.fbeOffset(fbeOffset() + 4);
        for (var value : values)
        {
            long offset = _model.set(value);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }
}
