package csii.behavioural.chainofresponsibility;

/**
 * �������������
 * @author xiehai
 * @date 2013-9-17 ����09:25:57 
 */
public abstract class Handler {
	/**
	 *�鳤������������ 
	 */
	public static final int GROUP_LEADER = 1;
	/**
	 *��Ŀ���������������� 
	 */
	public static final int PROJECT_MANAGER = 3;
	/**
	 * ���ž���������������
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
	 * ����
	 * @param day ��Ҫ����������
	 */
	public abstract void check(int day);
}
