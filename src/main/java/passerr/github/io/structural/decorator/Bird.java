package passerr.github.io.structural.decorator;

/**
 * @author xiehai1
 * @date 2017/08/03 18:07
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Bird implements TheGreatestSage {
    private TheGreatestSage theGreatestSage;
    public Bird(TheGreatestSage theGreatestSage){
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public String move() {
        StringBuilder sb = new StringBuilder(this.theGreatestSage.move());
        sb.append(" -> ");
        sb.append("bird");

        return sb.toString();
    }
}
