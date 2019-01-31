package Task4_1;

public class Person_consol {
	public static void main(String[]args) {
		Person person = new Person();
		person.setAge(34);
		person.setName("Ignat");
		person.setSurname("Voznichenko");
		person.setPhoneNumber(5559905);
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		System.out.println(person.getPhoneNumber());
		System.out.println(person.getPrintName());
		System.out.println(person.getPrintAllInformation());
		System.out.println("Adult: " + person.getIsAdult());	
		
	}

}
