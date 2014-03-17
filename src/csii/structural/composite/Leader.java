package csii.structural.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 领导 无上级
 * @author xiehai
 * @date 2013-8-9 下午01:06:41 
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
			System.out.println("我管理了0个教师");
		}else{
			System.out.print("我管理了" + teacherList.size() + "个教师:");
			for(Teacher teacher : teacherList){
				System.out.print(teacher.getName() + " ");
			}
			System.out.println();
		}
	}
	
	@Override
	public String toString() {
		return "我是一个教师领导,我的名字是"+this.name;
	}
}
