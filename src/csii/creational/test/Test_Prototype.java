package csii.creational.test;

import java.util.LinkedList;
import java.util.List;

import csii.creational.prototype.DeepPrototype;
import csii.creational.prototype.Person;
import csii.creational.prototype.Prototype;
import csii.creational.prototype.ShallowPrototype;

/**
 * 原型测试类
 * @author xiehai
 * @date 2013-8-9 下午01:12:17 
 */
public class Test_Prototype {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Prototype p1 = new ShallowPrototype();
		p1.setName("1234");
		List list = new LinkedList<String>();
		list.add("abc");
		list.add("123");
		list.add("您好!");
		p1.setList(list);
		Person p = new Person();
		p.setName("张三");
		p.setSex("男");
		p1.setPerson(p);
		Prototype p2 = (Prototype) p1.clone();
		System.out.println("---------------->浅拷贝");
		//打印实例及拷贝实例的内容
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		list.remove("abc");
		p1.setList(list);
		p.setName("王五");
		p.setSex("女");
		p1.setPerson(p);
		p1.setName("啊疯狂");
		//说明浅拷贝只拷贝基本数据 复杂的对象类型不能拷贝 
		//修改p1的值 p2的基本数据类型是深拷贝 但是复杂类型或自定义类型是浅拷贝
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		
		p1 = new DeepPrototype();
		p1.setName("1234");
		List list1 = new LinkedList<String>();
		list1.add("abc");
		list1.add("123");
		list1.add("您好!");
		p1.setList(list1);
		Person pp = new Person();
		pp.setName("张三");
		pp.setSex("男");
		p1.setPerson(pp);
		p2 = (Prototype) p1.clone();
		System.out.println("---------------->深拷贝");
		//p2是p1的拷贝实例
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		list1.remove("abc");
		p1.setList(list);
		pp.setName("王五");
		pp.setSex("女");
		p1.setPerson(pp);
		p1.setName("啊疯狂");
		//修改p1的值不影响p2的值 说明p1与p2是独立的
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		
		
		System.out.println("---------------->测试预定义集合类型");
		List tmp = new LinkedList<String>();
		tmp.add("123");
		//操作符赋值为浅拷贝
		List temp = tmp;
		tmp.add("2313");
		System.out.println(tmp == temp);
		temp.add("123");
		System.out.println(tmp.toString() + temp.toString());
		tmp.clear();
		temp.clear();
		System.out.println(tmp.toString() + temp.toString());
		tmp.add("123");
		//拷贝构造函数
		temp = new LinkedList<String>(tmp);
		System.out.println(tmp == temp);
		tmp.add("2112");
		System.out.println(tmp.toString() + temp.toString());
		temp.add("333");
		System.out.println(tmp.toString() + temp.toString());
	}
}
