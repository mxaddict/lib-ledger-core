// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from emitter.djinni

#ifndef DJINNI_GENERATED_EVENTBUS_HPP
#define DJINNI_GENERATED_EVENTBUS_HPP

#include <memory>

namespace ledger { namespace core { namespace api {

class EventReceiver;
class ExecutionContext;

class EventBus {
public:
    virtual ~EventBus() {}

    virtual void subscribe(const std::shared_ptr<ExecutionContext> & context, const std::shared_ptr<EventReceiver> & receiver) = 0;

    virtual void unsubscribe(const std::shared_ptr<EventReceiver> & receiver) = 0;
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_EVENTBUS_HPP
