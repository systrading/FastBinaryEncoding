//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding Bytes array final model
public final class FinalModelArrayBytes extends com.chronoxor.fbe.FinalModel
{
    private final com.chronoxor.fbe.FinalModelBytes _model;
    private final long _size;

    public FinalModelArrayBytes(com.chronoxor.fbe.Buffer buffer, long offset, long size)
    {
        super(buffer, offset);
        _model = new com.chronoxor.fbe.FinalModelBytes(buffer, offset);
        _size = size;
    }

    // Get the allocation size
    public long fbeAllocationSize(java.nio.ByteBuffer[] values)
    {
        long size = 0;
        for (long i = 0; (i < values.length) && (i < _size); i++)
            size += _model.fbeAllocationSize(values[(int)i]);
        return size;
    }
    public long fbeAllocationSize(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        long size = 0;
        for (long i = 0; (i < values.size()) && (i < _size); i++)
            size += _model.fbeAllocationSize(values.get((int)i));
        return size;
    }

    // Check if the array is valid
    @Override
    public long verify()
    {
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return Long.MAX_VALUE;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            long offset = _model.verify();
            if (offset == Long.MAX_VALUE)
                return Long.MAX_VALUE;
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Get the array
    public java.nio.ByteBuffer[] get(com.chronoxor.fbe.Size size)
    {
        var values = new java.nio.ByteBuffer[(int)_size];

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
        {
            size.value = 0;
            return values;
        }

        size.value = 0;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset());
        for (long i = 0; i < _size; i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.fbeShift(offset.value);
            size.value += offset.value;
        }
        return values;
    }

    // Get the array
    public long get(java.nio.ByteBuffer[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            offset.value = 0;
            values[(int)i] = _model.get(offset);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Get the array as java.util.ArrayList
    public long get(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        values.clear();

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        values.ensureCapacity((int)_size);

        long size = 0;
        var offset = new com.chronoxor.fbe.Size();
        _model.fbeOffset(fbeOffset());
        for (long i = _size; i-- > 0;)
        {
            offset.value = 0;
            java.nio.ByteBuffer value = _model.get(offset);
            values.add(value);
            _model.fbeShift(offset.value);
            size += offset.value;
        }
        return size;
    }

    // Set the array
    public long set(java.nio.ByteBuffer[] values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.length) && (i < _size); i++)
        {
            long offset = _model.set(values[(int)i]);
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }

    // Set the array as java.util.ArrayList
    public long set(java.util.ArrayList<java.nio.ByteBuffer> values)
    {
        assert (values != null) : "Invalid values parameter!";
        if (values == null)
            throw new IllegalArgumentException("Invalid values parameter!");

        assert ((_buffer.getOffset() + fbeOffset()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset()) > _buffer.getSize())
            return 0;

        long size = 0;
        _model.fbeOffset(fbeOffset());
        for (long i = 0; (i < values.size()) && (i < _size); i++)
        {
            long offset = _model.set(values.get((int)i));
            _model.fbeShift(offset);
            size += offset;
        }
        return size;
    }
}
