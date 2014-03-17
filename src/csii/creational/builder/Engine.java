package csii.creational.builder;

/**
 * ������
 * @author xiehai
 * @date 2013-8-8 ����04:40:29 
 */
public abstract class Engine {
	String engineName;

	public String getEngineName() {
		return engineName;
	}

	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
	public String toString(){
		return "������:" + this.engineName;
	}
}
