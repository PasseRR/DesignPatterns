package csii.behavioural.state;

/**
 * 交通红绿灯
 * @author xiehai
 * @date 2013-9-17 下午02:48:22 
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
	 * 交通灯变换
	 */
	public void change(){
		this.state.change(this);
	}
	/** 
	 * 交通灯工作
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
