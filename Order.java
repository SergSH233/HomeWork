package Try_Catch;

import java.util.ArrayList;

public class Order {
	public static void main (String[]args) {
		ArrayList <String>catalog = new ArrayList<String>();
		catalog.add("Bike");
		catalog.add("Pump");
		catalog.add("Jacks");
		catalog.add("Oil");
		
		List sklad = new List("Fil");
		System.out.println("warehouse has = 1500 detals");
		sklad.deposite(1500.0);
		
		
		try {
			System.out.println("\n first position 900");
			sklad.withdraw(900.0);
			System.out.println("\n second position 800");
			sklad.withdraw(800.0);
		}catch(InsufficientFundsException e) {
			System.out.println("Sorry, but Wi don't have " + e.getAmount() + " " + "detals");
			e.printStackTrace();

		}finally { System.out.println("You can see our other products. " + catalog.toString());
			
		}
	}

}
