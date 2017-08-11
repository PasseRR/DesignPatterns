package passerr.github.io.behavioural.mediator;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/11 17:54
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Bank implements Teller {
    @Getter
    private BigDecimal balance;

    public Bank(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(String account, BigDecimal amount) {
        // 客户取钱 银行余额减少
        this.balance = this.balance.subtract(amount);
    }

    @Override
    public void deposit(String account, BigDecimal amount) {
        // 客户存钱 银行余额增加
        this.balance = this.balance.add(amount);
    }
}
