// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.5.0.0

package com.chronoxor.proto;

public class OrderMessage implements Comparable<Object>
{
    public Order body = new Order();

    public static final long fbeTypeConst = 1;
    public long fbeType() { return fbeTypeConst; }

    public OrderMessage() {}

    public OrderMessage(Order body)
    {
        this.body = body;
    }

    public OrderMessage(OrderMessage other)
    {
        this.body = other.body;
    }

    public OrderMessage clone()
    {
        // Serialize the struct to the FBE stream
        var writer = new com.chronoxor.proto.fbe.OrderMessageModel();
        writer.serialize(this);

        // Deserialize the struct from the FBE stream
        var reader = new com.chronoxor.proto.fbe.OrderMessageModel();
        reader.attach(writer.getBuffer());
        return reader.deserialize();
    }

    @Override
    public int compareTo(Object other)
    {
        if (other == null)
            return -1;

        if (!OrderMessage.class.isAssignableFrom(other.getClass()))
            return -1;

        final OrderMessage obj = (OrderMessage)other;

        int result = 0;
        return result;
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
            return false;

        if (!OrderMessage.class.isAssignableFrom(other.getClass()))
            return false;

        final OrderMessage obj = (OrderMessage)other;

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
        sb.append("OrderMessage(");
        sb.append("body="); sb.append(body);
        sb.append(")");
        return sb.toString();
    }

    public String toJson() { return com.chronoxor.proto.fbe.Json.getEngine().toJson(this); }
    public static OrderMessage fromJson(String json) { return com.chronoxor.proto.fbe.Json.getEngine().fromJson(json, OrderMessage.class); }
}
