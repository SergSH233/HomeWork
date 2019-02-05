package FileList;

public class Tester_1 {
	public String name;
	public String surname;
	public int expirienceInYears;
	protected String englishLevel;
	private int salary;
	public int age;
	private int premiumSalary;
	int expirienceInManth;
	protected String fullName;
	public String allInfo;

	public Tester_1(String name) {
		this.name = name;
	}

	public Tester_1(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester_1(String name, String surname, int age) {
		this(name, surname);
		this.age = age;
	}

	public void setAllInfo(String allInfo) {

	}

	protected void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAllInfo() {
		return allInfo = name + " " + surname + " " + age + " " + expirienceInYears + " " + englishLevel + " " + salary
				+ " " + premiumSalary + " " + expirienceInManth;
	}

	protected String getFullName() {
		return fullName = name + surname;
	}

	int getExpirienceInManth() {
		return expirienceInManth = (expirienceInYears * 12);
	}

	void setName(String name) {
		this.name = name;
	}

	private void setPremiumSalary(int premiumSalary) {
		this.premiumSalary = premiumSalary;
	}

	private int getPremiumSalary() {
		return salary * 2;

	}

	String getName() {
		return name;
	}

	String getSurname() {
		return surname;
	}

	void setSurname(String surname) {
		this.surname = surname;
	}

	int getExpirienceInYears() {
		return expirienceInYears;
	}

	void setExpirienceInYears(int expirienceInYears) {
		this.expirienceInYears = expirienceInYears;
	}

	String getEnglishLevel() {
		return englishLevel;
	}

	void setEnglishLevel(String englishLevel) {
		this.englishLevel = englishLevel;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

}
