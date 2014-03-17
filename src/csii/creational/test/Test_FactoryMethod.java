package csii.creational.test;

import csii.creational.factory.factorymethod.BMW;
import csii.creational.factory.factorymethod.BMW320Factory;
import csii.creational.factory.factorymethod.BMW730Factory;
import csii.creational.factory.factorymethod.BMWFactory;

/**
 * ��������������
 * @author xiehai
 * @date 2013-8-9 ����01:12:07 
 */
public class Test_FactoryMethod {
	public static void main(String[] args) {
		BMWFactory factory = new BMW320Factory();
		BMW bmw = factory.createBMW();
		bmw.setCarColor("��ɫ");
		bmw.someoneIntruduct();
		factory = new BMW730Factory();
		bmw = factory.createBMW();
		bmw.setCarColor("��ɫ");
		bmw.someoneIntruduct();
	}
}
