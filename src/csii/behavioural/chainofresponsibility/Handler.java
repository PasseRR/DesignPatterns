package csii.behavioural.chainofresponsibility;

/**
 * 审批处理抽象类
 * @author xiehai
 * @date 2013-9-17 上午09:25:57 
 */
public abstract class Handler {
	/**
	 *组长能审批的天数 
	 */
	public static final int GROUP_LEADER = 1;
	/**
	 *项目经理能审批的天数 
	 */
	public static final int PROJECT_MANAGER = 3;
	/**
	 * 部门经理能审批的天数
	 */
	public static final int DEPARTMENT_MANAGER = 5;
	Handler handler;

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	
	/** 
	 * 审批
	 * @param day 将要审批的天数
	 */
	public abstract void check(int day);
}
