package csii.behavioural.test;

import csii.behavioural.chainofresponsibility.CEO;
import csii.behavioural.chainofresponsibility.DepartmentManager;
import csii.behavioural.chainofresponsibility.GroupLeader;
import csii.behavioural.chainofresponsibility.ProjectManager;

/**
 * ������ģʽ����
 * @author xiehai
 * @date 2013-9-17 ����09:36:08 
 */
public class Test_ChainOfResponsibility {
	public static void main(String[] args) {
		GroupLeader gl = new GroupLeader();
		ProjectManager pm = new ProjectManager();
		DepartmentManager dm = new DepartmentManager();
		CEO ceo = new CEO();
		gl.setHandler(pm);
		pm.setHandler(dm);
		dm.setHandler(ceo);
		
		gl.check(1);
	}
}
