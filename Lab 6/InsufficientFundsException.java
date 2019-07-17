/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 7
 * Purpose of Assignment: InsufficientFundsException class
 *
 */
package meganostrander_chapter9_problem7;

/**
 *
 * @author Megan Ostrander
 */
public class InsufficientFundsException extends Exception {

    
    public InsufficientFundsException() 
    {
        super("Insufficient funds to withdraw this amount.");
    }

    /**
     * Constructs an instance of <code>InsufficientFundsException</code> with
     * the specified detail message.
     *
     * @param message the detail message.
     */
    public InsufficientFundsException(String message) 
    {
        super(message);
    }
}
