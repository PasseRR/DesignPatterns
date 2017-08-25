package passerr.github.io.behavioural.templatemethod;

/**
 * 手动档汽车
 * @author xiehai1
 * @date 2017/08/25 18:08
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class ManualGearshiftCar extends AbstractCar {
    @Override
    protected String ignite() {
        return "钥匙点火";
    }

    @Override
    protected String shift() {
        return "挂1挡";
    }
}
