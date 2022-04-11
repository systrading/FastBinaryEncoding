//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.9.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public final class FlagsEmpty implements Comparable<FlagsEmpty>
{

    private FlagsEmptyEnum value = FlagsEmptyEnum.values()[0];
    private int flags = value.getRaw();

    public FlagsEmpty() {}
    public FlagsEmpty(int value) { setEnum(value); }
    public FlagsEmpty(FlagsEmptyEnum value) { setEnum(value); }
    public FlagsEmpty(java.util.EnumSet<FlagsEmptyEnum> value) { setEnum(value); }
    public FlagsEmpty(FlagsEmpty value) { setEnum(value); }

    public FlagsEmptyEnum getEnum() { return value; }
    public int getRaw() { return flags; }

    public void setDefault() { setEnum((int)0); }

    public void setEnum(int value) { this.flags = value; this.value = FlagsEmptyEnum.mapValue(value); }
    public void setEnum(FlagsEmptyEnum value) { this.value = value; this.flags = value.getRaw(); }
    public void setEnum(java.util.EnumSet<FlagsEmptyEnum> value) { setEnum(FlagsEmpty.fromSet(value)); }
    public void setEnum(FlagsEmpty value) { this.value = value.value; this.flags = value.flags; }

    public boolean hasFlags(int flags) { return (((this.flags & flags) != 0) && ((this.flags & flags) == flags)); }
    public boolean hasFlags(FlagsEmptyEnum flags) { return hasFlags(flags.getRaw()); }
    public boolean hasFlags(FlagsEmpty flags) { return hasFlags(flags.flags); }

    public FlagsEmpty setFlags(int flags) { setEnum((int)(this.flags | flags)); return this; }
    public FlagsEmpty setFlags(FlagsEmptyEnum flags) { setFlags(flags.getRaw()); return this; }
    public FlagsEmpty setFlags(FlagsEmpty flags) { setFlags(flags.flags); return this; }

    public FlagsEmpty removeFlags(int flags) { setEnum((int)(this.flags & ~flags)); return this; }
    public FlagsEmpty removeFlags(FlagsEmptyEnum flags) { removeFlags(flags.getRaw()); return this; }
    public FlagsEmpty removeFlags(FlagsEmpty flags) { removeFlags(flags.flags); return this; }

    public java.util.EnumSet<FlagsEmptyEnum> getAllSet() { return value.getAllSet(); }
    public java.util.EnumSet<FlagsEmptyEnum> getNoneSet() { return value.getNoneSet(); }
    public java.util.EnumSet<FlagsEmptyEnum> getCurrentSet() { return value.getCurrentSet(); }

    public static FlagsEmpty fromSet(java.util.EnumSet<FlagsEmptyEnum> set)
    {
        int result = 0;
        return new FlagsEmpty(result);
    }

    @Override
    public int compareTo(FlagsEmpty other)
    {
        return (int)(flags - other.flags);
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!FlagsEmpty.class.isAssignableFrom(other.getClass()))
            return false;

        final FlagsEmpty flg = (FlagsEmpty)other;

        if (flags != flg.flags)
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + (int)flags;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        return sb.toString();
    }
}
