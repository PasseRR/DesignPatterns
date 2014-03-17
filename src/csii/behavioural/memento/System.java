package csii.behavioural.memento;

/**
 * ϵͳ
 * @author xiehai
 * @date 2013-9-17 ����02:11:45 
 */
public class System {
	private String state;
	/** 
	 * ��������
	 * @return
	 */
	public Memento createMemento(){
		return new Memento(this.state);
	}
	
	/** 
	 * ���ݻ�ԭ
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
