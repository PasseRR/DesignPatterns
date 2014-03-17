package csii.behavioural.chainofresponsibility;

/**
 * 部门经理
 * @author xiehai
 * @date 2013-9-17 上午09:34:58 
 */
public class DepartmentManager extends Handler {

	@Override
	public void check(int day) {
		if(day < DEPARTMENT_MANAGER){
			System.out.println("部门经理审批通过!");
		}else{
			System.out.println("部门经理上报给了他的上司!");
			this.getHandler().check(day);
		}
	}

}
