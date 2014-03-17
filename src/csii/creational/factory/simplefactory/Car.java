package csii.creational.factory.simplefactory;

/**
 * 汽车实现机器接口
 * @author xiehai
 * @date 2013-8-8 下午02:40:13 
 */
public class Car implements Machine {
	/**
	 * 汽车类型
	 */
	String carType;
	/**
	 * 汽车功率
	 */
	double carPower;
	
	@Override
	public void travel() {
		// TODO Auto-generated method stub

	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public double getCarPower() {
		return carPower;
	}

	public void setCarPower(double carPower) {
		this.carPower = carPower;
	}
	
	public String toString(){
		return "我是" + this.carType + ", 功率是" + this.carPower + "L";
	}
}
