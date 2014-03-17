package csii.creational.factory.factorymethod;

/**
 * BMW320生产工厂
 * @author xiehai
 * @date 2013-8-8 下午03:20:50 
 */
public class BMW320Factory implements BMWFactory {

	@Override
	public BMW createBMW() {
		// TODO Auto-generated method stub
		return new BMW320();
	}

}
