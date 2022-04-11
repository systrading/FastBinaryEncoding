//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test.fbe;

// Fast Binary Encoding StructMap field model
public final class FieldModelStructMap extends com.chronoxor.fbe.FieldModel
{
    public final FieldModelMapInt32Byte f1;
    public final FieldModelMapInt32OptionalByte f2;
    public final FieldModelMapInt32Bytes f3;
    public final FieldModelMapInt32OptionalBytes f4;
    public final FieldModelMapInt32EnumSimple f5;
    public final FieldModelMapInt32OptionalEnumSimple f6;
    public final FieldModelMapInt32FlagsSimple f7;
    public final FieldModelMapInt32OptionalFlagsSimple f8;
    public final FieldModelMapInt32StructSimple f9;
    public final FieldModelMapInt32OptionalStructSimple f10;

    public FieldModelStructMap(com.chronoxor.fbe.Buffer buffer, long offset)
    {
        super(buffer, offset);
        f1 = new FieldModelMapInt32Byte(buffer, 4 + 4);
        f2 = new FieldModelMapInt32OptionalByte(buffer, f1.fbeOffset() + f1.fbeSize());
        f3 = new FieldModelMapInt32Bytes(buffer, f2.fbeOffset() + f2.fbeSize());
        f4 = new FieldModelMapInt32OptionalBytes(buffer, f3.fbeOffset() + f3.fbeSize());
        f5 = new FieldModelMapInt32EnumSimple(buffer, f4.fbeOffset() + f4.fbeSize());
        f6 = new FieldModelMapInt32OptionalEnumSimple(buffer, f5.fbeOffset() + f5.fbeSize());
        f7 = new FieldModelMapInt32FlagsSimple(buffer, f6.fbeOffset() + f6.fbeSize());
        f8 = new FieldModelMapInt32OptionalFlagsSimple(buffer, f7.fbeOffset() + f7.fbeSize());
        f9 = new FieldModelMapInt32StructSimple(buffer, f8.fbeOffset() + f8.fbeSize());
        f10 = new FieldModelMapInt32OptionalStructSimple(buffer, f9.fbeOffset() + f9.fbeSize());
    }

    // Get the field size
    @Override
    public long fbeSize() { return 4; }
    // Get the field body size
    public long fbeBody()
    {
        long fbeResult = 4 + 4
            + f1.fbeSize()
            + f2.fbeSize()
            + f3.fbeSize()
            + f4.fbeSize()
            + f5.fbeSize()
            + f6.fbeSize()
            + f7.fbeSize()
            + f8.fbeSize()
            + f9.fbeSize()
            + f10.fbeSize()
            ;
        return fbeResult;
    }
    // Get the field extra size
    @Override
    public long fbeExtra()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4) > _buffer.getSize()))
            return 0;

        _buffer.shift(fbeStructOffset);

        long fbeResult = fbeBody()
            + f1.fbeExtra()
            + f2.fbeExtra()
            + f3.fbeExtra()
            + f4.fbeExtra()
            + f5.fbeExtra()
            + f6.fbeExtra()
            + f7.fbeExtra()
            + f8.fbeExtra()
            + f9.fbeExtra()
            + f10.fbeExtra()
            ;

        _buffer.unshift(fbeStructOffset);

        return fbeResult;
    }
    // Get the field type
    public static final long fbeTypeConst = 140;
    public long fbeType() { return fbeTypeConst; }

    // Check if the struct value is valid
    @Override
    public boolean verify() { return verify(true); }
    public boolean verify(boolean fbeVerifyType)
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return true;

        int fbeStructOffset = readInt32(fbeOffset());
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return false;

        int fbeStructSize = readInt32(fbeStructOffset);
        if (fbeStructSize < (4 + 4))
            return false;

        int fbeStructType = readInt32(fbeStructOffset + 4);
        if (fbeVerifyType && (fbeStructType != fbeType()))
            return false;

        _buffer.shift(fbeStructOffset);
        boolean fbeResult = verifyFields(fbeStructSize);
        _buffer.unshift(fbeStructOffset);
        return fbeResult;
    }

    // Check if the struct fields are valid
    public boolean verifyFields(long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + f1.fbeSize()) > fbeStructSize)
            return true;
        if (!f1.verify())
            return false;
        fbeCurrentSize += f1.fbeSize();

        if ((fbeCurrentSize + f2.fbeSize()) > fbeStructSize)
            return true;
        if (!f2.verify())
            return false;
        fbeCurrentSize += f2.fbeSize();

        if ((fbeCurrentSize + f3.fbeSize()) > fbeStructSize)
            return true;
        if (!f3.verify())
            return false;
        fbeCurrentSize += f3.fbeSize();

        if ((fbeCurrentSize + f4.fbeSize()) > fbeStructSize)
            return true;
        if (!f4.verify())
            return false;
        fbeCurrentSize += f4.fbeSize();

        if ((fbeCurrentSize + f5.fbeSize()) > fbeStructSize)
            return true;
        if (!f5.verify())
            return false;
        fbeCurrentSize += f5.fbeSize();

        if ((fbeCurrentSize + f6.fbeSize()) > fbeStructSize)
            return true;
        if (!f6.verify())
            return false;
        fbeCurrentSize += f6.fbeSize();

        if ((fbeCurrentSize + f7.fbeSize()) > fbeStructSize)
            return true;
        if (!f7.verify())
            return false;
        fbeCurrentSize += f7.fbeSize();

        if ((fbeCurrentSize + f8.fbeSize()) > fbeStructSize)
            return true;
        if (!f8.verify())
            return false;
        fbeCurrentSize += f8.fbeSize();

        if ((fbeCurrentSize + f9.fbeSize()) > fbeStructSize)
            return true;
        if (!f9.verify())
            return false;
        fbeCurrentSize += f9.fbeSize();

        if ((fbeCurrentSize + f10.fbeSize()) > fbeStructSize)
            return true;
        if (!f10.verify())
            return false;
        fbeCurrentSize += f10.fbeSize();

        return true;
    }

    // Get the struct value (begin phase)
    public long getBegin()
    {
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructOffset = readInt32(fbeOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + 4 + 4) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset == 0) || ((_buffer.getOffset() + fbeStructOffset + 4 + 4) > _buffer.getSize()))
            return 0;

        int fbeStructSize = readInt32(fbeStructOffset);
        assert (fbeStructSize >= (4 + 4)) : "Model is broken!";
        if (fbeStructSize < (4 + 4))
            return 0;

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Get the struct value (end phase)
    public void getEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Get the struct value
    public com.chronoxor.test.StructMap get() { return get(new com.chronoxor.test.StructMap()); }
    public com.chronoxor.test.StructMap get(com.chronoxor.test.StructMap fbeValue)
    {
        long fbeBegin = getBegin();
        if (fbeBegin == 0)
            return fbeValue;

        int fbeStructSize = readInt32(0);
        getFields(fbeValue, fbeStructSize);
        getEnd(fbeBegin);
        return fbeValue;
    }

    // Get the struct fields values
    public void getFields(com.chronoxor.test.StructMap fbeValue, long fbeStructSize)
    {
        long fbeCurrentSize = 4 + 4;

        if ((fbeCurrentSize + f1.fbeSize()) <= fbeStructSize)
            f1.get(fbeValue.f1);
        else
            fbeValue.f1.clear();
        fbeCurrentSize += f1.fbeSize();

        if ((fbeCurrentSize + f2.fbeSize()) <= fbeStructSize)
            f2.get(fbeValue.f2);
        else
            fbeValue.f2.clear();
        fbeCurrentSize += f2.fbeSize();

        if ((fbeCurrentSize + f3.fbeSize()) <= fbeStructSize)
            f3.get(fbeValue.f3);
        else
            fbeValue.f3.clear();
        fbeCurrentSize += f3.fbeSize();

        if ((fbeCurrentSize + f4.fbeSize()) <= fbeStructSize)
            f4.get(fbeValue.f4);
        else
            fbeValue.f4.clear();
        fbeCurrentSize += f4.fbeSize();

        if ((fbeCurrentSize + f5.fbeSize()) <= fbeStructSize)
            f5.get(fbeValue.f5);
        else
            fbeValue.f5.clear();
        fbeCurrentSize += f5.fbeSize();

        if ((fbeCurrentSize + f6.fbeSize()) <= fbeStructSize)
            f6.get(fbeValue.f6);
        else
            fbeValue.f6.clear();
        fbeCurrentSize += f6.fbeSize();

        if ((fbeCurrentSize + f7.fbeSize()) <= fbeStructSize)
            f7.get(fbeValue.f7);
        else
            fbeValue.f7.clear();
        fbeCurrentSize += f7.fbeSize();

        if ((fbeCurrentSize + f8.fbeSize()) <= fbeStructSize)
            f8.get(fbeValue.f8);
        else
            fbeValue.f8.clear();
        fbeCurrentSize += f8.fbeSize();

        if ((fbeCurrentSize + f9.fbeSize()) <= fbeStructSize)
            f9.get(fbeValue.f9);
        else
            fbeValue.f9.clear();
        fbeCurrentSize += f9.fbeSize();

        if ((fbeCurrentSize + f10.fbeSize()) <= fbeStructSize)
            f10.get(fbeValue.f10);
        else
            fbeValue.f10.clear();
        fbeCurrentSize += f10.fbeSize();
    }

    // Set the struct value (begin phase)
    public long setBegin()
    {
        assert ((_buffer.getOffset() + fbeOffset() + fbeSize()) <= _buffer.getSize()) : "Model is broken!";
        if ((_buffer.getOffset() + fbeOffset() + fbeSize()) > _buffer.getSize())
            return 0;

        int fbeStructSize = (int)fbeBody();
        int fbeStructOffset = (int)(_buffer.allocate(fbeStructSize) - _buffer.getOffset());
        assert ((fbeStructOffset > 0) && ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) <= _buffer.getSize())) : "Model is broken!";
        if ((fbeStructOffset <= 0) || ((_buffer.getOffset() + fbeStructOffset + fbeStructSize) > _buffer.getSize()))
            return 0;

        write(fbeOffset(), fbeStructOffset);
        write(fbeStructOffset, fbeStructSize);
        write(fbeStructOffset + 4, (int)fbeType());

        _buffer.shift(fbeStructOffset);
        return fbeStructOffset;
    }

    // Set the struct value (end phase)
    public void setEnd(long fbeBegin)
    {
        _buffer.unshift(fbeBegin);
    }

    // Set the struct value
    public void set(com.chronoxor.test.StructMap fbeValue)
    {
        long fbeBegin = setBegin();
        if (fbeBegin == 0)
            return;

        setFields(fbeValue);
        setEnd(fbeBegin);
    }

    // Set the struct fields values
    public void setFields(com.chronoxor.test.StructMap fbeValue)
    {
        f1.set(fbeValue.f1);
        f2.set(fbeValue.f2);
        f3.set(fbeValue.f3);
        f4.set(fbeValue.f4);
        f5.set(fbeValue.f5);
        f6.set(fbeValue.f6);
        f7.set(fbeValue.f7);
        f8.set(fbeValue.f8);
        f9.set(fbeValue.f9);
        f10.set(fbeValue.f10);
    }
}
