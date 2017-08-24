package passerr.github.io.behavioural.observer;

import lombok.Getter;

import java.math.BigDecimal;

/**
 * 水果种类及单价
 * @author xiehai1
 * @date 2017/08/24 15:31
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Getter
public enum Fruit {
    APPLE("苹果", new BigDecimal("2")),
    ORANGE("桔子", new BigDecimal("1.5")),
    GRAPE("葡萄", new BigDecimal("3")),
    PLUM("李子", new BigDecimal("6.5"));

    private String name;
    private BigDecimal unitPrice;
    Fruit(String name, BigDecimal unitPrice){
        this.name = name;
        this.unitPrice = unitPrice;
    }
}
