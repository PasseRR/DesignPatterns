package csii.creational.builder;

public class BenzBuilder implements Builder {
	private Car car = new Car();
	@Override
	public void builderChaire() {
		car.setChair(new ChinaChair());
	}

	@Override
	public void builderChassis() {
		car.setChassis(new EnglandChassis());
	}

	@Override
	public void builderEngine() {
		car.setEngine(new USAEngine());
	}

	@Override
	public void builderShell() {
		car.setShell(new ChinaShell());
	}

	@Override
	public void builderTyre() {
		car.setTyre(new JapanTyre());
	}

	@Override
	public Car getCarInstance() {
		// TODO Auto-generated method stub
		return car;
	}

}
