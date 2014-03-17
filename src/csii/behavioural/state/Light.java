package csii.behavioural.state;

/**
 * ��ͨ���̵�
 * @author xiehai
 * @date 2013-9-17 ����02:48:22 
 */
public class Light {
	private State state;
	public Light(State state){
		super();
		this.state = state;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	/** 
	 * ��ͨ�Ʊ任
	 */
	public void change(){
		this.state.change(this);
	}
	/** 
	 * ��ͨ�ƹ���
	 */
	public void work(){
//		while(true){
//			this.change();
//		}
		for(int i = 0; i < 10; ++i){
			this.change();
		}
	}
}
