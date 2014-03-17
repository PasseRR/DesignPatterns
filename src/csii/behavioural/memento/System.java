package csii.behavioural.memento;

/**
 * 系统
 * @author xiehai
 * @date 2013-9-17 下午02:11:45 
 */
public class System {
	private String state;
	/** 
	 * 创建备份
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/** 
	 * 备份还原
	 * @param memento
	 */
	public void recoverMemento(Memento memento){
		this.state = memento.getState();
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
