/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 7
 * Purpose of Assignment: Account class
 *
 */
package meganostrander_chapter9_problem7;

/**
 *
 * @author Megan Ostrander
 */
public class Account {
    
    private double balance;
    
    public Account()
    {
        balance = 0;
    }
    
    public Account(double initialDeposit)
            throws NotPositiveNumberException
    {
        if (initialDeposit < 0)
        {
            throw new NotPositiveNumberException();
        }
        else
        {
            balance = initialDeposit;
        }
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
    //returns new balance or error message if error occurs
    public double deposit(double amount)
            throws NotPositiveNumberException
    {
        if (amount >= 0)
        {
            balance = balance + amount;
            return balance;
        }
        else
        {
            System.out.println("");
            throw new NotPositiveNumberException();
        }
    }
    
    //returns new balance or error message if error occurs
    public double withdraw(double amount)
            throws InsufficientFundsException, NotPositiveNumberException
    {
        if (amount > balance)
        {
            System.out.println("");
            System.out.println("Not enough money.");
            throw new InsufficientFundsException();
        }
        
        if (amount < 0)
        {
            throw new NotPositiveNumberException();
        }
        
        else
        {
            balance = balance - amount;
            return balance;
        }
    }
    
}
