package csii.structural.composite;

/**
 * 学生 教师教学生
 * @author xiehai
 * @date 2013-8-9 下午01:06:02 
 */
public class Student implements Introduction{
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "我是一个学生,我叫" + this.name;
	}

	@Override
	public void introduce() {
		System.out.println(toString());
	}
}
