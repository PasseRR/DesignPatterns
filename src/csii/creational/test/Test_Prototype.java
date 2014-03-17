package csii.creational.test;

import java.util.LinkedList;
import java.util.List;

import csii.creational.prototype.DeepPrototype;
import csii.creational.prototype.Person;
import csii.creational.prototype.Prototype;
import csii.creational.prototype.ShallowPrototype;

/**
 * ԭ�Ͳ�����
 * @author xiehai
 * @date 2013-8-9 ����01:12:17 
 */
public class Test_Prototype {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Prototype p1 = new ShallowPrototype();
		p1.setName("1234");
		List list = new LinkedList<String>();
		list.add("abc");
		list.add("123");
		list.add("����!");
		p1.setList(list);
		Person p = new Person();
		p.setName("����");
		p.setSex("��");
		p1.setPerson(p);
		Prototype p2 = (Prototype) p1.clone();
		System.out.println("---------------->ǳ����");
		//��ӡʵ��������ʵ��������
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		list.remove("abc");
		p1.setList(list);
		p.setName("����");
		p.setSex("Ů");
		p1.setPerson(p);
		p1.setName("�����");
		//˵��ǳ����ֻ������������ ���ӵĶ������Ͳ��ܿ��� 
		//�޸�p1��ֵ p2�Ļ���������������� ���Ǹ������ͻ��Զ���������ǳ����
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		
		p1 = new DeepPrototype();
		p1.setName("1234");
		List list1 = new LinkedList<String>();
		list1.add("abc");
		list1.add("123");
		list1.add("����!");
		p1.setList(list1);
		Person pp = new Person();
		pp.setName("����");
		pp.setSex("��");
		p1.setPerson(pp);
		p2 = (Prototype) p1.clone();
		System.out.println("---------------->���");
		//p2��p1�Ŀ���ʵ��
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		list1.remove("abc");
		p1.setList(list);
		pp.setName("����");
		pp.setSex("Ů");
		p1.setPerson(pp);
		p1.setName("�����");
		//�޸�p1��ֵ��Ӱ��p2��ֵ ˵��p1��p2�Ƕ�����
		System.out.println(p1.getName()+p1.getList().toString()+p1.getPerson());
		System.out.println(p2.getName()+p2.getList().toString()+p2.getPerson());
		
		
		System.out.println("---------------->����Ԥ���弯������");
		List tmp = new LinkedList<String>();
		tmp.add("123");
		//��������ֵΪǳ����
		List temp = tmp;
		tmp.add("2313");
		System.out.println(tmp == temp);
		temp.add("123");
		System.out.println(tmp.toString() + temp.toString());
		tmp.clear();
		temp.clear();
		System.out.println(tmp.toString() + temp.toString());
		tmp.add("123");
		//�������캯��
		temp = new LinkedList<String>(tmp);
		System.out.println(tmp == temp);
		tmp.add("2112");
		System.out.println(tmp.toString() + temp.toString());
		temp.add("333");
		System.out.println(tmp.toString() + temp.toString());
	}
}
