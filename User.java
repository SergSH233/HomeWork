package FileList;

public class User {
	public static void main(String[] args) {
		Tester_1 tester1 = new Tester_1("Ivan");
		Tester_1 tester2 = new Tester_1("Semen", "Petrov");
		Tester_1 tester3 = new Tester_1("Ivan", "Petrov", 35);

		System.out.println(tester1.getName() + " " + tester1.getSurname() + " " + tester1.getAge());
		System.out.println(tester2.getName() + " " + tester2.getSurname() + " " + tester2.getAge());
		System.out.println(tester3.getName() + " " + tester3.getSurname() + " " + tester3.getAge());

		tester1.setName("Simon");
		tester1.setSurname("Brokerov");
		tester1.setAge(38);
		tester1.setEnglishLevel("Proficiency");
		tester1.setSalary(2500);
		tester1.setExpirienceInYears(4);

		System.out.println(tester1.getAllInfo());
		System.out.println(tester1.getFullName());
		System.out.println(tester1.getExpirienceInManth());

	}

}
