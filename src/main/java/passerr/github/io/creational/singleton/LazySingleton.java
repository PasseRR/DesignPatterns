package passerr.github.io.creational.singleton;

/**
 * 懒汉式
 * @author xiehai1
 * @date 2017/07/12 20:28
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton(){

    }

    public static synchronized LazySingleton getInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }

        return instance;
    }
}
