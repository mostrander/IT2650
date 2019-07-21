/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 10, Problem 1
 * Purpose of Assignment: To compare user inputted name to two lists of popular
 *              names used in 2003, and output whether the name appears on either
 *              list and its popularity if it does.
 *
 */
package meganostrander_chapter10_problem1;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;
import java.io.FileInputStream; //have to import to read from external files
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MeganOstrander_Chapter10_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 2, Problem 10");
        System.out.println("______________________________________");
        System.out.println("");

        /*
        //Initialize variables for array and loop control
        int row = 0;
        int column = 0;
        int columnLength = 2; //only because i know how many columns
        String name;
        int number;
        String numberString;
        */
        
        Scanner girlnames = null; //need to initialize outside of try to use later!
        
        //create scanner object that reads in a text file
        //needs to be in try block because it can throw exception.
        try 
        {
            girlnames = new Scanner(new FileInputStream("girlnames.txt"))
                    .useDelimiter(",\\s*");
            //delimiter allows scanner to pick out both string and number values
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File girlnames.txt was not found.");
            System.out.println("or could not be opened.");
            System.exit(0);        
        }
              
        //test output
        //System.out.println("Working after array create.");
        
        
        int count = 0;
        String[] girlNames = new String[1000]; //exact length of lines in girlnames file
        
        while (girlnames.hasNext())
        {
            girlNames[count] = girlnames.nextLine();
            
            //testing purposes
            //System.out.println((count + 1) + " " + girlNames[count]);
            
            count++;
        }
        
        girlnames.close();
        
        //create spaces for test output separation
        //System.out.println("\n");
        
        Scanner boynames = null;
        
        try 
        {
            boynames = new Scanner(new FileInputStream("boynames.txt"))
                    .useDelimiter(",\\s*");
            //delimiter allows scanner to pick out both string and number values
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File boynames.txt was not found.");
            System.out.println("or could not be opened.");
            System.exit(0);        
        }
              

        count = 0;
        String[] boyNames = new String[1000]; //exact length of lines in boynames file
        
        while (boynames.hasNext())
        {
            boyNames[count] = boynames.nextLine();
            
            //testing purposes
            //System.out.println((count + 1) + " " + boyNames[count]);
            
            count++;
        }
        
        boynames.close();
        
        
        
        
        
        //create user input variable and prompt for input
        //create scanner object for user input as well
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter first name: ");
        System.out.println("Only capitalize first letter of name. (I.e. Emily)");
        String userInput = keyboard.nextLine();
        
        System.out.println("");
        
        String userValue = userInput;
        
        //check each array separately for user input value
        boolean test = false;
        int rank;
        count = 0;
        
        for (String element : boyNames) //for each element in boyNames array
        {
            count++;
            
            if (element.contains(userValue)) //if element contains user input value
            {
                test = true;
                rank = count;
                
                System.out.println(userValue + " was found in the list of "
                        + "popular boy names. ");
                System.out.println(userValue + " is ranked " 
                        + rank + " out of " + boyNames.length + " total names.");
                break;
            }
            
        }
        
        count = 0;
        
        for (String element : girlNames) //for each element in boyNames array
        {
            count++;
            
            if (element.contains(userValue)) //if element contains user input value
            {
                test = true;
                rank = count;
                
                System.out.println(userValue + " was found in the list of "
                        + "popular girl names. ");
                System.out.println(userValue + " is ranked " 
                        + rank + " out of " + girlNames.length + " total names.");
                
                break;
            }
            
        }
        
        if (test == false)
        {
            System.out.println(userValue + " is not ranked amoung the "
                        + "top " + boyNames.length + " boy names.");
            
            System.out.println(userValue + " is not ranked amoung the "
                        + "top " + girlNames.length + " girl names.");
        }
        
        /*
        output results test
        System.out.println(userValue + " is in one of the lists of popular "
                + "names: " + test);
        */
        
        
    } //end main class
      
}

