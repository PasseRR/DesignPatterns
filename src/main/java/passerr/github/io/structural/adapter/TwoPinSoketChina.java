package passerr.github.io.structural.adapter;

/**
 * @author xiehai1
 * @date 2017/08/03 16:51
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class TwoPinSoketChina implements TwoPinSoket {
    @Override
    public String chargeWithTwoPin() {
        return "两孔插座";
    }
    @Override
    public int voltage() {
        return 220;
    }
}
