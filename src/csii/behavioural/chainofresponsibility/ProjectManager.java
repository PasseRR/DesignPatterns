package csii.behavioural.chainofresponsibility;

/**
 * 项目经理
 * @author xiehai
 * @date 2013-9-17 上午09:32:36 
 */
public class ProjectManager extends Handler{

	@Override
	public void check(int day) {
		if(day < PROJECT_MANAGER){
			System.out.println("项目经理审批通过!");
		}else{
			System.out.println("项目经理上报给了他的上司!");
			this.getHandler().check(day);
		}
	}

}
