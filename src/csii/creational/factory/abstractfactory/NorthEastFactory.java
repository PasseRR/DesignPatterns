package csii.creational.factory.abstractfactory;

/**
 * ������е���쳧
 * @author xiehai
 * @date 2013-8-8 ����03:56:33 
 */
public class NorthEastFactory implements Factory{

	@Override
	public Machine createBus() {
		// TODO Auto-generated method stub
		Machine machine = new Bus();
		machine.setName("������������");
		return machine;
	}

	@Override
	public Machine createCar() {
		Machine machine = new Car();
		machine.setName("��������");
		return machine;
	}

	@Override
	public Machine createTractor() {
		// TODO Auto-generated method stub
		Machine machine = new Tractor();
		machine.setName("����������");
		return machine;
	}

}
