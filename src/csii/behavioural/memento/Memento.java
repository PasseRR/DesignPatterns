package csii.behavioural.memento;

/**
 * ����¼��ɫ
 * @author xiehai
 * @date 2013-9-17 ����02:09:28 
 */
public class Memento {
	/**
	 * ״̬
	 */
	private String state;
	
	public Memento(String state){
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
}
