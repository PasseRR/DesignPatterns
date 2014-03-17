package csii.creational.factory.factorymethod;

/**
 * BMW320��������
 * @author xiehai
 * @date 2013-8-8 ����03:20:50 
 */
public class BMW320Factory implements BMWFactory {

	@Override
	public BMW createBMW() {
		// TODO Auto-generated method stub
		return new BMW320();
	}

}
