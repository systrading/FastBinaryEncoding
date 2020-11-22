// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

package com.chronoxor.test;

public enum FlagsTypedEnum
{
    FLAG_VALUE_0((long)0x00L)
    , FLAG_VALUE_1((long)0x01L)
    , FLAG_VALUE_2((long)0x02L)
    , FLAG_VALUE_3((long)0x04L)
    , FLAG_VALUE_4((long)0x08L)
    , FLAG_VALUE_5((long)0x10L)
    , FLAG_VALUE_6((long)0x20L)
    , FLAG_VALUE_7((long)0x40L)
    , FLAG_VALUE_8(FLAG_VALUE_7.getRaw())
    , FLAG_VALUE_9(FLAG_VALUE_2.getRaw()|FLAG_VALUE_4.getRaw()|FLAG_VALUE_6.getRaw())
    ;

    private long value;

    FlagsTypedEnum(long value) { this.value = value; }
    FlagsTypedEnum(int value) { this.value = (long)value; }
    FlagsTypedEnum(FlagsTypedEnum value) { this.value = value.value; }

    public long getRaw() { return value; }

    public static FlagsTypedEnum mapValue(long value) { return mapping.get(value); }

    public boolean hasFlags(long flags) { return (((value & flags) != 0) && ((value & flags) == flags)); }
    public boolean hasFlags(FlagsTypedEnum flags) { return hasFlags(flags.value); }

    public java.util.EnumSet<FlagsTypedEnum> getAllSet() { return java.util.EnumSet.allOf(FlagsTypedEnum.class); }
    public java.util.EnumSet<FlagsTypedEnum> getNoneSet() { return java.util.EnumSet.noneOf(FlagsTypedEnum.class); }
    public java.util.EnumSet<FlagsTypedEnum> getCurrentSet()
    {
        java.util.EnumSet<FlagsTypedEnum> result = java.util.EnumSet.noneOf(FlagsTypedEnum.class);
        if ((value & FLAG_VALUE_0.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_0);
        }
        if ((value & FLAG_VALUE_1.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_1);
        }
        if ((value & FLAG_VALUE_2.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_2);
        }
        if ((value & FLAG_VALUE_3.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_3);
        }
        if ((value & FLAG_VALUE_4.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_4);
        }
        if ((value & FLAG_VALUE_5.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_5);
        }
        if ((value & FLAG_VALUE_6.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_6);
        }
        if ((value & FLAG_VALUE_7.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_7);
        }
        if ((value & FLAG_VALUE_8.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_8);
        }
        if ((value & FLAG_VALUE_9.getRaw()) != 0)
        {
            result.add(FLAG_VALUE_9);
        }
        return result;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        boolean first = true;
        if (hasFlags(FLAG_VALUE_0))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_0");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_1))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_1");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_2))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_2");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_3))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_3");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_4))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_4");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_5))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_5");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_6))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_6");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_7))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_7");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_8))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_8");
            first = false;
        }
        if (hasFlags(FLAG_VALUE_9))
        {
            sb.append(first ? "" : "|").append("FLAG_VALUE_9");
            first = false;
        }
        return sb.toString();
    }

    private static final java.util.Map<Long, FlagsTypedEnum> mapping = new java.util.HashMap<>();
    static
    {
        for (var value : FlagsTypedEnum.values())
            mapping.put(value.value, value);
    }
}
