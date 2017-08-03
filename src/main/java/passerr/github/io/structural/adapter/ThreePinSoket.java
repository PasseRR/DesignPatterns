package passerr.github.io.structural.adapter;

/**
 * 三孔插座
 * @author xiehai1
 * @date 2017/08/03 16:45
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface ThreePinSoket {
    /**
     * 充电
     */
    String chargeWithThreePin();
    /**
     * 电压
     * @return
     */
    int voltage();
}
