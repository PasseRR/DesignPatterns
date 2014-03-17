package csii.creational.test;

import csii.creational.factory.abstractfactory.Bus;
import csii.creational.factory.abstractfactory.Car;
import csii.creational.factory.abstractfactory.Factory;
import csii.creational.factory.abstractfactory.NorthEastFactory;
import csii.creational.factory.abstractfactory.SouthWestFactory;
import csii.creational.factory.abstractfactory.Tractor;

/**
 * 抽象工厂测试类
 * @author xiehai
 * @date 2013-8-9 下午01:11:40 
 */
public class Test_AbstractFactory {
	public static void main(String[] args) {
		Factory factory = new NorthEastFactory();
		Bus bus = (Bus) factory.createBus();
		bus.carryPassenger();
		Car car = (Car) factory.createCar();
		car.freight();
		Tractor tractor = (Tractor) factory.createTractor();
		tractor.plough();
		factory = new SouthWestFactory();
		bus = (Bus) factory.createBus();
		bus.carryPassenger();
		car = (Car) factory.createCar();
		car.freight();
		tractor = (Tractor) factory.createTractor();
		tractor.plough();
	}
}
