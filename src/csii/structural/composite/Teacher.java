package csii.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * ��ʦ �쵼�ܽ�ʦ
 * @author xiehai
 * @date 2013-8-9 ����01:06:12 
 */
public class Teacher implements Introduction{
	private List<Student> studentList = new LinkedList<Student>();
	private String name;
	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(String name){
		this.name = name;
	}
	public void addStudent(Student student){
		studentList.add(student);
	}
	
	public void removeStudent(Student student){
		studentList.remove(student);
	}
	
	public Student get(int index){
		return studentList.get(index);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void introduce() {
		System.out.println(toString());
		if(studentList.size() == 0){
			System.out.println("����0��ѧ��.");
		}else{
			System.out.print("����"+ studentList.size() +"��ѧ����");
			for(Student student:studentList){
				System.out.print(student.getName()+" ");
			}
			System.out.println();
		}
	}
	@Override
	public String toString() {
		return "����һ����ʦ,�ҵ����ֽ�" + this.name;
	}
}
