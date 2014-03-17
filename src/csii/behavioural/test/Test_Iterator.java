package csii.behavioural.test;

import csii.behavioural.iterator.Iterator;
import csii.behavioural.iterator.List;
import csii.behavioural.iterator.Person;

/**
 * 测试迭代器模式
 * @author xiehai
 * @date 2013-12-5 上午10:49:08 
 */
public class Test_Iterator {
	public static void main(String[] args) {
		List<Person> list = new List<Person>();
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		p1.setPersonID("123556");
		p1.setPersonName("John");
		p1.setPersonSex("female");
		
		p2.setPersonID("123456");
		p2.setPersonName("Hason");
		p2.setPersonSex("male");
		
		p3.setPersonID("654123");
		p3.setPersonName("Jack");
		p3.setPersonSex("female or male");
		
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Iterator<Person> it = list.iterator();
		while(it.hasNext()){
			Person p = (Person) it.next();
			System.out.println(p);
		}
	}
}
