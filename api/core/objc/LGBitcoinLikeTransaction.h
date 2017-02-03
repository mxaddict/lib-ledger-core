// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from bitcoin_like_wallet.djinni

#import "LGBitcoinLikeBlock.h"
#import "LGBitcoinLikeInput.h"
#import "LGBitcoinLikeOutput.h"
#import <Foundation/Foundation.h>

@interface LGBitcoinLikeTransaction : NSObject
- (nonnull instancetype)initWithInputs:(nonnull NSArray<LGBitcoinLikeInput *> *)inputs
                               outputs:(nonnull NSArray<LGBitcoinLikeOutput *> *)outputs
                                 block:(nullable LGBitcoinLikeBlock *)block
                              lockTime:(int64_t)lockTime
                                  time:(int64_t)time;
+ (nonnull instancetype)BitcoinLikeTransactionWithInputs:(nonnull NSArray<LGBitcoinLikeInput *> *)inputs
                                                 outputs:(nonnull NSArray<LGBitcoinLikeOutput *> *)outputs
                                                   block:(nullable LGBitcoinLikeBlock *)block
                                                lockTime:(int64_t)lockTime
                                                    time:(int64_t)time;

@property (nonatomic, readonly, nonnull) NSArray<LGBitcoinLikeInput *> * inputs;

@property (nonatomic, readonly, nonnull) NSArray<LGBitcoinLikeOutput *> * outputs;

@property (nonatomic, readonly, nullable) LGBitcoinLikeBlock * block;

@property (nonatomic, readonly) int64_t lockTime;

/**fee: Amount; */
@property (nonatomic, readonly) int64_t time;

@end