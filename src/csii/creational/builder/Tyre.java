package csii.creational.builder;

/**
 * ��̥
 * @author xiehai
 * @date 2013-8-8 ����04:38:43 
 */
public abstract class Tyre {
	String tyreName;

	public String getTyreName() {
		return tyreName;
	}

	public void setTyreName(String tyreName) {
		this.tyreName = tyreName;
	}
	
	public String toString(){
		return "��̥:" + this.tyreName;
	}
}
