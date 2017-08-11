package passerr.github.io.behavioural.mediator;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/11 18:08
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Atm implements Teller {
    private Bank bank;
    private Customer customer;

    public Atm(Bank bank, Customer customer) {
        this.bank = bank;
        this.customer = customer;
    }

    @Override
    public void withdraw(String account, BigDecimal amount) {
        this.bank.withdraw(account, amount);
        this.customer.withdraw(account, amount);
    }

    @Override
    public void deposit(String account, BigDecimal amount) {
        this.bank.deposit(account, amount);
        this.customer.deposit(account, amount);
    }
}
