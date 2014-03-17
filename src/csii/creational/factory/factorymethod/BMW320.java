package csii.creational.factory.factorymethod;

/**
 * BMW320产品
 * @author xiehai
 * @date 2013-8-8 下午03:20:23 
 */
public class BMW320 extends BMW{
	private static final String BMW320 = "320";
	public BMW320(){
		this.carType = BMW320;
	}
	@Override
	public void travle() {
		System.out.println("BMW320在跑.");
	}

}
