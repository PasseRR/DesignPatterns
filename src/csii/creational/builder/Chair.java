package csii.creational.builder;

/**
 * ����
 * @author xiehai
 * @date 2013-8-8 ����04:41:23 
 */
public abstract class Chair {
	String chairName;

	public String getChairName() {
		return chairName;
	}

	public void setChairName(String chairName) {
		this.chairName = chairName;
	}
	
	public String toString(){
		return "����:" + this.chairName;
	}
}
