package pratice_fahar_hibernate_bidirection_onetoone.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar {
	
	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", aadharName=" + aadharName + ", age=" + age + ", person=" + person
				+ "]";
	}
	public int getAadharId() {
		return aadharId;
	}
	public void setAadharId(int aadharId) {
		this.aadharId = aadharId;
	}
	public String getAadharName() {
		return aadharName;
	}
	public void setAadharName(String aadharName) {
		this.aadharName = aadharName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	@Id
	private int aadharId;
	private String aadharName;
	private int age;
	@OneToOne
	private Person person;
	

}
