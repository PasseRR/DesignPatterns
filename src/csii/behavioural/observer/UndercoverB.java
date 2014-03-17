package csii.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 卧底B
 * @author xiehai
 * @date 2013-9-16 下午05:39:25 
 */
public class UndercoverB implements Observer {
	private String time;
	@Override
	public void update(Observable o, Object arg) {
		this.time = (String) arg;
		System.out.println("卧底B接到行动时间:" + this.time);
	}

}
