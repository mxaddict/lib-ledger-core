// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from erc20.djinni

#ifndef DJINNI_GENERATED_ERC20TOKEN_HPP
#define DJINNI_GENERATED_ERC20TOKEN_HPP

#include <cstdint>
#include <iostream>
#include <string>
#include <utility>
#ifndef LIBCORE_EXPORT
    #if defined(_MSC_VER) && _MSC_VER <= 1900
       #include <libcore_export.h>
    #else
       #define LIBCORE_EXPORT
    #endif
#endif

namespace ledger { namespace core { namespace api {

/**Representation of ERC20Tokens */
struct ERC20Token final {
    std::string name;
    std::string symbol;
    std::string contractAddress;
    int32_t numberOfDecimal;

    ERC20Token(std::string name_,
               std::string symbol_,
               std::string contractAddress_,
               int32_t numberOfDecimal_)
    : name(std::move(name_))
    , symbol(std::move(symbol_))
    , contractAddress(std::move(contractAddress_))
    , numberOfDecimal(std::move(numberOfDecimal_))
    {}

    ERC20Token(const ERC20Token& cpy) {
       this->name = cpy.name;
       this->symbol = cpy.symbol;
       this->contractAddress = cpy.contractAddress;
       this->numberOfDecimal = cpy.numberOfDecimal;
    }

    ERC20Token() = default;


    ERC20Token& operator=(const ERC20Token& cpy) {
       this->name = cpy.name;
       this->symbol = cpy.symbol;
       this->contractAddress = cpy.contractAddress;
       this->numberOfDecimal = cpy.numberOfDecimal;
       return *this;
    }

    template <class Archive>
    void load(Archive& archive) {
        archive(name, symbol, contractAddress, numberOfDecimal);
    }

    template <class Archive>
    void save(Archive& archive) const {
        archive(name, symbol, contractAddress, numberOfDecimal);
    }
};

} } }  // namespace ledger::core::api
#endif //DJINNI_GENERATED_ERC20TOKEN_HPP
