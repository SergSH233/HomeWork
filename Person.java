package Task4_1;

public class Person {
	public String name;
	public String surname;
	public int age;
	public int phoneNumber;
	public  String PrintAllInformation;
	public  String PrintName;
	public  boolean isAdult;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setPrintAllInformation(String PrintAllInformation) {
		this.PrintAllInformation = PrintAllInformation;
	}

	public void setPrintName(String PrintName) {
		this.PrintName = PrintName;
	}

	public void setIsAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	public boolean getIsAdult() {
		boolean isAdult = (age >= 18);
		if (isAdult)
			return true;
		else
			return false;
	}

	public String getPrintName() {
		return this.PrintName = name + surname;
	}

	public String getPrintAllInformation() {
		return this.PrintAllInformation = "Name: " + name + " " + "Surname: " + surname + " " + "Age: " + age + " "
				+ "Phonenumber: " + phoneNumber;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}

}
