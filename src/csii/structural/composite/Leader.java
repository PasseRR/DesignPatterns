package csii.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * �쵼 ���ϼ�
 * @author xiehai
 * @date 2013-8-9 ����01:06:41 
 */
public class Leader implements Introduction {
	private List<Teacher> teacherList = new LinkedList<Teacher>();
	private String name;
	public Leader() {
		// TODO Auto-generated constructor stub
	}
	
	public Leader(String name){
		this.name = name;
	}
	public void addTeacher(Teacher teacher){
		teacherList.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher){
		teacherList.remove(teacher);
	}
	
	public Teacher get(int index){
		return teacherList.get(index);
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
		if(teacherList.size() == 0){
			System.out.println("�ҹ�����0����ʦ");
		}else{
			System.out.print("�ҹ�����" + teacherList.size() + "����ʦ:");
			for(Teacher teacher : teacherList){
				System.out.print(teacher.getName() + " ");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "����һ����ʦ�쵼,�ҵ�������"+this.name;
	}
}
