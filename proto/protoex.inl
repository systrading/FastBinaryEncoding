// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.5.0.0

namespace protoex {

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, OrderSide value)
{
    if (value == OrderSide::buy) { stream << "buy"; return stream; }
    if (value == OrderSide::sell) { stream << "sell"; return stream; }
    if (value == OrderSide::tell) { stream << "tell"; return stream; }
    stream << "<unknown>";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, OrderType value)
{
    if (value == OrderType::market) { stream << "market"; return stream; }
    if (value == OrderType::limit) { stream << "limit"; return stream; }
    if (value == OrderType::stop) { stream << "stop"; return stream; }
    if (value == OrderType::stoplimit) { stream << "stoplimit"; return stream; }
    stream << "<unknown>";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, StateEx value)
{
    bool first = true;
    if ((value & StateEx::unknown) && ((value & StateEx::unknown) == StateEx::unknown))
    {
        stream << (first ? "" : "|") << "unknown";
        first = false;
    }
    if ((value & StateEx::invalid) && ((value & StateEx::invalid) == StateEx::invalid))
    {
        stream << (first ? "" : "|") << "invalid";
        first = false;
    }
    if ((value & StateEx::initialized) && ((value & StateEx::initialized) == StateEx::initialized))
    {
        stream << (first ? "" : "|") << "initialized";
        first = false;
    }
    if ((value & StateEx::calculated) && ((value & StateEx::calculated) == StateEx::calculated))
    {
        stream << (first ? "" : "|") << "calculated";
        first = false;
    }
    if ((value & StateEx::broken) && ((value & StateEx::broken) == StateEx::broken))
    {
        stream << (first ? "" : "|") << "broken";
        first = false;
    }
    if ((value & StateEx::happy) && ((value & StateEx::happy) == StateEx::happy))
    {
        stream << (first ? "" : "|") << "happy";
        first = false;
    }
    if ((value & StateEx::sad) && ((value & StateEx::sad) == StateEx::sad))
    {
        stream << (first ? "" : "|") << "sad";
        first = false;
    }
    if ((value & StateEx::good) && ((value & StateEx::good) == StateEx::good))
    {
        stream << (first ? "" : "|") << "good";
        first = false;
    }
    if ((value & StateEx::bad) && ((value & StateEx::bad) == StateEx::bad))
    {
        stream << (first ? "" : "|") << "bad";
        first = false;
    }
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Order& value)
{
    stream << "Order(";
    stream << "id="; stream << value.id;
    stream << ",symbol="; stream << "\"" << value.symbol << "\"";
    stream << ",side="; stream << value.side;
    stream << ",type="; stream << value.type;
    stream << ",price="; stream << value.price;
    stream << ",volume="; stream << value.volume;
    stream << ",tp="; stream << value.tp;
    stream << ",sl="; stream << value.sl;
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Balance& value)
{
    stream << "Balance(";
    stream << (const ::proto::Balance&)value;
    stream << ",locked="; stream << value.locked;
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const Account& value)
{
    stream << "Account(";
    stream << "id="; stream << value.id;
    stream << ",name="; stream << "\"" << value.name << "\"";
    stream << ",state="; stream << value.state;
    stream << ",wallet="; stream << value.wallet;
    stream << ",asset="; if (value.asset) stream << *value.asset; else stream << "null";
    {
        bool first = true;
        stream << ",orders=[" << value.orders.size() << "][";
        for (const auto& it : value.orders)
        {
            stream << std::string(first ? "" : ",") << it;
            first = false;
        }
        stream << "]";
    }
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const OrderMessage& value)
{
    stream << "OrderMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const BalanceMessage& value)
{
    stream << "BalanceMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

template <class TOutputStream>
inline TOutputStream& operator<<(TOutputStream& stream, const AccountMessage& value)
{
    stream << "AccountMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

} // namespace protoex
