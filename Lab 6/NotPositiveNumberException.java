/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 7
 * Purpose of Assignment: NotPositiveNumberException class
 *
 */
package meganostrander_chapter9_problem7;

/**
 *
 * @author Megan Ostrander
 */
public class NotPositiveNumberException extends Exception {

    
    public NotPositiveNumberException() 
    {
        super("Number must be positive");
    }

    /**
     * Constructs an instance of <code>NotPositiveNumberException</code> with
     * the specified detail message.
     *
     * @param message the detail message.
     */
    public NotPositiveNumberException(String message) 
    {
        super(message);
    }
}
