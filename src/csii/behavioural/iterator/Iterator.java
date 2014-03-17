package csii.behavioural.iterator;

/**
 * 迭代器接口
 * @author xiehai
 * @date 2013-12-5 上午10:28:43 
 */
public interface Iterator<T> {
	/** 
	 * 返回下一个迭代
	 * @return
	 */
	public T next();
	/** 
	 * 是否还有迭代
	 * @return
	 */
	public boolean hasNext();
}
