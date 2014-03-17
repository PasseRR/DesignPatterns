package csii.creational.builder;

/**
 * 发动机
 * @author xiehai
 * @date 2013-8-8 下午04:40:29 
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
		return "发动机:" + this.engineName;
	}
}
