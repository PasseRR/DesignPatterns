package csii.structural.proxy.dynamicproxy;

/**
 * ��ʵ����
 * @author xiehai
 * @date 2013-8-9 ����03:46:22 
 */
public class RealSubject implements Subject{

	@Override
	public void askForLeave() {
		//��ʦ����
		System.out.println("��ʦ��׼��.");
	}
}
