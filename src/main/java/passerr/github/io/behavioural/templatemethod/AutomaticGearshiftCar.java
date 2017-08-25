package passerr.github.io.behavioural.templatemethod;

/**
 * 自动档汽车
 * @author xiehai1
 * @date 2017/08/25 18:09
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class AutomaticGearshiftCar extends AbstractCar {
    @Override
    protected String ignite() {
        return "按钮点火";
    }

    @Override
    protected String shift() {
        return "挂D挡";
    }
}
