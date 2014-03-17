package csii.structural.test;

import csii.structural.composite.Leader;
import csii.structural.composite.Student;
import csii.structural.composite.Teacher;

/**
 * ���ģʽ������
 * @author xiehai
 * @date 2013-8-9 ����01:12:47 
 */
public class Test_Composite {
	public static void main(String[] args) {
		Student s1 = new Student("����");
		Student s2 = new Student("����");
		Student s3 = new Student("����");
		Student s4 = new Student("����");
		
		Teacher t1 = new Teacher("����");
		t1.addStudent(s1);
		t1.addStudent(s2);
		t1.addStudent(s3);
		
		Teacher t2 = new Teacher("˾���");
		t2.addStudent(s4);
		
		Teacher t3 = new Teacher("���¾��޾�");
		
		Leader l1 = new Leader("boss");
		l1.addTeacher(t1);
		l1.addTeacher(t2);
		l1.addTeacher(t3);
		
		Leader l2 = new Leader("��boss");
		
		l1.introduce();
		l2.introduce();
		t1.introduce();
		t2.introduce();
		t3.introduce();
		s1.introduce();
		s2.introduce();
		s3.introduce();
		s4.introduce();
	}
}
