package passerr.github.io.behavioural.visitor;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/29 13:59
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
public class Order {
    /**
     * 周几 1~7 周一~周日
     */
    private int dayOfWeek;
    /**
     * 金额
     */
    private BigDecimal amount;
}