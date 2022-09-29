//------------------------------------------------------------------------------
// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// FBE version: 1.14.0.0
//------------------------------------------------------------------------------

#include "proto.h"

namespace proto {

std::ostream& operator<<(std::ostream& stream, OrderSide value)
{
    if (value == OrderSide::buy) return stream << "buy";
    if (value == OrderSide::sell) return stream << "sell";
    return stream << "<unknown>";
}

std::ostream& operator<<(std::ostream& stream, OrderType value)
{
    if (value == OrderType::market) return stream << "market";
    if (value == OrderType::limit) return stream << "limit";
    if (value == OrderType::stop) return stream << "stop";
    return stream << "<unknown>";
}

std::ostream& operator<<(std::ostream& stream, State value)
{
    bool first = true;
    if ((value & State::unknown) && ((value & State::unknown) == State::unknown))
    {
        stream << (first ? "" : "|") << "unknown";
        first = false;
    }
    if ((value & State::invalid) && ((value & State::invalid) == State::invalid))
    {
        stream << (first ? "" : "|") << "invalid";
        first = false;
    }
    if ((value & State::initialized) && ((value & State::initialized) == State::initialized))
    {
        stream << (first ? "" : "|") << "initialized";
        first = false;
    }
    if ((value & State::calculated) && ((value & State::calculated) == State::calculated))
    {
        stream << (first ? "" : "|") << "calculated";
        first = false;
    }
    if ((value & State::broken) && ((value & State::broken) == State::broken))
    {
        stream << (first ? "" : "|") << "broken";
        first = false;
    }
    if ((value & State::good) && ((value & State::good) == State::good))
    {
        stream << (first ? "" : "|") << "good";
        first = false;
    }
    if ((value & State::bad) && ((value & State::bad) == State::bad))
    {
        stream << (first ? "" : "|") << "bad";
        first = false;
    }
    return stream;
}

Order::Order()
    : id((int32_t)0ll)
    , symbol()
    , side()
    , type()
    , price((double)0.0)
    , volume((double)0.0)
{}

Order::Order(int32_t arg_id, const std::string& arg_symbol, const ::proto::OrderSide& arg_side, const ::proto::OrderType& arg_type, double arg_price, double arg_volume)
    : id(arg_id)
    , symbol(arg_symbol)
    , side(arg_side)
    , type(arg_type)
    , price(arg_price)
    , volume(arg_volume)
{}

bool Order::operator==(const Order& other) const noexcept
{
    return (
        (id == other.id)
        );
}

bool Order::operator<(const Order& other) const noexcept
{
    if (id < other.id)
        return true;
    if (other.id < id)
        return false;
    return false;
}

void Order::swap(Order& other) noexcept
{
    using std::swap;
    swap(id, other.id);
    swap(symbol, other.symbol);
    swap(side, other.side);
    swap(type, other.type);
    swap(price, other.price);
    swap(volume, other.volume);
}

std::ostream& operator<<(std::ostream& stream, const Order& value)
{
    stream << "Order(";
    stream << "id="; stream << value.id;
    stream << ",symbol="; stream << "\"" << value.symbol << "\"";
    stream << ",side="; stream << value.side;
    stream << ",type="; stream << value.type;
    stream << ",price="; stream << value.price;
    stream << ",volume="; stream << value.volume;
    stream << ")";
    return stream;
}

Balance::Balance()
    : currency()
    , amount((double)0.0)
{}

Balance::Balance(const std::string& arg_currency, double arg_amount)
    : currency(arg_currency)
    , amount(arg_amount)
{}

bool Balance::operator==(const Balance& other) const noexcept
{
    return (
        (currency == other.currency)
        );
}

bool Balance::operator<(const Balance& other) const noexcept
{
    if (currency < other.currency)
        return true;
    if (other.currency < currency)
        return false;
    return false;
}

void Balance::swap(Balance& other) noexcept
{
    using std::swap;
    swap(currency, other.currency);
    swap(amount, other.amount);
}

std::ostream& operator<<(std::ostream& stream, const Balance& value)
{
    stream << "Balance(";
    stream << "currency="; stream << "\"" << value.currency << "\"";
    stream << ",amount="; stream << value.amount;
    stream << ")";
    return stream;
}

Account::Account()
    : id((int32_t)0ll)
    , name()
    , state(State::initialized  |  State::bad)
    , wallet()
    , asset()
    , orders()
{}

Account::Account(int32_t arg_id, const std::string& arg_name, const ::proto::State& arg_state, const ::proto::Balance& arg_wallet, const std::optional<::proto::Balance>& arg_asset, const std::vector<::proto::Order>& arg_orders)
    : id(arg_id)
    , name(arg_name)
    , state(arg_state)
    , wallet(arg_wallet)
    , asset(arg_asset)
    , orders(arg_orders)
{}

bool Account::operator==(const Account& other) const noexcept
{
    return (
        (id == other.id)
        );
}

bool Account::operator<(const Account& other) const noexcept
{
    if (id < other.id)
        return true;
    if (other.id < id)
        return false;
    return false;
}

void Account::swap(Account& other) noexcept
{
    using std::swap;
    swap(id, other.id);
    swap(name, other.name);
    swap(state, other.state);
    swap(wallet, other.wallet);
    swap(asset, other.asset);
    swap(orders, other.orders);
}

std::ostream& operator<<(std::ostream& stream, const Account& value)
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

OrderMessage::OrderMessage()
    : body()
{}

OrderMessage::OrderMessage(const ::proto::Order& arg_body)
    : body(arg_body)
{}

bool OrderMessage::operator==(const OrderMessage& other) const noexcept
{
    return (
        true
        );
}

bool OrderMessage::operator<(const OrderMessage& other) const noexcept
{
    return false;
}

void OrderMessage::swap(OrderMessage& other) noexcept
{
    using std::swap;
    swap(body, other.body);
}

std::ostream& operator<<(std::ostream& stream, const OrderMessage& value)
{
    stream << "OrderMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

BalanceMessage::BalanceMessage()
    : body()
{}

BalanceMessage::BalanceMessage(const ::proto::Balance& arg_body)
    : body(arg_body)
{}

bool BalanceMessage::operator==(const BalanceMessage& other) const noexcept
{
    return (
        true
        );
}

bool BalanceMessage::operator<(const BalanceMessage& other) const noexcept
{
    return false;
}

void BalanceMessage::swap(BalanceMessage& other) noexcept
{
    using std::swap;
    swap(body, other.body);
}

std::ostream& operator<<(std::ostream& stream, const BalanceMessage& value)
{
    stream << "BalanceMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

AccountMessage::AccountMessage()
    : body()
{}

AccountMessage::AccountMessage(const ::proto::Account& arg_body)
    : body(arg_body)
{}

bool AccountMessage::operator==(const AccountMessage& other) const noexcept
{
    return (
        true
        );
}

bool AccountMessage::operator<(const AccountMessage& other) const noexcept
{
    return false;
}

void AccountMessage::swap(AccountMessage& other) noexcept
{
    using std::swap;
    swap(body, other.body);
}

std::ostream& operator<<(std::ostream& stream, const AccountMessage& value)
{
    stream << "AccountMessage(";
    stream << "body="; stream << value.body;
    stream << ")";
    return stream;
}

} // namespace proto
