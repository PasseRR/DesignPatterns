package csii.creational.prototype;

public class Person implements Cloneable{
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.sex;
	}
	public Object clone() throws CloneNotSupportedException {
		Person p = new Person();
		p.setName(name);
		p.setSex(sex);
		return p;
//		Person p = null;
//		p = (Person) super.clone();
//		return p;
	}
}
