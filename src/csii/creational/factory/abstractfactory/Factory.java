package csii.creational.factory.abstractfactory;

public interface Factory {
	/** 
	 * 生产拖拉机的工厂
	 * @return
	 */
	Machine createTractor();
	/** 
	 * 生产公共汽车的工厂
	 * @return
	 */
	Machine createBus();
	/** 
	 * 生产汽车的工厂
	 * @return
	 */
	Machine createCar();
}
