package passerr.github.io.behavioural.strategy;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/25 17:16
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class NormalPolicy implements DiscountPolicy {
    @Override
    public BigDecimal discount(BigDecimal amount) {
        return amount;
    }
}
