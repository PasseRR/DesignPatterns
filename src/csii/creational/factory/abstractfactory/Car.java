package csii.creational.factory.abstractfactory;

public class Car extends Machine {
	/** 
	 * 运货
	 */
	public  void freight(){
		System.out.println(this.name + "在运货.");
	}
}
