package csii.behavioural.iterator;

/**
 * �������ӿ�
 * @author xiehai
 * @date 2013-12-5 ����10:28:43 
 */
public interface Iterator<T> {
	/** 
	 * ������һ������
	 * @return
	 */
	public T next();
	/** 
	 * �Ƿ��е���
	 * @return
	 */
	public boolean hasNext();
}
