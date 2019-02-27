package bankApp;

public class BankAccount {
	private static final double INTEREST_RATE = 0.02; //2% annually
	private static final double OVERDRAWN_PENALTY = 8.00;
	private double balance; //account balance
	    
    //constructor
    public BankAccount(double openingBalance){
        balance = openingBalance;
    }
    
    //makes deposite
    public void deposit(double amount){
        balance += amount;
    }
    
    //make withdraw
    public void withdraw(double amount){
        balance -= amount;
    }
    
    //display balance
    public void display(){
        System.out.printf("Balance = $%6.2f\n", balance);
    }
    
    public void banckBalance() {
    	System.out.println("Original balance $" + balance);
    	
    	if(balance >= 0) {
    		balance = balance + (INTEREST_RATE * balance)/12;
    	}
    	else {
    		balance = balance - OVERDRAWN_PENALTY;
    	}
    	
    	System.out.printf("After adjusting for one month \n"
    						+ "of interest and penalties, \n"
    						 + "your new balance is $%6.2f\n", balance);
    }

}
