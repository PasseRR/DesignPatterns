package csii.behavioural.test;

import csii.behavioural.state.GreenState;
import csii.behavioural.state.Light;
import csii.behavioural.state.RedState;
import csii.behavioural.state.State;

/**
 * ״̬ģʽ����
 * @author xiehai
 * @date 2013-9-17 ����02:56:15 
 */
public class Test_State {
	public static void main(String[] args) {
		State state = new GreenState();
		state = new RedState();
		Light light = new Light(state);
		light.work();
	}
}
