package csii.creational.factory.factorymethod;

public class BMW730Factory implements BMWFactory {

	@Override
	public BMW createBMW() {
		return new BMW730();
	}

}
