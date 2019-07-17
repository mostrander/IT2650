/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 3, Problem 3
 * Purpose of Assignment: To output an estimated adult height for a future child
                based on the heights on each parent, calculate all variables
                as inches and output result in Feet and Inches format.
 *
 */
package meganostrander_chapter3_problem_3;

import java.util.Scanner;

public class MeganOstrander_Chapter3_Problem_3 {

    
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 3, Problem 3");
        System.out.println("______________________________________");
        System.out.println("");
        
        // create object of scanner class to store user input values
        Scanner keyboard = new Scanner(System.in);
        
        // create variables to hold height information for parents
        //separate into feet & inches for easier program usage.
        int motherHeightFeet = 0;
        int motherHeightInches = 0;
        
        int fatherHeightFeet = 0;
        int fatherHeightInches = 0;
        
        //create variables to store child information
        int childGender = 0;
        int childHeight = 0;
        
        var userInput = "Y";
        
        //loop that allows user to run program X amount of times
        while (userInput.equalsIgnoreCase("Y"))
        {
        System.out.println("Enter the gender of your future child. Use 1 for "
                + "female, 0 for male.");
        childGender = keyboard.nextInt();
        
        System.out.println("Enter the height in feet then the height "
                + "in inches for the mother: ");
        motherHeightFeet = keyboard.nextInt();
        motherHeightInches = keyboard.nextInt();
        
        // for testing purposes, verify mother height input
        /* System.out.println("Mother height in feet: " + motherHeightFeet + 
                "\nMother height in inches: " + motherHeightInches); */
        
        System.out.println("Enter the height in feet then the height "
                + "in inches for the father: ");
        fatherHeightFeet = keyboard.nextInt();
        fatherHeightInches = keyboard.nextInt();
        
        // for testing purposes. verify father height input
        /* System.out.println("Father height in feet: " + fatherHeightFeet + 
                "\nFather height in inches: " + fatherHeightInches); */
        
        //Combine height variables above into one variable for each parent
        //All heights converted to inches ONLY
        int motherHeight = (motherHeightFeet * 12) + motherHeightInches;
        int fatherHeight = (fatherHeightFeet * 12) + fatherHeightInches;
        
        //for testing purposes, output parent total inch height
        /* System.out.println(motherHeight);
        System.out.println(fatherHeight); */
        
        //Estimate child height based on parent height & gender of child
        if (childGender == 1)
            {childHeight = (fatherHeight * 12/13 + motherHeight) / 2 ;}
        else
            {childHeight = (motherHeight * 13/12 + fatherHeight) / 2 ;}

        //create variables to store feet and inches estimate of child
        int childHeightFeet = childHeight / 12;
        int childHeightInches = childHeight % 12;
        
        // for testing purposes, displays feet and inch values for child
        /* System.out.println("Estimated child height in Feet is: " + 
                childHeightFeet + "\nEstimated child height in inches is: " +
                childHeightInches); */
        
        
        System.out.println("Your future child is estimated to grow to "
                + childHeightFeet + " feet and " + childHeightInches +
                " inches.");
        
        System.out.println("Enter 'Y' to run again, anything else to exit.");
        userInput = keyboard.next();
        
        }
        
        System.exit(0);
    }
    
}
