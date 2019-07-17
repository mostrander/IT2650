/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 9, Problem 1
 * Purpose of Assignment: To output the calculated average of a range of numbers
 *      input by the user. Uses exception handling to verify user input is > 0.
 *
 */
package meganostrander_chapter9_problem1;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;

public class MeganOstrander_Chapter9_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 9, Problem 1");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create scanner object keyboard for user input
        Scanner keyboard = new Scanner(System.in);
        
        //create variables to hold data for calculations
        //variables are localized to try statement if initialized within it!
        
        int n = 0; //used to take user input values.
        int range = 0; //used to keep track of how many numbers are entered
        double sum = 0; //used to hold overall sum. Must be double for correct avg
        double average = 0; //used for final average score
        int i = 1; //used ONLY to control loop
        
        
        
        try 
        {
            //prompt user for input
            System.out.println("How many numbers do you want to enter?");
            range = keyboard.nextInt();
            
            if (range <= 0)
            {
                System.out.println("Number must be greater than 0.");
                System.out.println("How many numbers do you want to enter?");
                range = keyboard.nextInt();
                
                if (range < 0)
                {
                System.out.println("Cannot use negative numbers.");
                System.out.println("Program aborting.");
                System.exit(0);
                }
            }
            
            /*
            for (i = 1; i <= range; i++)
            {
                System.out.println("Enter number " + i);
                n = keyboard.nextInt();
                
                if (n < 0)
                {
                    throw new Exception("Number must be positive.");
                }
                else
                {
                    sum = sum + n;
                }

            } //end of for loop
            */

            while(i <= range)
            {
                System.out.println("Enter number " + i);
                n = keyboard.nextInt();
                
                if (n < 0)
                {
                    throw new Exception("Number must be positive.");
                }
                else
                {
                    sum = sum + n;
                }
                
                i++;
            } //end of while loop
            
            average = sum / range; //finds the average of numbers entered.
            
            //output the results to the console.
            System.out.println("The average is " + average);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage() + " Please try again.");
            

            //copied from try statement as a means of continuing the code
            //only if user inputs numbers correctly this time.
            while(i <= range)
            {
                System.out.println("Enter a positive number for number " + i);
                n = keyboard.nextInt();
                
                if (n < 0)
                {
                System.out.println("Cannot use negative numbers.");
                System.out.println("Program aborting.");
                System.exit(0);
                }
                else
                {
                    sum = sum + n;
                }
                
                i++;
            } //end of while loop
            
            average = sum / range; //finds the average of numbers entered.
            
            //output the results to the console.
            System.out.println("The average is " + average);
        }
        
        
        
        
    }
    
}
