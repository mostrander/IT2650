/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 2
 * Purpose of Assignment: To calculate the ratio of 2 user input number values,
 *          and display error messages for 2 different exceptions when caught.
 *          Also, exception handlers provide 2nd chances for user if input is
 *          incorrect.
 *
 */
package meganostrander_chapter9_problem2;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;
import java.util.InputMismatchException;


public class MeganOstrander_Chapter9_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 9, Problem 2");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create scanner object keyboard for user input
        Scanner keyboard = new Scanner (System.in);
        
        //create variables for holding user input
        int number1 = 0;
        int number2 = 0;
        double ratio = 0;
        
        try
        {
            System.out.println("Enter two numbers. Please leave a space between"
                    + " the numbers. I will compute the ratio.");
            number1 = keyboard.nextInt();
            number2 = keyboard.nextInt();
            
            if (number2 == 0)
            {
                throw new DivisionByZeroException();
            }
               
            else
            {
                ratio = number1 / (double) number2;
            
                System.out.println("The ratio r = " + ratio);
            }
            
            
        }
        catch(DivisionByZeroException e)
        {
            System.out.println("There was an exception: " + e.getMessage()
                            + " Try again.");
            
            //second attempt to set number2 variable
                System.out.println("Enter two numbers. Please leave a space between"
                    + " the numbers. I will compute the ratio.");
                number1 = keyboard.nextInt();
                number2 = keyboard.nextInt();
                
                if (number2 == 0)
                {
                    System.out.println("Cannot divide by zero!");
                    System.out.println("Program aborting.");
                    System.exit(0);
                }
                
                else
                {
                    ratio = number1 / (double) number2;
            
                    System.out.println("The ratio r = " + ratio);
                }
        }
        catch(InputMismatchException e)
        {
            keyboard.nextLine(); //this will prevent error from showing & ending program!
            System.out.println("You must enter an integer. "
                    + "Try again.");
            
            //User second chance
            System.out.println("Enter two numbers. Please leave a space between"
                    + " the numbers. I will compute the ratio.");
            number1 = keyboard.nextInt();
            number2 = keyboard.nextInt();
            
            if (number2 == 0)
            {
                System.out.println("Cannot divide by zero!");
                System.out.println("Program aborting.");
                System.exit(0);
            }
               
            else
            {
                ratio = number1 / (double) number2;
            
                System.out.println("The ratio r = " + ratio);
            }
        }
        
    }
    
}
