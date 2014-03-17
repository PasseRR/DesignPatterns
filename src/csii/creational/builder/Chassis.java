package csii.creational.builder;

/**
 * ����
 * @author xiehai
 * @date 2013-8-8 ����04:40:07 
 */
public abstract class Chassis {
	String chassisName;

	public String getChassisName() {
		return chassisName;
	}

	public void setChassisName(String chassisName) {
		this.chassisName = chassisName;
	}
	
	public String toString(){
		return "����:" + this.chassisName;
	}
}
