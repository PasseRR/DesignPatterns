package csii.creational.factory.abstractfactory;

public class SouthWestFactory implements Factory {

	@Override
	public Machine createBus() {
		Machine machine = new Bus();
		machine.setName("西南公共汽车");
		return machine;
	}

	@Override
	public Machine createCar() {
		Machine machine = new Car();
		machine.setName("西南货车");
		return machine;
	}

	@Override
	public Machine createTractor() {
		Machine machine = new Tractor();
		machine.setName("西南拖拉机");
		return machine;
	}

}
