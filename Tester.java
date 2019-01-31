package Task5_1;

public class Tester {
	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public static int salary;
	
	public Tester() {
		
	}
	public Tester (String name) {
		this.name = name;
	}
	public Tester (String name, String surname) {
		this(name);
		this.surname = surname;
	}
	public Tester (String name, String surname, int expirienceInYears) {
		this(name,surname);
		this.expirienceInYears = expirienceInYears;
	}
	public Tester (String name, String surname, int expirienceInYears, String englishLevel) {
		this(name,surname,expirienceInYears);
		this.englishLevel = englishLevel;
	}
	public Tester (String name, String surname, int expirienceInYears, String englishLevel, int salary) {
		this(name,surname,expirienceInYears,englishLevel);
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public int getExpirienceInYears() {
		return this.expirienceInYears;
	}
	public String getEnglishLevel() {
		return this.englishLevel;
	}
	public int getSalary() {
		return this.salary;
	}
}
