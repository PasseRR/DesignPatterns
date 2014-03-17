package csii.behavioural.iterator;

/**
 * Person Bean¿‡
 * @author xiehai
 * @date 2013-12-5 …œŒÁ10:37:47 
 */
public class Person {
	private String personID;
	private String personName;
	private String personSex;
	public String getPersonID() {
		return personID;
	}
	public void setPersonID(String personID) {
		this.personID = personID;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonSex() {
		return personSex;
	}
	public void setPersonSex(String personSex) {
		this.personSex = personSex;
	}
	@Override
	public String toString() {
		return "personID: " + this.personID +", personName: " + this.personName + ", personSex: " + this.personSex;
	}
}
