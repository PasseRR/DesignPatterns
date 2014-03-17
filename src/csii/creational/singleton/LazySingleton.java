package csii.creational.singleton;

/**
 * 单例模式之懒汉式单例
 * @author xiehai
 * @date 2013-8-8 下午02:26:57 
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	/**
	 * 私有构造方法 
	 */
	private LazySingleton(){
		
	}
	
	public static synchronized LazySingleton getInstance(){
		if(instance == null){
			instance = new LazySingleton();
		}
		
		return instance;
	}
}
