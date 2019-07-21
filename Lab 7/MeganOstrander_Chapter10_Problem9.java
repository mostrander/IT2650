/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 2, Problem 10
 * Purpose of Assignment: To import data from an external file and read numbers
 *              from the file. Keep a running total of the numbers, the count of
 *              how many numbers are in the file, and determine the following 
 *              based on the sum of all numbers: average, smallest, and largest
 *              number.
 *
 */
package meganostrander_chapter10_problem9;

/**
 *
 * @author Megan Ostrander
 */

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MeganOstrander_Chapter10_Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 10, Problem 9");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        //create scanner for file input
        ObjectInputStream numbers = null; //need to initialize outside of try to use later!
        
        //create scanner object that reads in a text file
        //needs to be in try block because it can throw exception.
        try 
        {
            numbers = new ObjectInputStream
                    (new FileInputStream("chapter10numbers.dat"));
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File chapter10numbers.dat was not found.");
            System.out.println("or could not be opened.");
            System.exit(0);        
        }
        catch(IOException e)
        {
            System.out.println("Problem with input from file "
                    + "chapter10numbers.dat");
            System.out.println("Exiting program.");
            System.exit(0);
        }
        
        //test output; MAKE SURE FILE NAME MATCHES EXACTLY!!!
        System.out.println("Made it this far!");
        
        
        //create variables to hold different information; use later
        double sum = 0;
        int count = 0;
        double average = 0;
        int largest = 0;
        int smallest = 0;
        
        int temp;
        
        try
        {
            //loop for getting values and handling sum amount
            while (true)
            {
                temp = numbers.readInt();

                //test output
                System.out.println(temp);

                sum = sum + temp;  
                
                //find smallest & largest value in file
                if (largest < temp)
                {
                    largest = temp;
                }
                if ((smallest > temp) || (smallest == 0))
                {
                    smallest = temp;
                }
                
                count++;
            }
            
        }
        catch(EOFException e)
        {
            System.out.println("No more numbers in the file.\n");
        }
        catch(IOException e)
        {
            System.out.println("Problem with input from file "
                    + "chapter10numbers.dat");
            System.out.println("Exiting program.");
            System.exit(0);
        }
        
        try
        {
            //close file
            numbers.close();
        }
        catch(IOException e)
        {
            System.out.println("Problem with input from file "
                    + "chapter10numbers.dat");
            System.out.println("Exiting program.");
            System.exit(0);
        }
        
        
        average = sum /(double) count;
        
        //output results
        System.out.println("Grand Total: " + sum);
        System.out.println("Count: " + count);
        System.out.println("Average: " + average);
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        
        
    }
    
}
