// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: protoex.fbe
// Version: 1.3.0.0

#include "protoex_final_protocol.h"

#if defined(_MSC_VER)
#pragma warning(push)
#pragma warning(disable:4065) // C4065: switch statement contains 'default' but no 'case' labels
#pragma warning(disable:4702) // C4702: unreachable code
#endif

namespace FBE {

namespace protoex {

size_t FinalSender::send(const ::protoex::OrderMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = OrderMessageModel.serialize(value);
    assert((serialized > 0) && "protoex::OrderMessage serialization failed!");
    assert(OrderMessageModel.verify() && "protoex::OrderMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

size_t FinalSender::send(const ::protoex::BalanceMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = BalanceMessageModel.serialize(value);
    assert((serialized > 0) && "protoex::BalanceMessage serialization failed!");
    assert(BalanceMessageModel.verify() && "protoex::BalanceMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

size_t FinalSender::send(const ::protoex::AccountMessage& value)
{
    // Serialize the value into the FBE stream
    size_t serialized = AccountMessageModel.serialize(value);
    assert((serialized > 0) && "protoex::AccountMessage serialization failed!");
    assert(AccountMessageModel.verify() && "protoex::AccountMessage validation failed!");

    // Log the value
    if (this->_logging)
    {
        std::string message = value.string();
        this->onSendLog(message);
    }

    // Send the serialized value
    return this->send_serialized(serialized);
}

bool FinalReceiver::onReceive(size_t type, const void* data, size_t size)
{
    switch (type)
    {
        case FBE::protoex::OrderMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            OrderMessageModel.attach(data, size);
            assert(OrderMessageModel.verify() && "protoex::OrderMessage validation failed!");
            [[maybe_unused]] size_t deserialized = OrderMessageModel.deserialize(OrderMessageValue);
            assert((deserialized > 0) && "protoex::OrderMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = OrderMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(OrderMessageValue);
            return true;
        }
        case FBE::protoex::BalanceMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            BalanceMessageModel.attach(data, size);
            assert(BalanceMessageModel.verify() && "protoex::BalanceMessage validation failed!");
            [[maybe_unused]] size_t deserialized = BalanceMessageModel.deserialize(BalanceMessageValue);
            assert((deserialized > 0) && "protoex::BalanceMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = BalanceMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(BalanceMessageValue);
            return true;
        }
        case FBE::protoex::AccountMessageFinalModel::fbe_type():
        {
            // Deserialize the value from the FBE stream
            AccountMessageModel.attach(data, size);
            assert(AccountMessageModel.verify() && "protoex::AccountMessage validation failed!");
            [[maybe_unused]] size_t deserialized = AccountMessageModel.deserialize(AccountMessageValue);
            assert((deserialized > 0) && "protoex::AccountMessage deserialization failed!");

            // Log the value
            if (this->_logging)
            {
                std::string message = AccountMessageValue.string();
                this->onReceiveLog(message);
            }

            // Call receive handler with deserialized value
            onReceive(AccountMessageValue);
            return true;
        }
        default: break;
    }

    if (proto::FinalReceiver::onReceive(type, data, size))
        return true;

    return false;
}

void FinalClient::reset_requests()
{
    proto::FinalClient::reset_requests();
}

void FinalClient::watchdog_requests(uint64_t utc)
{
    proto::FinalClient::watchdog_requests(utc);

}

} // namespace protoex

} // namespace FBE

#if defined(_MSC_VER)
#pragma warning(pop)
#endif
