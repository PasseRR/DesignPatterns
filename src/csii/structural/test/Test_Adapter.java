package csii.structural.test;

import csii.structural.adapter.Adaptee;
import csii.structural.adapter.Adapter;
import csii.structural.adapter.Adapter2;

/**
 * ������������
 * @author xiehai
 * @date 2013-8-9 ����01:31:59 
 */
public class Test_Adapter {
	public static void main(String[] args) {
		//��һ��������
		Adapter adapter = Adapter.getInstance();
		adapter.doWhatWannaDo();
		//�ڶ���������
		Adaptee adaptee = new Adaptee();
		//set Adaptee������,Ȼ��Adapterʹ��
		Adapter2 adapter2 = new Adapter2(adaptee);
		adapter2.doWhatWannaDo();
	}
}
