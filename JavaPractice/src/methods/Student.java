package methods;

import javax.print.DocFlavor.STRING;

public class Student {
	STRING name;
	int RollNumber;
	String city;
	
	public STRING getName() {
		return name;
	}
	public void setName(STRING name) {
		this.name = name;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
