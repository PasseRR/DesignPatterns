package passerr.github.io.behavioural.templatemethod;

/**
 * @author xiehai1
 * @date 2017/08/25 18:01
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public abstract class AbstractCar implements Car {
    @Override
    public String drive() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ignite());
        sb.append(" -> ");
        sb.append(this.shift());
        sb.append(" -> ");
        sb.append(this.advance());

        return sb.toString();
    }

    /**
     * 点火
     * @return
     */
    protected abstract String ignite();

    /**
     * 挂挡
     * @return
     */
    protected abstract String shift();

    /**
     * 前进
     * @return
     */
    protected String advance(){
        return "前进";
    }
}
