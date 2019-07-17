/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 2, Problem 11
 * Purpose of Assignment: To calculate the overall grade as a percentage for
                    three classroom assignments using the DecimalFormat class,
                    and summarized in a table.
 *
 */
package chapter2problem11;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2Problem11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 2, Problem 11");
        System.out.println("______________________________________");
        System.out.println("");
        
    //create variables to hold user input & scanner object of input
    //Also create object for DecimalFormat class to format overall percentage
    //Need % sigh in format pattern so decimal is moved over 2 places to right
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat percentFormatter = new DecimalFormat("##0.00%");
    
        String homeworkAssignment1;
        String homeworkAssignment2;
        String homeworkAssignment3;
        
        int scoreReceived1;
        int scoreReceived2;
        int scoreReceived3;
        
        int scoreTotal1;
        int scoreTotal2;
        int scoreTotal3;
        
        //create variables for final score totals, need DOUBLE for all so
        //formatter correctly 
        double overallPossibleScore;
        double overallScore;
        double overallPercent;
     
    //Prompt user for input, place in variables
        System.out.println("Please enter the name of Exercise 1: ");
        homeworkAssignment1 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the score received for Exercise 1: ");
        scoreReceived1 = keyboard.nextInt();
        System.out.println("");
        
        System.out.println("Please enter the total points possible for"
                + " Exercise 1: ");
        scoreTotal1 = keyboard.nextInt();
        System.out.println("");
        
    // removes white space so can enter next string WITH spaces included   
        String junk1 = keyboard.nextLine();
        
        
        System.out.println("Please enter the name of Exercise 2: ");
        homeworkAssignment2 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the score received for Exercise 2: ");
        scoreReceived2 = keyboard.nextInt();
        System.out.println("");
        
        System.out.println("Please enter the total points possible for"
                + " Exercise 2: ");
        scoreTotal2 = keyboard.nextInt();
        System.out.println("");
        
    // removes white space so can enter next string WITH spaces included   
        String junk2 = keyboard.nextLine();
        
        
    System.out.println("Please enter the name of Exercise 3: ");
        homeworkAssignment3 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the score received for Exercise 3: ");
        scoreReceived3 = keyboard.nextInt();
        System.out.println("");
        
        System.out.println("Please enter the total points possible for"
                + " Exercise 3: ");
        scoreTotal3 = keyboard.nextInt();
        System.out.println("");
        
        
    //Calculate total score, total possible score, & overall percentage grade
        overallPossibleScore = scoreTotal1 + scoreTotal2 + scoreTotal3;
        overallScore = scoreReceived1 + scoreReceived2 + scoreReceived3;
        overallPercent = overallScore / overallPossibleScore;
        
    //Repeat user input to verify correct information
        System.out.println("Name of Exercise 1: \n" + homeworkAssignment1 + 
                "\nScore received for Exercise 1: \n" + scoreReceived1 + 
                "\nTotal points possible for Exercise 1: \n" + scoreTotal1 +
                "\n");
        
        System.out.println("Name of Exercise 2: \n" + homeworkAssignment2 + 
                "\nScore received for Exercise 2: \n" + scoreReceived2 + 
                "\nTotal points possible for Exercise 2: \n" + scoreTotal2 +
                "\n");
        
        System.out.println("Name of Exercise 3: \n" + homeworkAssignment3 + 
                "\nScore received for Exercise 3: \n" + scoreReceived3 + 
                "\nTotal points possible for Exercise 3: \n" + scoreTotal3 +
                "\n");
        
        
    // Output information in table format
    System.out.printf("%-30s","Excercise");
    System.out.printf("%-10s","Score");
    System.out.printf("%-5s","Total Possible");   
    System.out.println("");
       
    System.out.printf("%-30s",homeworkAssignment1 );
    System.out.printf("%-10s",scoreReceived1 );
    System.out.printf("%-5s",scoreTotal1, "\n" );
    System.out.println("");
     
    System.out.printf("%-30s",homeworkAssignment2 );
    System.out.printf("%-10s",scoreReceived2 );
    System.out.printf("%-5s",scoreTotal2);
    System.out.println("");
    
    System.out.printf("%-30s",homeworkAssignment3 );
    System.out.printf("%-10s",scoreReceived3 );
    System.out.printf("%-5s",scoreTotal3, "\n" );
    System.out.println("");
    
    System.out.printf("%-30s", "Total");
    System.out.printf("%-10.0f", overallScore);
    System.out.printf("%-5.0f", overallPossibleScore);
    System.out.println("\n");
   
    //Output overall score information
        System.out.print("Your total is ");
        System.out.printf("%3.0f", overallScore);
        System.out.print(" out of ");
        System.out.printf("%3.0f", overallPossibleScore);
        System.out.print(", or " + percentFormatter.format(overallPercent) +
                " percent.");
        System.out.println("");
    
    }
    
}
