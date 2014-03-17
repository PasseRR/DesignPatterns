package csii.creational.prototype;

import java.lang.CloneNotSupportedException;
import java.util.List;

/**
 * Ç³¿½±´Ô­ÐÍ
 * @author xiehai
 * @date 2013-8-8 ÏÂÎç05:45:30 
 */
@SuppressWarnings("unchecked")
public class ShallowPrototype implements Prototype {
	private String name;
	private List list;
	private Person person;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object clone(){
		return shallowClone();
	}
	
	public Object shallowClone(){
		Object temp = null;
		try {
			temp = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void setList(List list) {
		this.list = list;
	}

	@Override
	public Person getPerson() {
		// TODO Auto-generated method stub
		return this.person;
	}

	@Override
	public void setPerson(Person p) {
		this.person = p;
	}
}
