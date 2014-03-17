package csii.behavioural.iterator;

import java.util.ArrayList;

/**
 * List实现类
 * @author xiehai
 * @date 2013-12-5 上午10:42:20 
 */
public class List<T> implements IList<T>{
	private java.util.List<T> list = new ArrayList<T>();
	@Override
	public void add(T obj) {
		list.add(obj);
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(list);
	}

	@Override
	public boolean remove(Object obj) {
		return list.remove(obj);
	}

}
