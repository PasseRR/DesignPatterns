package csii.behavioural.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import csii.behavioural.observer.Police;
import csii.behavioural.observer.UndercoverA;
import csii.behavioural.observer.UndercoverB;

/**
 * �۲���ģʽ������
 * @author xiehai
 * @date 2013-9-16 ����05:38:35 
 */
public class Test_Observer {
	public static void main(String[] args) {
		UndercoverA oa = new UndercoverA();
		UndercoverB ob = new UndercoverB();
		List<Observer> list = new ArrayList<Observer>();
		list.add(ob);
		list.add(oa);
		Police police = new Police(list);
		String time = "2013-09-16 17:38:00";
		police.changeTime(time);
		String newTime = "2013-09-16 17:45:00";
		System.out.println("�ӵ���������,�ж�ʱ���Ϊ:" + newTime);
		police.changeTime(newTime);
	}
}
