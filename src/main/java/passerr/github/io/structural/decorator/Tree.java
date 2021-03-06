package passerr.github.io.structural.decorator;

/**
 * @author xiehai1
 * @date 2017/08/03 18:04
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Tree implements TheGreatestSage {
    private TheGreatestSage theGreatestSage;
    public Tree(TheGreatestSage theGreatestSage){
        this.theGreatestSage = theGreatestSage;
    }

    @Override
    public String move() {
        StringBuilder sb = new StringBuilder(this.theGreatestSage.move());
        sb.append(" -> ");
        sb.append("tree");

        return sb.toString();
    }
}
