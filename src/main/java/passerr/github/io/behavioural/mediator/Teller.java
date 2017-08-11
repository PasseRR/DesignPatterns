package passerr.github.io.behavioural.mediator;

import java.math.BigDecimal;

/**
 * 虚拟出纳
 * @author xiehai1
 * @date 2017/08/11 18:00
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface Teller {
    /**
     * 取钱操作
     * @param account 卡号
     * @param amount 金额
     */
    void withdraw(String account, BigDecimal amount);
    /**
     * 存钱操作
     * @param account 卡号
     * @param amount 金额
     */
    void deposit(String account, BigDecimal amount);
}
