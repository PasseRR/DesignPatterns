package csii.behavioural.chainofresponsibility;

/**
 * ��Ŀ����
 * @author xiehai
 * @date 2013-9-17 ����09:32:36 
 */
public class ProjectManager extends Handler{

	@Override
	public void check(int day) {
		if(day < PROJECT_MANAGER){
			System.out.println("��Ŀ��������ͨ��!");
		}else{
			System.out.println("��Ŀ�����ϱ�����������˾!");
			this.getHandler().check(day);
		}
	}

}
