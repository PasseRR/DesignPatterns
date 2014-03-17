package csii.behavioural.memento;

/**
 * ±¸ÍüÂ¼½ÇÉ«
 * @author xiehai
 * @date 2013-9-17 ÏÂÎç02:09:28 
 */
public class Memento {
	/**
	 * ×´Ì¬
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
