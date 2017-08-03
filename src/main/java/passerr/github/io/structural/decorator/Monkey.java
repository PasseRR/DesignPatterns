package passerr.github.io.structural.decorator;

/**
 * @author xiehai1
 * @date 2017/08/03 18:03
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Monkey implements TheGreatestSage {
    private TheGreatestSage theGreatestSage;
    public Monkey() {

    }

    public Monkey(TheGreatestSage theGreatestSage) {
        this.theGreatestSage = theGreatestSage;
    }
    @Override
    public String move() {
        StringBuilder sb = new StringBuilder();
        if (null != this.theGreatestSage) {
            sb.append(this.theGreatestSage.move());
            sb.append(" -> ");
        }

        sb.append("monkey");

        return sb.toString();
    }
}
