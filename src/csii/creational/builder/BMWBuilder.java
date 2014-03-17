package csii.creational.builder;

public class BMWBuilder implements Builder {
	private Car car = new Car();
	@Override
	public void builderChaire() {
		car.setChair(new USAChair());
	}

	@Override
	public void builderChassis() {
		car.setChassis(new JapanChassis());
	}

	@Override
	public void builderEngine() {
		car.setEngine(new JapanEngine());
	}

	@Override
	public void builderShell() {
		car.setShell(new FranceShell());
	}

	@Override
	public void builderTyre() {
		car.setTyre(new JapanTyre());
	}

	@Override
	public Car getCarInstance() {
		return car;
	}

}
