package passerr.github.io.behavioural.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 水果订单
 * @author xiehai1
 * @date 2017/08/24 15:31
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
@AllArgsConstructor
public class Order {
    private Fruit type;
    private BigDecimal weight;
}
