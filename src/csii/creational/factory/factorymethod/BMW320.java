package csii.creational.factory.factorymethod;

/**
 * BMW320��Ʒ
 * @author xiehai
 * @date 2013-8-8 ����03:20:23 
 */
public class BMW320 extends BMW{
	private static final String BMW320 = "320";
	public BMW320(){
		this.carType = BMW320;
	}
	@Override
	public void travle() {
		System.out.println("BMW320����.");
	}

}
