package csii.behavioural.chainofresponsibility;

/**
 * �鳤
 * @author xiehai
 * @date 2013-9-17 ����09:32:17 
 */
public class GroupLeader extends Handler {

	@Override
	public void check(int day) {
		if(day < GROUP_LEADER){
			System.out.println("�鳤����ͨ��!");
		}else{
			System.out.println("�鳤�ϱ�����������˾!");
			getHandler().check(day);
		}
	}

}
