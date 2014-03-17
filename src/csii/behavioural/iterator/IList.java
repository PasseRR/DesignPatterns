package csii.behavioural.iterator;

/**
 * List接口
 * @author xiehai
 * @date 2013-12-5 上午10:40:33 
 */
public interface IList<T> {
	/** 
	 * 添加元素
	 * @param obj
	 */
	public void add(T obj);
	/** 
	 * 删除元素
	 * @param obj
	 * @return
	 */
	public boolean remove(Object obj);
	/** 
	 * 获得迭代器
	 * @return
	 */
	public Iterator<T> iterator();
}
