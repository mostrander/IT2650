/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 2
 * Purpose of Assignment: divide by zero exception handler
 *
 */
package calculator;

/**
 *
 * @author Megan Ostrander
 */
public class DivisionByZeroException extends Exception {

    //prints a predefined message
    public DivisionByZeroException() 
    {
        super("Divide by zero...");
    }

    //takes the message from exception thrown and outputs it
    public DivisionByZeroException(String message) 
    {
        super(message);
    }
}
