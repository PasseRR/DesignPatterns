package passerr.github.io.behavioural.strategy;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/25 17:03
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@FunctionalInterface
public interface DiscountPolicy {
    BigDecimal discount(BigDecimal amount);
}
