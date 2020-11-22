// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

package com.chronoxor.proto;

public class AccountMessage implements Comparable<Object>
{
    public Account body = new Account();

    public static final long fbeTypeConst = 3;
    public long fbeType() { return fbeTypeConst; }

    public AccountMessage() {}

    public AccountMessage(Account body)
    {
        this.body = body;
    }

    public AccountMessage(AccountMessage other)
    {
        this.body = other.body;
    }

    public AccountMessage clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.proto.fbe.AccountMessageModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.proto.fbe.AccountMessageModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!AccountMessage.class.isAssignableFrom(other.getClass()))
            return -1;

        final AccountMessage obj = (AccountMessage)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!AccountMessage.class.isAssignableFrom(other.getClass()))
            return false;

        final AccountMessage obj = (AccountMessage)other;

        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 17;
        return hash;
    }

    @Override
    public String toString()
    {
        var sb = new StringBuilder();
        sb.append("AccountMessage(");
        sb.append("body="); sb.append(body);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.proto.fbe.Json.getEngine().toJson(this); }
    public static AccountMessage fromJson(String json) { return com.chronoxor.proto.fbe.Json.getEngine().fromJson(json, AccountMessage.class); }
}
