package Task5_1;

public class Tester_Information {
	public static void main (String[]args){
	Tester tester1 = new Tester("John");//—татическое значение остаетьс€ не изменно
	Tester tester2 = new Tester("John", "Freemen");
	Tester tester3 = new Tester("John", "Freemen", 5);
	Tester tester4 = new Tester("John", "Freemen", 5, "Advanced");
	Tester tester5 = new Tester("John", "Freemen", 5, "Advanced", 3500);
	System.out.println(tester1.getName() +" " + tester1.getSurname() + " "+ tester1.getExpirienceInYears()+ " "+ tester1.getEnglishLevel()+ " " +tester1.getSalary() );
	System.out.println(tester2.getName() +" " + tester2.getSurname() + " "+ tester2.getExpirienceInYears()+ " "+ tester2.getEnglishLevel()+ " " +tester2.getSalary() );
	System.out.println(tester3.getName() +" " + tester3.getSurname() + " "+ tester3.getExpirienceInYears()+ " "+ tester3.getEnglishLevel()+ " " +tester3.getSalary());
	System.out.println(tester4.getName() +" " + tester4.getSurname() + " "+ tester4.getExpirienceInYears()+ " "+ tester4.getEnglishLevel()+ " " +tester4.getSalary() );
	System.out.println(tester5.getName() +" " + tester5.getSurname() + " "+ tester5.getExpirienceInYears()+ " "+ tester5.getEnglishLevel()+ " " +tester5.getSalary() );
	}	
}
