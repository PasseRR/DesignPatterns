package csii.creational.factory.factorymethod;

/**
 * ��������
 * @author xiehai
 * @date 2013-8-8 ����03:08:00 
 */
public abstract class BMW {
	/**
	 * ������
	 */
	String carType;
	/**
	 * ����ɫ
	 */
	String carColor;
	/** 
	 * ��������
	 */
	public abstract void travle();
	/** 
	 * ���Ľ���
	 */
	public void someoneIntruduct(){
		System.out.println("����һ��"+ this.carColor +"��BMW" + this.carType);
	}
	public String toString(){
		return "���ͺ�:" + this.carType + ",��ɫ:" + this.carColor;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
}
