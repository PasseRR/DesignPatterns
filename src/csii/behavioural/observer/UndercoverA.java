package csii.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �Ե�A
 * @author xiehai
 * @date 2013-9-16 ����05:39:17 
 */
public class UndercoverA implements Observer {
	private String time;
	@Override
	public void update(Observable o, Object arg) {
		this.time = (String) arg;
		System.out.println("�Ե�A�ӵ��ж�ʱ��:" + this.time);
	}

}
