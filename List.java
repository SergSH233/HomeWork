package Try_Catch;



public class List {
	private String customer;
	private double warehouse;
	
	public  List (String customer) {
		this.customer = customer;
	}
	public void deposite(double amount) {
		warehouse += amount;
	}
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= warehouse) {
			warehouse -= amount;
		}else {
			double needs = amount - warehouse;
			throw new InsufficientFundsException(needs);
			}
		}
	public double getBalance() {
	      return warehouse;
	   }
	   
	   public String getDetails() {
	      return customer;
	   }
	}
	

