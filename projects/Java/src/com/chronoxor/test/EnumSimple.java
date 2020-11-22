// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package com.chronoxor.test;

public final class EnumSimple implements Comparable<EnumSimple>
{
    public static final EnumSimple ENUM_VALUE_0 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_0);
    public static final EnumSimple ENUM_VALUE_1 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_1);
    public static final EnumSimple ENUM_VALUE_2 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_2);
    public static final EnumSimple ENUM_VALUE_3 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_3);
    public static final EnumSimple ENUM_VALUE_4 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_4);
    public static final EnumSimple ENUM_VALUE_5 = new EnumSimple(EnumSimpleEnum.ENUM_VALUE_5);

    private EnumSimpleEnum value = EnumSimpleEnum.values()[0];

    public EnumSimple() {}
    public EnumSimple(int value) { setEnum(value); }
    public EnumSimple(EnumSimpleEnum value) { setEnum(value); }
    public EnumSimple(EnumSimple value) { setEnum(value); }

    public EnumSimpleEnum getEnum() { return value; }
    public int getRaw() { return value.getRaw(); }

    public void setDefault() { setEnum((int)0); }

    public void setEnum(int value) { this.value = EnumSimpleEnum.mapValue(value); }
    public void setEnum(EnumSimpleEnum value) { this.value = value; }
    public void setEnum(EnumSimple value) { this.value = value.value; }

    @Override
    public int compareTo(EnumSimple other)
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

        if (!EnumSimple.class.isAssignableFrom(other.getClass()))
            return false;

        final EnumSimple enm = (EnumSimple)other;

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
