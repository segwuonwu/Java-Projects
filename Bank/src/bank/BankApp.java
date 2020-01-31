/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author solo4
 */
public class BankApp {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create acct
        BankAccount ba1 = new BankAccount(100.00);
        
        System.out.println("Before transactions, ");
        ba1.display();      // display balance
        
        ba1.deposit(74.35); // make deposite
        ba1.withdraw(20.00);//make a withdraw
        
        System.out.println("After transactions, ");
        ba1.display();

    }//end main()
    
}//end of class BankApp
