package csii.structural.bridge;

/**
 * ����
 * @author xiehai
 * @date 2013-9-16 ����11:25:25 
 */
public class Car extends Vehicle {
	@Override
	public void transport() {
		System.out.print("����");
		super.transport();
	}
}
