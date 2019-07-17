/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 3, Problem 5
 * Purpose of Assignment: To calculate the monthly payment for a home if loan
                equals $45,000, annual interest is 5%, and number of terms is 
                360. Uses a loop to process the amount of interest paid if min
                payments are made for the full 360 months.
 *
 */
package meganostrander_chapter3_problem_5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MeganOstrander_Chapter3_Problem_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 3, Problem 5");
        System.out.println("______________________________________");
        System.out.println("");
        
        // create object of scanner class to store user input values
        Scanner keyboard = new Scanner(System.in);
        
        //create object for formatting class to format results
        DecimalFormat decimalFormatter = new DecimalFormat("$#,###,###,##0.00");
        
        //create variables to hold user input.
        double interestRateAnnual;
        double interestRateMonthly;
        double interestPaid;
        
        int homePurchaseCost;
        int homeDownPayment;
        int amtBorrowed;
        int termMonths;
        
        double monthlyPayment;
        double principalPaid;
        double balance;
        
        //variable that counts number of months & interest since payment began
        int monthCount = 1;
        double interestPaidTotal = 0;
        
        //prompt for user input, place in corresponding variables
        System.out.println("Enter the House Purchase Cost: ");
        homePurchaseCost = keyboard.nextInt();
        
        System.out.println("Enter the Down Payment: ");
        homeDownPayment = keyboard.nextInt();
        
        amtBorrowed = homePurchaseCost - homeDownPayment;
        balance = amtBorrowed;
        
        System.out.println("Enter the Annual Interest Rate as a whole number"
                + " with two decimals: ");
        interestRateAnnual = keyboard.nextDouble();
        
        interestRateMonthly = (interestRateAnnual / 12) / 100;
       
        
      //for testing purposes, verifies monthly interest calculation is accurate
        /* System.out.println("Annual Interest is: " + interestRateAnnual + " "
                + "Monthly interest would be: " + interestRateMonthly + " "
                        + "Monthly * 12 equals: " + interestRateMonthly * 12);*/
        
        System.out.println("Enter the Terms in Months: ");
        termMonths = keyboard.nextInt();
           
    // calculate monthly payment
        monthlyPayment = (amtBorrowed * interestRateMonthly) / 
                (1 - Math.pow(1 + interestRateMonthly, - termMonths));
        
        System.out.println("The monthly Payment is: " + 
                decimalFormatter.format(monthlyPayment) + "\n");
        
    
        
       
    // Output information in table format
        System.out.printf("%-8s","Month\t");
        System.out.printf("%-6s","Monthly\t");
        System.out.printf("%-5s","Interest\t");   
        System.out.printf("%-4s", "Principal\t");
        System.out.printf("%-10s", "Remaining\t");
        System.out.println("");
        
        System.out.printf("%-9s","Number\t");
        System.out.printf("%-7s","Payment\t");
        System.out.printf("%-13s","Paid\t");   
        System.out.printf("%-13s", "Paid\t");
        System.out.printf("%-10s", "Balance\t");
        System.out.println("\n");
        
        
    // Loop for processing monthly payment, interest, principle, & balance
    // counts number of months to pay off loan.
        while (termMonths >= monthCount)
        {
        //calculations for each month, keep monthly payment the same!
        //update balance so loop starts with correct balance for month 1
        
        interestPaid = balance * interestRateMonthly;
        interestPaidTotal = interestPaidTotal + interestPaid;
        
        principalPaid = monthlyPayment - interestPaid;
        balance = balance - principalPaid;
        
        //prints information in table format
        System.out.printf("%-7s", monthCount + "\t");
        System.out.printf("%-10s", decimalFormatter.format(monthlyPayment) + "\t");
        System.out.printf("%-10s", decimalFormatter.format(interestPaid) + "\t");   
        System.out.printf("%-8s", decimalFormatter.format(principalPaid) + "\t");
        System.out.printf("%-10s", decimalFormatter.format(balance) + "\t");
        System.out.println("");
        
        //increase month counter
        monthCount++;
        }
        
    //Final output for total months taken & interest paid
        System.out.println("It will take you " + --monthCount + " to pay off the"
                + " house.");
        System.out.println("You will have paid " + 
                decimalFormatter.format(interestPaidTotal) + " in interest.");
        
    }
    
}
