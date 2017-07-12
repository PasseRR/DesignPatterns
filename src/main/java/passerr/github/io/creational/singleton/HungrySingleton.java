package passerr.github.io.creational.singleton;

/**
 * 饿汉式
 * @author xiehai1
 * @date 2017/07/12 20:30
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class HungrySingleton {
    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder{
        private static final HungrySingleton INSTANCE = new HungrySingleton();
    }
}
