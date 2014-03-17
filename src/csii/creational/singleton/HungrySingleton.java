package csii.creational.singleton;

/**
 * 单例模式之饿汉式单例
 * @author xiehai
 * @date 2013-8-8 下午02:24:51 
 */
public class HungrySingleton {
	private static final HungrySingleton instance = new HungrySingleton();
	
	/**
	 * 私有构造方法 
	 */
	private HungrySingleton(){
		
	}
	public static HungrySingleton getInstance(){
		return instance;
	}
}
