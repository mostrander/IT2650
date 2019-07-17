/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 1, Problem 6
 * Purpose of Assignment: To calculate bike speed using user input for gear
 *                        size and cadence
 *
 */
package chapter1problem6;

//Import necessary classes for program
import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter1Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 1, Problem 6");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create DecimalFormat object & scanner object
        DecimalFormat speedFormat = new DecimalFormat("#0.00");
        Scanner keyboard = new Scanner(System.in);
        
        //initialize variables to hold values & user input
        double bikeSpeed;
        int gearSize;
        int cadence;
        
        //prompt user for variable input
        System.out.println("Please enter your gear size in inches:");
        gearSize = keyboard.nextInt();
        
        System.out.println("Please enter your revolutions Per Minute (RPM):");
        cadence = keyboard.nextInt();
        
        bikeSpeed = (gearSize * 3.14) * (1/12.0) * (1/5280.0) * cadence * 60;
        
        //print results to console for user to see
        System.out.println("With a gear size of "+ gearSize
        + " and a cadence (i.e RPM) of " + cadence +
        " your bike speed will be " + speedFormat.format(bikeSpeed));
    }
    
}
