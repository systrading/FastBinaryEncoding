//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: FBE
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.fbe;

// Fast Binary Encoding base model
public class Model
{
    private Buffer _buffer;

    // Get bytes buffer
    public Buffer getBuffer() { return _buffer; }

    // Initialize a new model
    protected Model() { _buffer = new Buffer(); }
    protected Model(Buffer buffer) { _buffer = buffer; }

    // Attach memory buffer methods
    public void attach() { _buffer.attach(); }
    public void attach(long capacity) { _buffer.attach(capacity); }
    public void attach(byte[] buffer) { _buffer.attach(buffer); }
    public void attach(byte[] buffer, long offset) { _buffer.attach(buffer, offset); }
    public void attach(byte[] buffer, long size, long offset) { _buffer.attach(buffer, size, offset); }
    public void attach(Buffer buffer) { _buffer.attach(buffer.getData(), buffer.getSize(), buffer.getOffset()); }
    public void attach(Buffer buffer, long offset) { _buffer.attach(buffer.getData(), buffer.getSize(), offset); }

    // Model buffer operations
    public long allocate(long size) { return _buffer.allocate(size); }
    public void remove(long offset, long size) { _buffer.remove(offset, size); }
    public void reserve(long capacity) { _buffer.reserve(capacity); }
    public void resize(long size) { _buffer.resize(size); }
    public void reset() { _buffer.reset(); }
    public void shift(long offset) { _buffer.shift(offset); }
    public void unshift(long offset) { _buffer.unshift(offset); }

    // Buffer I/O methods
    protected int readInt32(long offset) { return Buffer.readInt32(_buffer.getData(), _buffer.getOffset() + offset); }
    protected void write(long offset, int value) { Buffer.write(_buffer.getData(), _buffer.getOffset() + offset, value); }
}
