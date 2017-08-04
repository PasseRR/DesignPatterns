package passerr.github.io.structural.proxy.statical;

/**
 * @author xiehai1
 * @date 2017/08/04 10:50
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Student implements Renting {
    @Override
    public String rent() {
        return "student rent";
    }
}
