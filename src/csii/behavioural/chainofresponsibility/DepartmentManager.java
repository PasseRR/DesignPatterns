package csii.behavioural.chainofresponsibility;

/**
 * ���ž���
 * @author xiehai
 * @date 2013-9-17 ����09:34:58 
 */
public class DepartmentManager extends Handler {

	@Override
	public void check(int day) {
		if(day < DEPARTMENT_MANAGER){
			System.out.println("���ž�������ͨ��!");
		}else{
			System.out.println("���ž����ϱ�����������˾!");
			this.getHandler().check(day);
		}
	}

}
