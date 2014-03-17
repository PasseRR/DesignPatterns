package csii.behavioural.state;

/**
 * ״̬����ӿ�
 * @author xiehai
 * @date 2013-9-17 ����02:46:01 
 */
public interface State {
	/**
	 * ��Ʊ���ʱ��
	 */
	int SLEEP_RED = 5000;
	/**
	 * �ƵƱ���ʱ��
	 */
	int SLEEP_YELLOW = 1000;
	/**
	 * ·�Ʊ���ʱ��
	 */
	int SLEEP_GREEN = 3000;
	
	void change(Light light);
}
