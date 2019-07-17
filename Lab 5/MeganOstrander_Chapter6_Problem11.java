/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 6, Problem 11
 * Purpose of Assignment: To create a program that displays available seats for
 *                  an airplane, and update the display when the user picks a 
 *                  seat to reserve. Reserved seats should be marked with 'X'.
 *
 */
package meganostrander_chapter6_problem11;

/**
 *
 * @author Megan Ostrander
 */

import java.util.Scanner;

public class MeganOstrander_Chapter6_Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 6, Problem 11");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create the multidimensional array to hold 7 rows & 5 columns of data
        char [][] seating = new char [7][5];
        
        //create variables for counting rows & columns
        int row = 0;
        int column = 0;
        
        //Inform user of what is happening.
        System.out.println("You will be selecting seats for this airplane.");
        
        //create loop that creates the original seating chart - full avilability!
        //Works great!
        for (row = 0; row < seating.length; row++)
        {
            //in order to correctly display intended number, must throw a char 
            //conversion and do '1' instead of 1. Also, beware it goes based on
            //ASCII values, so it can output wrong thing VERY easily!
            seating[row][0] = (char)(row + '1');
            
            //assigns values to each column for each row during loop
            seating[row][1] = 'A';
            seating[row][2] = 'B';
            seating[row][3] = 'C';
            seating[row][4] = 'D';
            
            //outputs each row as loop iterates
            System.out.println(seating[row][0] + "  " + seating[row][1] + 
                    seating[row][2] + " " + seating[row][3] + seating[row][4]);
        }
        
        //create object to store user input. Utilize row & column variables 
        Scanner keyboard = new Scanner(System.in);
        
        //rcreate new versions of row and column for user input
        int rowNumber;
        char columnLetter;
        String answer = "";
        String exit = "Q";
        
        //Test to see what value row is assigned. 
        //MUST reassign to 0 or it will throw out of bound error!
        //System.out.println(row);
        
        row = 0;
        
        //prompt user for input, use loop that allows exit 'Q'
        //MUST have this OUTSIDE of while loop for it to work!
        System.out.println("You will input the seat selection using the row"
                + " number and then the seat letter (ex - 3B");
        System.out.println("Please enter the seat number or Q to quit.");
            answer = keyboard.nextLine();
            
            answer = answer.toUpperCase();
        
        while (!answer.equals(exit))
        {
            
            if (answer == "Q")
            {
                exit = answer;
                System.exit(0);
            }
            
            else
            {
                rowNumber = answer.charAt(0);
                
                //have to equal to ORIGINAL variable row used when array was
                //created to get the letter placement working properly!
                row = (char)(rowNumber - '1');
                
                columnLetter = answer.charAt(1);
                
                //correctly sets row number so it corresponds to array number
                //need to use full array declaration when assigning values
                seating[row][column] = (char)(rowNumber);
            
            
                if ((seating[row][1] == 'X') || (seating[row][2] == 'X')
                    || (seating[row][3] == 'X') || (seating[row][4] == 'X'))
                {
                System.out.println("Seating for " + answer + " has already "
                        + "been reserved. Please select another seat.");
                }
            
                else 
                {
                rowNumber = answer.charAt(0);
                
                //have to equal to ORIGINAL variable row used when array was
                //created to get the letter placement working properly!
                row = (char)(rowNumber - '1');
                
                columnLetter = answer.charAt(1);
                
                //correctly sets row number so it corresponds to array number
                //need to use full array declaration when assigning values
                seating[row][column] = (char)(rowNumber);
                
                //checks letter entered and replaces corresponding array element
                //with an 'X'. Returns error & exits if nothing found
                switch (columnLetter)
                    {
                    case 'A':
                        seating[row][1] = (char)('X');
                        break;
                    case 'B':
                        seating[row][2] = (char)('X');
                        break;
                    case 'C':
                        seating[row][3] = (char)('X');
                        break;
                    case 'D':
                        seating[row][4] = (char)('X');
                        break;
                    default:
                        System.out.println("Could not find a match for the "
                                + "following: " + answer);
                        continue;
                    }
 
                } //end of 2nd else statement
            } //end of 1st else statement
            
            //Outputs updated seating chart for airplane.
            //Loop for simplicity sake.
            for (row = 0; row < seating.length; row++)
            {
                System.out.println(seating[row][0] + "  " + seating[row][1] + 
                    seating[row][2] + " " + seating[row][3] + seating[row][4]);
            }
            
            
            //REQUIRES this, otherwise it runs as an infinite loop!
            System.out.println("Please enter the seat number or Q to quit.");
            answer = keyboard.nextLine();
            
            answer = answer.toUpperCase();
            
            row = 0;
            
        } //end of while loop
        
        
    }
    
}
