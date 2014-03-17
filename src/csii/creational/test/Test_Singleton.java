package csii.creational.test;

import csii.creational.singleton.HungrySingleton;
import csii.creational.singleton.LazySingleton;

/**
 * 单例测试类
 * @author xiehai
 * @date 2013-8-9 下午01:12:37 
 */
public class Test_Singleton {
	public static void main(String[] args) {
		HungrySingleton hs = HungrySingleton.getInstance();
		LazySingleton ls = LazySingleton.getInstance();
		hs.toString();
		ls.toString();
		//两个类的构造方法是看不见的,只能通过getInstance方法来获取实例
//		HungrySingleton hs2 = new HungrySingleton();
//		LazySingleton ls2 = new LazySingleton();
	}
}
