package csii.creational.factory.abstractfactory;

/**
 * 东北机械制造厂
 * @author xiehai
 * @date 2013-8-8 下午03:56:33 
 */
public class NorthEastFactory implements Factory{

	@Override
	public Machine createBus() {
		// TODO Auto-generated method stub
		Machine machine = new Bus();
		machine.setName("东北公共汽车");
		return machine;
	}

	@Override
	public Machine createCar() {
		Machine machine = new Car();
		machine.setName("东北货车");
		return machine;
	}

	@Override
	public Machine createTractor() {
		// TODO Auto-generated method stub
		Machine machine = new Tractor();
		machine.setName("东北拖拉机");
		return machine;
	}

}
