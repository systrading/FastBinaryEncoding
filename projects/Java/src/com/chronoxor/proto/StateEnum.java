//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

package com.chronoxor.proto;

public enum StateEnum
{
    unknown((byte)0x00)
    , invalid((byte)0x01)
    , initialized((byte)0x02)
    , calculated((byte)0x04)
    , broken((byte)0x08)
    , good(initialized.getRaw()|calculated.getRaw())
    , bad(unknown.getRaw()|invalid.getRaw()|broken.getRaw())
    ;

    private byte value;

    StateEnum(byte value) { this.value = value; }
    StateEnum(int value) { this.value = (byte)value; }
    StateEnum(StateEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static StateEnum mapValue(byte value) { return mapping.get(value); }

    public boolean hasFlags(byte flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(StateEnum flags) { return hasFlags(flags.value); }

    public java.util.EnumSet<StateEnum> getAllSet() { return java.util.EnumSet.allOf(StateEnum.class); }
    public java.util.EnumSet<StateEnum> getNoneSet() { return java.util.EnumSet.noneOf(StateEnum.class); }
    public java.util.EnumSet<StateEnum> getCurrentSet()
    {
        java.util.EnumSet<StateEnum> result = java.util.EnumSet.noneOf(StateEnum.class);
        if ((value & unknown.getRaw()) != 0)
        {
            result.add(unknown);
        }
        if ((value & invalid.getRaw()) != 0)
        {
            result.add(invalid);
        }
        if ((value & initialized.getRaw()) != 0)
        {
            result.add(initialized);
        }
        if ((value & calculated.getRaw()) != 0)
        {
            result.add(calculated);
        }
        if ((value & broken.getRaw()) != 0)
        {
            result.add(broken);
        }
        if ((value & good.getRaw()) != 0)
        {
            result.add(good);
        }
        if ((value & bad.getRaw()) != 0)
        {
            result.add(bad);
        }
        return result;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(unknown))
        {
            sb.append(first ? "" : "|").append("unknown");
            first = false;
        }
        if (hasFlags(invalid))
        {
            sb.append(first ? "" : "|").append("invalid");
            first = false;
        }
        if (hasFlags(initialized))
        {
            sb.append(first ? "" : "|").append("initialized");
            first = false;
        }
        if (hasFlags(calculated))
        {
            sb.append(first ? "" : "|").append("calculated");
            first = false;
        }
        if (hasFlags(broken))
        {
            sb.append(first ? "" : "|").append("broken");
            first = false;
        }
        if (hasFlags(good))
        {
            sb.append(first ? "" : "|").append("good");
            first = false;
        }
        if (hasFlags(bad))
        {
            sb.append(first ? "" : "|").append("bad");
            first = false;
        }
        return sb.toString();
    }

    private static final java.util.Map<Byte, StateEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : StateEnum.values())
            mapping.put(value.value, value);
    }
}
