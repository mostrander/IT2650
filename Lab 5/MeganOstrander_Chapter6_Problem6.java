/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 6, Problem 6
 * Purpose of Assignment: To create a program that takes user input for number 
 *              of numbers to input, as well as the numbers themselves. Use the
 *              information to create an array and count number of occurences 
 *              for each number in array.
 *
 */
package meganostrander_chapter6_problem6;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;

public class MeganOstrander_Chapter6_Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 6, Problem 6");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create a scanner object called 'keyboard' to take user input
        Scanner keyboard = new Scanner(System.in);
        
        //create 'size' variable to use for array length.
        //create 'input' for user input, check before setting 'size'
        int size;
        int maxSize = 50;
        int input;
        
        System.out.println("How many numbers to enter?  (Max: 50)");
        input = keyboard.nextInt();
        
        
        //test to make sure size is appropriate number (0 - 50)
        while ((input < 0) || (input > 50))
        {
            System.out.println("Number must be between 0 - 50. "
                    + "Please try again.");
            System.out.println("How many numbers to enter?  (Max: 50)");
            input = keyboard.nextInt();
        }
        
        //sets size variable to verified input value.
        size = input;
        
        //verify entry in size variable, TEST
        //System.out.println("You have entered " + size + ".");
        
        //use size variable to create an array of that size.
        //and additional array to hold occurence of values
        int [] numbers = new int [size];
        int [] count = new int [maxSize];
        
        //verify size of array, TEST
        //System.out.println("The length of the array is: " + numbers.length);
        
        //Prompt user to add numbers to the array up to 'size' amount
        //initialize i to control loop
        int i = 0;
        int j = 0;
        
        System.out.println("Enter each of the " + size + " numbers."
                + " Please put a space between each number.");
        
        //input user values into each array element as long as i < array length
        while (numbers.length > i)
        {
            
            numbers[i] = keyboard.nextInt();
            i++;
            
        }
        System.out.println();
        
        
        //check that array is filled with correct values, TEST
        //read elements from array as long as index is less than length of array
        /*
        for (i = 0; i < numbers.length; i++) 
        {
            System.out.print(numbers[i] + " ");
        }
        */
        
        //initialize a temp variable to use in count array for occurences
        int temp = 0;
        
        
        
        
        //For counting the number of times a number appears in the array
        //works by placing current value at given index (i.e. numbers[1]
        //into a temp variable that acts as an index value for count[] 
        //and tracks occurences of each number.
        for (i = 0; i < numbers.length; i++)
        {
            temp = numbers[i]; //temp variable receives whatever value is in numbers[i]
            count[temp]++; //increases the value for that specific number in the array?
        }//end of for loop
        
        
        
        //formatting information into a list/table
        
        System.out.printf("%-13s", "N");
        System.out.printf("%-10s", "Count");
        System.out.println("");
        
        //iterates through each element in array count and returns how many 
        //for each element in the array based off of earlier counting loop
        for (i = 0; i < count.length; i++)
        {
            if (count[i] > 0 && count[i] == 1)
            {
                System.out.printf("%-13s", i );
                System.out.printf("%-10s", count[i]);
                System.out.println("");
            }
            else if (count[i] >= 2 )
            {
                System.out.printf("%-13s", i );
                System.out.printf("%-10s", count[i]);
                System.out.println("");
            }
        }
        
        
    }
    
}
