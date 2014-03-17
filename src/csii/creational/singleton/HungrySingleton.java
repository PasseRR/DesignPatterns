package csii.creational.singleton;

/**
 * ����ģʽ֮����ʽ����
 * @author xiehai
 * @date 2013-8-8 ����02:24:51 
 */
public class HungrySingleton {
	private static final HungrySingleton instance = new HungrySingleton();
	
	/**
	 * ˽�й��췽�� 
	 */
	private HungrySingleton(){
		
	}
	public static HungrySingleton getInstance(){
		return instance;
	}
}
