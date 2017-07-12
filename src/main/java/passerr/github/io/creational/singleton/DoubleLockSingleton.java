package passerr.github.io.creational.singleton;

/**
 * 双重锁实现
 * @author xiehai1
 * @date 2017/07/12 20:33
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton instance;
    private DoubleLockSingleton(){

    }

    public static DoubleLockSingleton getInstance(){
        if(null == instance){
            synchronized (DoubleLockSingleton.class){
                if(null == instance){
                    instance = new DoubleLockSingleton();
                }
            }
        }

        return instance;
    }
}
