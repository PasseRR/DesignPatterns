package csii.creational.test;

import csii.creational.factory.simplefactory.Car;
import csii.creational.factory.simplefactory.SimpleFactory;
import csii.creational.factory.simplefactory.Tractor;
import csii.creational.factory.simplefactory.Train;

/**
 * 简单工厂测试类
 * @author xiehai
 * @date 2013-8-9 下午01:12:26 
 */
public class Test_SimpleFactory {
	public static void main(String[] args) {
		SimpleFactory sf = new SimpleFactory();
		Car car = (Car) sf.createMachine(SimpleFactory.CAR);
		car.setCarPower(6.0);
		car.setCarType("BMW");
		System.out.println(car);
		Tractor tractor = (Tractor) sf.createMachine(SimpleFactory.TRACTOR);
		tractor.plough();
		Train train = (Train) sf.createMachine(SimpleFactory.TRAIN);
		train.setNodeCount(30);
		train.setTrainNO("K912");
		System.out.println(train);
	}
}
