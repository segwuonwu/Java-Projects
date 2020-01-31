/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *Demonstrates basic OOP syntax
 * @author solo4
 */
public class BankAccount {
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
    
}// End of BankAccount class




