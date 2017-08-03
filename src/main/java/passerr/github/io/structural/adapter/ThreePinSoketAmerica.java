package passerr.github.io.structural.adapter;

/**
 * @author xiehai1
 * @date 2017/08/03 16:46
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class ThreePinSoketAmerica implements ThreePinSoket {
    @Override
    public String chargeWithThreePin() {
        return "三孔插座";
    }

    @Override
    public int voltage() {
        return 110;
    }
}
