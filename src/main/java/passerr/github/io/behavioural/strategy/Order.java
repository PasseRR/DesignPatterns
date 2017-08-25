package passerr.github.io.behavioural.strategy;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/25 17:04
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Order {
    private BigDecimal amount;
    public Order(BigDecimal amount){
        this.amount = amount;
    }

    public BigDecimal check(DiscountPolicy policy){
        return policy.discount(this.amount);
    }
}
