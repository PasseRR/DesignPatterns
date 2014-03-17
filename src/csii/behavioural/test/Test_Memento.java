package csii.behavioural.test;

import csii.behavioural.memento.System;
import csii.behavioural.memento.User;

/**
 * ±¸ÍüÂ¼²âÊÔ
 * @author xiehai
 * @date 2013-9-17 ÏÂÎç02:16:19 
 */
public class Test_Memento {
	public static void main(String[] args) {
		System sys = new System();
		User user = new User();
		sys.setState("on");
		user.saveMemento(sys.createMemento());
		java.lang.System.out.println(sys.getState());
		
		sys.setState("off");
		user.retrieveMemento();
		java.lang.System.out.println(sys.getState());
	}
}
