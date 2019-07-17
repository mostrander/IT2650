/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 2, Problem 3
 * Purpose of Assignment: To calculate the sum, difference, and product of 
 *                      two int variables provided by user input
 *
 */
package chapter2question3;

//Import necessary classes for program
import java.util.Scanner;

public class Chapter2Question3 {

    
    public static void main(String[] args) {
        
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 2, Problem 3");
        System.out.println("______________________________________");
        System.out.println("");
        
    // create two variables to hold user input from keyboard
    // use keyboard scanner object to place values into variables
    
        Scanner keyboard = new Scanner(System.in);
        int firstVariable = 0;
        int secondVariable = 0;
        
        System.out.println("Please enter the first whole number: ");
        firstVariable = keyboard.nextInt();
        
        System.out.println("Please enter the second whole number: ");
        secondVariable = keyboard.nextInt();
        
    // create variables to hold results for sum, difference, and product
        int product = 0;
        int sum = 0;
        int difference = 0;
        
        sum = firstVariable + secondVariable;
        difference = firstVariable - secondVariable;
        product = firstVariable * secondVariable;
        
        System.out.println("Adding " + firstVariable + " and " + secondVariable
            + " equals " + sum);
        System.out.println("Subtracting " + firstVariable + " - " + 
                secondVariable + " equals " + difference);
        System.out.println("Multiplying " + firstVariable + " * " + 
                secondVariable + " equals " + product);
    }
    
}
