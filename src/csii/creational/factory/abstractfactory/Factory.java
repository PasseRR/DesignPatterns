package csii.creational.factory.abstractfactory;

public interface Factory {
	/** 
	 * �����������Ĺ���
	 * @return
	 */
	Machine createTractor();
	/** 
	 * �������������Ĺ���
	 * @return
	 */
	Machine createBus();
	/** 
	 * ���������Ĺ���
	 * @return
	 */
	Machine createCar();
}
