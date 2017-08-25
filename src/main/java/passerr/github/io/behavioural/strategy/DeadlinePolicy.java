package passerr.github.io.behavioural.strategy;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/25 17:17
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class DeadlinePolicy implements DiscountPolicy {
    @Override
    public BigDecimal discount(BigDecimal amount) {
        // 临期6折
        return amount.multiply(new BigDecimal("0.6"));
    }
}
