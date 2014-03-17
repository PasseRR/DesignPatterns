package csii.behavioural.test;

import csii.behavioural.visitor.Body;
import csii.behavioural.visitor.Car;
import csii.behavioural.visitor.Engine;
import csii.behavioural.visitor.PrintVisitor;
import csii.behavioural.visitor.Wheel;

/**
 * 访问者模式测试
 * @author xiehai
 * @date 2013-9-17 下午04:26:31 
 */
public class Test_Visitor {
	public static void main(String[] args) {
		Car car = new Car(new Engine(), new Body(), new Wheel());
		car.accept(new PrintVisitor());
	}
}
