package csii.behavioural.chainofresponsibility;

/**
 * CEO
 * @author xiehai
 * @date 2013-9-17 ����09:35:16 
 */
public class CEO extends Handler {

	@Override
	public void check(int day) {
		System.out.println("CEO����ͨ��!");
	}

}
