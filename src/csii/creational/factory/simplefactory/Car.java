package csii.creational.factory.simplefactory;

/**
 * ����ʵ�ֻ����ӿ�
 * @author xiehai
 * @date 2013-8-8 ����02:40:13 
 */
public class Car implements Machine {
	/**
	 * ��������
	 */
	String carType;
	/**
	 * ��������
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
		return "����" + this.carType + ", ������" + this.carPower + "L";
	}
}
