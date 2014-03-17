package csii.behavioural.state;

/**
 * 状态抽象接口
 * @author xiehai
 * @date 2013-9-17 下午02:46:01 
 */
public interface State {
	/**
	 * 红灯保持时间
	 */
	int SLEEP_RED = 5000;
	/**
	 * 黄灯保持时间
	 */
	int SLEEP_YELLOW = 1000;
	/**
	 * 路灯保持时间
	 */
	int SLEEP_GREEN = 3000;
	
	void change(Light light);
}
