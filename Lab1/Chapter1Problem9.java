/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 1, Problem 9
 * Purpose of Assignment: To calculate appropriate weight for individual
 *                      based on their height provided in feet & inches.
 *
 */
package chapter1problem9;

import java.util.Scanner;

public class Chapter1Problem9 {

    
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 1, Problem 9");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        Scanner keyboard = new Scanner(System.in);
        
        int heightFeet;
        int heightInches;
        int bodyWeight;
        
        System.out.println("Please enter your Height as two numbers, Feet "
        + "followed by Inches:");
        System.out.println("-------------------------------------");
        System.out.println("");
        
        //prompt user for variable input
        System.out.println("Please enter the Feet portion of your Height " +
                "as a whole number: ");
        heightFeet = keyboard.nextInt();
        
        System.out.println("Please enter the Inches portion of your Height " +
                "as a whole number: ");
        heightInches = keyboard.nextInt();
        
        //print results to console for user to see
        System.out.println("__________________________________________");
        
        bodyWeight = 5 * ((heightFeet - 5) * 12) + (heightInches * 5) + 110;
        System.out.println("Based on your Height your ideal body weight is: "
                        + bodyWeight + " pounds.");
    }
    
}
