package csii.creational.builder;

/**
 * ���
 * @author xiehai
 * @date 2013-8-8 ����04:42:03 
 */
public abstract class Shell {
	String shellName;

	public String getShellName() {
		return shellName;
	}

	public void setShellName(String shellName) {
		this.shellName = shellName;
	}
	
	public String toString(){
		return "���:" + this.shellName;
	}
}
