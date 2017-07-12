package passerr.github.io.creational.factorymethod;

/**
 * @author xiehai1
 * @date 2017/07/12 22:09
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class CarFactory {
    public Car create(Class<? extends Car> clazz){
        try {
            return clazz.newInstance();
        } catch (InstantiationException |IllegalAccessException e) {
            return null;
        }
    }
}
