package passerr.github.io.creational.abstractfactory;

/**
 * @author xiehai1
 * @date 2017/07/13 13:16
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class SonyTvFactory implements TvFactory {
    @Override
    public Tv create21InchTv() {
        return new Sony21InchTv();
    }

    @Override
    public Tv create50InchTv() {
        return new Sony50InchTv();
    }
}
