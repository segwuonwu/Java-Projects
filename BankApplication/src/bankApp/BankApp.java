package bankApp;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		double amountD, amountW;
		Scanner keyboard = new Scanner(System.in);
        // create acct
        BankAccount ba1 = new BankAccount(100.00);
        
        System.out.println("Before transactions, ");
        ba1.display();      // display balance
        
        System.out.print("Enter your deposit amount: $");
        amountD = keyboard.nextDouble(); 
        ba1.deposit(amountD); // make deposite
        System.out.println();
        
        System.out.print("Enter your withdrawn amount: $");
        amountW = keyboard.nextDouble();
        ba1.withdraw(amountW);//make a withdraw
        
        System.out.println();
        System.out.println("After transactions, ");
        ba1.display();
        
        System.out.println();
        ba1.banckBalance();
        
        keyboard.close();
	}

}
