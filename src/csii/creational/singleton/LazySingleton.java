package csii.creational.singleton;

/**
 * ����ģʽ֮����ʽ����
 * @author xiehai
 * @date 2013-8-8 ����02:26:57 
 */
public class LazySingleton {
	private static LazySingleton instance = null;
	/**
	 * ˽�й��췽�� 
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
