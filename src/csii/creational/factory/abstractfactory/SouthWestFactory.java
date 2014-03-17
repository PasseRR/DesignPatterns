package csii.creational.factory.abstractfactory;

public class SouthWestFactory implements Factory {

	@Override
	public Machine createBus() {
		Machine machine = new Bus();
		machine.setName("���Ϲ�������");
		return machine;
	}

	@Override
	public Machine createCar() {
		Machine machine = new Car();
		machine.setName("���ϻ���");
		return machine;
	}

	@Override
	public Machine createTractor() {
		Machine machine = new Tractor();
		machine.setName("����������");
		return machine;
	}

}
