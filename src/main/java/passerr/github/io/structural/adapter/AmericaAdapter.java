package passerr.github.io.structural.adapter;

/**
 * 三孔转两孔插座适配器
 * @author xiehai1
 * @date 2017/08/03 16:52
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class AmericaAdapter implements TwoPinSoket {
    private ThreePinSoket threePinSoket;
    public AmericaAdapter(ThreePinSoket threePinSoket){
        this.threePinSoket = threePinSoket;
    }

    @Override
    public String chargeWithTwoPin() {
        return this.threePinSoket.chargeWithThreePin();
    }

    @Override
    public int voltage() {
        return this.threePinSoket.voltage() * 2;
    }
}
