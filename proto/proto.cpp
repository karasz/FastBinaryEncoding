// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: proto.fbe
// Version: 1.3.0.0

#include "proto.h"

#if defined(_MSC_VER)
#pragma warning(push)
#pragma warning(disable:4065) // C4065: switch statement contains 'default' but no 'case' labels
#pragma warning(disable:4702) // C4702: unreachable code
#endif

namespace proto {

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

} // namespace proto

#if defined(_MSC_VER)
#pragma warning(pop)
#endif
