package csii.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 卧底A
 * @author xiehai
 * @date 2013-9-16 下午05:39:17 
 */
public class UndercoverA implements Observer {
	private String time;
	@Override
	public void update(Observable o, Object arg) {
		this.time = (String) arg;
		System.out.println("卧底A接到行动时间:" + this.time);
	}

}
