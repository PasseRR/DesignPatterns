package csii.structural.test;

import csii.structural.composite.Leader;
import csii.structural.composite.Student;
import csii.structural.composite.Teacher;

/**
 * 组合模式测试类
 * @author xiehai
 * @date 2013-8-9 下午01:12:47 
 */
public class Test_Composite {
	public static void main(String[] args) {
		Student s1 = new Student("张三");
		Student s2 = new Student("李四");
		Student s3 = new Student("王五");
		Student s4 = new Student("赵六");
		
		Teacher t1 = new Teacher("燕七");
		t1.addStudent(s1);
		t1.addStudent(s2);
		t1.addStudent(s3);
		
		Teacher t2 = new Teacher("司马八");
		t2.addStudent(s4);
		
		Teacher t3 = new Teacher("爱新觉罗九");
		
		Leader l1 = new Leader("boss");
		l1.addTeacher(t1);
		l1.addTeacher(t2);
		l1.addTeacher(t3);
		
		Leader l2 = new Leader("假boss");
		
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
