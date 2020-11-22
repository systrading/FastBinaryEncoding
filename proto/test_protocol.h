// Automatically generated by the Fast Binary Encoding compiler, do not modify!
// https://github.com/chronoxor/FastBinaryEncoding
// Source: test.fbe
// Version: 1.5.0.0

#pragma once

#if defined(__clang__)
#pragma clang system_header
#elif defined(__GNUC__)
#pragma GCC system_header
#elif defined(_MSC_VER)
#pragma system_header
#endif

#include "fbe_protocol.h"

#include "test_models.h"

#include "proto_protocol.h"

namespace FBE {

namespace test {

// Fast Binary Encoding test protocol version
struct ProtocolVersion
{
    // Protocol major version
    static const int major = 123;
    // Protocol minor version
    static const int minor = 456;
};

// Fast Binary Encoding test sender
class Sender : public virtual FBE::Sender
    , public virtual proto::Sender
{
public:
    Sender()
    {}
    Sender(const Sender&) = default;
    Sender(Sender&&) noexcept = default;
    virtual ~Sender() = default;

    Sender& operator=(const Sender&) = default;
    Sender& operator=(Sender&&) noexcept = default;

    // Imported senders
    proto::Sender& proto_sender() noexcept { return *this; }

public:
    // Sender models accessors
};

// Fast Binary Encoding test receiver
class Receiver : public virtual FBE::Receiver
    , public virtual proto::Receiver
{
public:
    Receiver() {}
    Receiver(const Receiver&) = default;
    Receiver(Receiver&&) = default;
    virtual ~Receiver() = default;

    Receiver& operator=(const Receiver&) = default;
    Receiver& operator=(Receiver&&) = default;

protected:
    // Receive handlers

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override;

private:
    // Receiver values accessors

    // Receiver models accessors
};

// Fast Binary Encoding test proxy
class Proxy : public virtual FBE::Receiver
    , public virtual proto::Proxy
{
public:
    Proxy() {}
    Proxy(const Proxy&) = default;
    Proxy(Proxy&&) = default;
    virtual ~Proxy() = default;

    Proxy& operator=(const Proxy&) = default;
    Proxy& operator=(Proxy&&) = default;

protected:
    // Proxy handlers

    // Receive message handler
    bool onReceive(size_t type, const void* data, size_t size) override;

private:
    // Proxy models accessors
};

// Fast Binary Encoding test client
class Client : public virtual Sender, protected virtual Receiver
    , public virtual proto::Client
{
public:
    typedef proto::Client protoClient;

    Client() = default;
    Client(const Client&) = default;
    Client(Client&&) = default;
    virtual ~Client() = default;

    Client& operator=(const Client&) = default;
    Client& operator=(Client&&) = default;

    // Imported clients
    proto::Client& proto_client() noexcept { return *this; }

    // Reset client buffers
    void reset() { std::scoped_lock locker(this->_lock); reset_requests(); }

    // Watchdog for timeouts
    void watchdog(uint64_t utc) { std::scoped_lock locker(this->_lock); watchdog_requests(utc); }

protected:
    // Reset client requests
    virtual void reset_requests();

    // Watchdog client requests for timeouts
    virtual void watchdog_requests(uint64_t utc);
};

} // namespace test

} // namespace FBE
