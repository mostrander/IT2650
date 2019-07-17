/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 7
 * Purpose of Assignment: To output the name, quantity, and price of 3 items
                and display the information with dollar signs in column format
 *
 */
package meganostrander_chapter9_problem7;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;

public class MeganOstrander_Chapter9_Problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 9, Problem 7");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create scanner object keyboard for user input
        Scanner keyboard = new Scanner(System.in);
        
        //create variable to hold initial account balance upon creation
        double initialBalance;
        
        //initial variables to hold user input for deposit & withdraw
        double deposit;
        double withdraw;
        
        try {
        //prompt user for input
        System.out.println("Enter your STARTING BANK BALANCE");
        initialBalance = keyboard.nextDouble();
        
        //create user's bank account
        Account userAccount = new Account(initialBalance);
        
        //prompt for deposit amount
        System.out.println("Enter your DEPOSIT amount");
        deposit = keyboard.nextDouble();
        userAccount.deposit(deposit);
        
        //prompt for withdraw amount
        System.out.println("Enter your WITHDRAWL amount");
        withdraw = keyboard.nextDouble();
        userAccount.withdraw(withdraw);
        
        //output final account balance to console.
        System.out.println("Your ENDING BALANCE is " 
                + userAccount.getBalance());
        
        }
        catch(NotPositiveNumberException e)
        {
            System.out.println(e.getMessage());
        }
        catch(InsufficientFundsException e)
        {
            System.out.println(e.getMessage());
        }
    }
    
}
