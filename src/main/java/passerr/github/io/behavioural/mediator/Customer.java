package passerr.github.io.behavioural.mediator;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/11 18:06
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Customer implements Teller {
    @Getter
    private BigDecimal cash;

    public Customer(BigDecimal cash) {
        this.cash = cash;
    }

    @Override
    public void withdraw(String account, BigDecimal amount) {
        // Atm取钱 客户现金增加
        this.cash = this.cash.add(amount);
    }

    @Override
    public void deposit(String account, BigDecimal amount) {
        // Atm存钱 客户现金减少
        this.cash = this.cash.subtract(amount);
    }
}
