package csii.creational.factory.factorymethod;

/**
 * BMW730��Ʒ
 * @author xiehai
 * @date 2013-8-8 ����03:20:37 
 */
public class BMW730 extends BMW {
	private static final String BMW730 = "730";
	public BMW730(){
		this.carType = BMW730;
	}
	@Override
	public void travle() {
		System.err.println("BMW730����.");
	}

}
