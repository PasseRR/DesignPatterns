package passerr.github.io.creational.abstractfactory;

/**
 * @author xiehai1
 * @date 2017/07/13 13:15
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class HaierTvFactory implements TvFactory {
    @Override
    public Tv create21InchTv() {
        return new Haier21InchTv();
    }

    @Override
    public Tv create50InchTv() {
        return new Haier50InchTv();
    }
}
