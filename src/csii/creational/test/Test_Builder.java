package csii.creational.test;

import csii.creational.builder.BMWBuilder;
import csii.creational.builder.BenzBuilder;
import csii.creational.builder.Builder;
import csii.creational.builder.Car;
import csii.creational.builder.CarMarket;

/**
 * �����߲�����
 * @author xiehai
 * @date 2013-8-9 ����01:11:53 
 */
public class Test_Builder {
	public static void main(String[] args) {
		Builder bmw = new BMWBuilder();
		Car car = new CarMarket(bmw).getCar();
		System.out.println(car);
		Builder benz = new BenzBuilder();
		car = new CarMarket(benz).getCar();
		System.out.println(car);
	}
}
