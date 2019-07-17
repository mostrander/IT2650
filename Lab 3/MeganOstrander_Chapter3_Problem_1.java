/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 3, Problem 1
 * Purpose of Assignment: To estimate the square root of an integer provided
                by the user using a loop function to iterate the equation
                until current guess is within 0.01 of old guess amount.
 *
 */
package meganostrander_chapter3_problem_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MeganOstrander_Chapter3_Problem_1 {

        
    public static void main(String[] args) {
        
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 3, Problem 1");
        System.out.println("______________________________________");
        System.out.println("");
        
        //declare new objects for scanner and decimalformat classes
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat decimalFormatter = new DecimalFormat("##0.00");
        
        int guess = 1;
        double R = 0;
        double currentGuess = 0;
        double oldGuess = 0;
        double number = 0;
        
        System.out.println("Please enter an integer (whole) number below: ");
        number = keyboard.nextDouble();
        
        currentGuess = number / 2;
        
        // Do these tasks so long as the while condition is true
        do {
            System.out.println("Guess " + guess + ": " + currentGuess);
            oldGuess = currentGuess;
            R = number / currentGuess;
            currentGuess = (oldGuess + R) / 2;
            ++guess;
        }
            while (((oldGuess - currentGuess)/oldGuess) > 0.01);
        
        // Output final results of guessing.
        System.out.println("The estimated square root of " + number 
                + " is " + decimalFormatter.format(currentGuess));
        
        // Verify the square root guess is accurate
        double verify = R * R;
        
        System.out.println("The root squared is: " + 
                decimalFormatter.format(verify));
        
    }
    
}
