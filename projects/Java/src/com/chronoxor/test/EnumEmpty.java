//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

package com.chronoxor.test;

public final class EnumEmpty implements Comparable<EnumEmpty>
{

    private EnumEmptyEnum value = EnumEmptyEnum.values()[0];

    public EnumEmpty() {}
    public EnumEmpty(int value) { setEnum(value); }
    public EnumEmpty(EnumEmptyEnum value) { setEnum(value); }
    public EnumEmpty(EnumEmpty value) { setEnum(value); }

    public EnumEmptyEnum getEnum() { return value; }
    public int getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((int)0); }

    public void setEnum(int value) { this.value = EnumEmptyEnum.mapValue(value); }
    public void setEnum(EnumEmptyEnum value) { this.value = value; }
    public void setEnum(EnumEmpty value) { this.value = value.value; }

    @Override
    public int compareTo(EnumEmpty other)
    {
        if (value == null)
            return -1;
        if (other.value == null)
            return 1;
        return (int)(value.getRaw() - other.value.getRaw());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!EnumEmpty.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumEmpty enm = (EnumEmpty)other;

        if ((value == null) || (enm.value == null))
            return false;
        if (value.getRaw() != enm.value.getRaw())
            return false;
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        hash = hash * 31 + ((value != null) ? value.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() { return (value != null) ? value.toString() : "<unknown>"; }
}
