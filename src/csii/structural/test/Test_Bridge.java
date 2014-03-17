package csii.structural.test;

import csii.structural.bridge.Car;
import csii.structural.bridge.Train;
import csii.structural.bridge.TransportGoods;
import csii.structural.bridge.TransportPassenger;

/**
 * ����ģʽ������
 * @author xiehai
 * @date 2013-9-16 ����05:44:18 
 */
public class Test_Bridge {
	public static void main(String[] args) {
		Car car = new Car();
		car.setTransport(new TransportGoods());
		car.transport();
		car.setTransport(new TransportPassenger());
		car.transport();
		
		Train train = new Train();
		train.setTransport(new TransportPassenger());
		train.transport();
		train.setTransport(new TransportGoods());
		train.transport();
	}
}
