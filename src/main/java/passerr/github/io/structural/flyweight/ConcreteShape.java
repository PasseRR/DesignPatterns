package passerr.github.io.structural.flyweight;

/**
 * @author xiehai1
 * @date 2017/08/07 13:46
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class ConcreteShape implements Shape {
    private String shape;
    public ConcreteShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String draw(Color color) {
        StringBuilder sb = new StringBuilder();
        sb.append("draw a");
        sb.append(" ");
        sb.append(color.getColor());
        sb.append(" ");
        sb.append(this.shape);

        return sb.toString();
    }
}
