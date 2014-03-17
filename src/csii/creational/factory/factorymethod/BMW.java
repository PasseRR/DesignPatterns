package csii.creational.factory.factorymethod;

/**
 * 宝马汽车
 * @author xiehai
 * @date 2013-8-8 下午03:08:00 
 */
public abstract class BMW {
	/**
	 * 车类型
	 */
	String carType;
	/**
	 * 车颜色
	 */
	String carColor;
	/** 
	 * 汽车行走
	 */
	public abstract void travle();
	/** 
	 * 车的介绍
	 */
	public void someoneIntruduct(){
		System.out.println("这是一辆"+ this.carColor +"的BMW" + this.carType);
	}
	public String toString(){
		return "车型号:" + this.carType + ",颜色:" + this.carColor;
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
