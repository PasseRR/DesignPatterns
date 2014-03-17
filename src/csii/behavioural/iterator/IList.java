package csii.behavioural.iterator;

/**
 * List�ӿ�
 * @author xiehai
 * @date 2013-12-5 ����10:40:33 
 */
public interface IList<T> {
	/** 
	 * ���Ԫ��
	 * @param obj
	 */
	public void add(T obj);
	/** 
	 * ɾ��Ԫ��
	 * @param obj
	 * @return
	 */
	public boolean remove(Object obj);
	/** 
	 * ��õ�����
	 * @return
	 */
	public Iterator<T> iterator();
}
