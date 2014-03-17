package csii.creational.factory.abstractfactory;

public abstract class Machine {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.name;
	}
}
