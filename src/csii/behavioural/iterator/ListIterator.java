package csii.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * List������
 * @author xiehai
 * @date 2013-12-5 ����10:37:22 
 */
public class ListIterator<T> implements Iterator<T> {
	/**
	 * List
	 */
	private List<T> list;
	/**
	 * List��ǰ������λ��
	 */
	private int size = 0;
	
	public ListIterator() {
		this.list = new ArrayList<T>();
	}
	
	public ListIterator(List<T> list){
		this.list = list;
	}
	
	@Override
	public boolean hasNext() {
		return this.size == this.list.size() ? false : true;
	}

	@Override
	public T next() {
		T obj = null;
		if(this.hasNext()){
			obj = this.list.get(this.size++);
		}
		
		return obj;
	}

}
