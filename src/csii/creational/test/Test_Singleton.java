package csii.creational.test;

import csii.creational.singleton.HungrySingleton;
import csii.creational.singleton.LazySingleton;

/**
 * ����������
 * @author xiehai
 * @date 2013-8-9 ����01:12:37 
 */
public class Test_Singleton {
	public static void main(String[] args) {
		HungrySingleton hs = HungrySingleton.getInstance();
		LazySingleton ls = LazySingleton.getInstance();
		hs.toString();
		ls.toString();
		//������Ĺ��췽���ǿ�������,ֻ��ͨ��getInstance��������ȡʵ��
//		HungrySingleton hs2 = new HungrySingleton();
//		LazySingleton ls2 = new LazySingleton();
	}
}
