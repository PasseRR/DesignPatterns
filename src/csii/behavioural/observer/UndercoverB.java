package csii.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * �Ե�B
 * @author xiehai
 * @date 2013-9-16 ����05:39:25 
 */
public class UndercoverB implements Observer {
	private String time;
	@Override
	public void update(Observable o, Object arg) {
		this.time = (String) arg;
		System.out.println("�Ե�B�ӵ��ж�ʱ��:" + this.time);
	}

}
