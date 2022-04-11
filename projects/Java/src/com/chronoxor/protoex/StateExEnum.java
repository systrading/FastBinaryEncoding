//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.protoex;

public enum StateExEnum
{
    unknown((byte)0x00)
    , invalid((byte)0x01)
    , initialized((byte)0x02)
    , calculated((byte)0x04)
    , broken((byte)0x08)
    , happy((byte)0x10)
    , sad((byte)0x20)
    , good(initialized.getRaw()|calculated.getRaw())
    , bad(unknown.getRaw()|invalid.getRaw()|broken.getRaw())
    ;

    private byte value;

    StateExEnum(byte value) { this.value = value; }
    StateExEnum(int value) { this.value = (byte)value; }
    StateExEnum(StateExEnum value) { this.value = value.value; }

    public byte getRaw() { return value; }

    public static StateExEnum mapValue(byte value) { return mapping.get(value); }

    public boolean hasFlags(byte flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(StateExEnum flags) { return hasFlags(flags.value); }

    public java.util.EnumSet<StateExEnum> getAllSet() { return java.util.EnumSet.allOf(StateExEnum.class); }
    public java.util.EnumSet<StateExEnum> getNoneSet() { return java.util.EnumSet.noneOf(StateExEnum.class); }
    public java.util.EnumSet<StateExEnum> getCurrentSet()
    {
        java.util.EnumSet<StateExEnum> result = java.util.EnumSet.noneOf(StateExEnum.class);
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
        if ((value & happy.getRaw()) != 0)
        {
            result.add(happy);
        }
        if ((value & sad.getRaw()) != 0)
        {
            result.add(sad);
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
        if (hasFlags(happy))
        {
            sb.append(first ? "" : "|").append("happy");
            first = false;
        }
        if (hasFlags(sad))
        {
            sb.append(first ? "" : "|").append("sad");
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

    private static final java.util.Map<Byte, StateExEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : StateExEnum.values())
            mapping.put(value.value, value);
    }
}
