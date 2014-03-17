package csii.creational.prototype;

import java.util.List;

/**
 * ԭ�ͽӿڼ̳�Cloneable�ӿ�
 * shallowCloneǳ����
 * deepClone���
 * @author xiehai
 * @date 2013-8-8 ����05:42:06 
 */
@SuppressWarnings("unchecked")
public interface Prototype extends Cloneable {
	Object clone();
	void setName(String name);
	String getName();
	void setList(List list);
	List getList();
	void setPerson(Person p);
	Person getPerson();
}
