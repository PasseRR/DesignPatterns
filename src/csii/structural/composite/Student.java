package csii.structural.composite;

/**
 * ѧ�� ��ʦ��ѧ��
 * @author xiehai
 * @date 2013-8-9 ����01:06:02 
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
		return "����һ��ѧ��,�ҽ�" + this.name;
	}

	@Override
	public void introduce() {
		System.out.println(toString());
	}
}
