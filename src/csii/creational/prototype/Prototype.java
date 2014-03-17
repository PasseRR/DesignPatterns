package csii.creational.prototype;

import java.util.List;

/**
 * 原型接口继承Cloneable接口
 * shallowClone浅拷贝
 * deepClone深拷贝
 * @author xiehai
 * @date 2013-8-8 下午05:42:06 
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
