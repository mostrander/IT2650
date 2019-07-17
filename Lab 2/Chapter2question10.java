/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 2, Problem 10
 * Purpose of Assignment: To output the name, quantity, and price of 3 items
                and display the information with dollar signs in column format
 *
 */
package chapter2question10;

//Import necessary classes for program
import java.util.Scanner;
import java.text.DecimalFormat;

public class Chapter2question10 {

    
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 2, Problem 10");
        System.out.println("______________________________________");
        System.out.println("");
        
    // create scanner & formatter objects for user input
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat moneyFormat = new DecimalFormat("$#####0.00");
        
    // create variables to hold information for the quantity & price of 3 items
        String item1;
        String item2;
        String item3;
    
        int quantity_item1;
        int quantity_item2;
        int quantity_item3;
        
        double price_item1;
        double price_item2;
        double price_item3;
        
        double subtotal;
        double total;
        double salesTax;
        
        double itemPriceTotal1;
        double itemPriceTotal2;
        double itemPriceTotal3;
        
    // Provide instructions to user for input, place in variables
        System.out.println("Please enter the name of Item 1: ");
        item1 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the quantity of Item 1: ");
        quantity_item1 = keyboard.nextInt();  
        System.out.println("");
        
        System.out.println("Please enter the price of a single Item 1 WITHOUT "
                + "the dollar sign: ");
        price_item1 = keyboard.nextDouble();   
        System.out.println("");
        
    // remove escape character & whitespace so name of item 2 can be multi-word     
        String junk = keyboard.nextLine();
        
    // item 2 information    
        System.out.println("Please enter the name of Item 2: ");
        item2 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the quantity of Item 2: ");
        quantity_item2 = keyboard.nextInt();  
        System.out.println("");
        
        System.out.println("Please enter the price of a single Item 2 WITHOUT "
                + "the dollar sign: ");
        price_item2 = keyboard.nextDouble();  
        System.out.println("");
        
    // remove escape character & whitespace so name of item 3 can be multi-word    
        String junk2 = keyboard.nextLine();
        
    // item 3 information    
        System.out.println("Please enter the name of Item 3: ");
        item3 = keyboard.nextLine();
        System.out.println("");
        
        System.out.println("Please enter the quantity of Item 3: ");
        quantity_item3 = keyboard.nextInt();
        System.out.println("");
        
        System.out.println("Please enter the price of a single Item 3 WITHOUT "
                + "the dollar sign: ");
        price_item3 = keyboard.nextDouble();
        System.out.println("");
 
    // repeat input to user
        System.out.println("Name of Item 1:\n" + item1 + "\nQuantity of Item 1\n"
                + quantity_item1 + "\nPrice of Item 1\n" + price_item1 + "\n");
        System.out.println("Name of Item 2:\n" + item2 + "\nQuantity of Item 2\n"
                + quantity_item2 + "\nPrice of Item 2\n" + price_item2 + "\n");
        System.out.println("Name of Item 3:\n" + item3 + "\nQuantity of Item 3\n"
                + quantity_item3 + "\nPrice of Item 3\n" + price_item3 + "\n");
    
    // calculate subtotal, sales tax & total
        itemPriceTotal1 = quantity_item1 * price_item1;
        itemPriceTotal2 = quantity_item2 * price_item2;
        itemPriceTotal3 = quantity_item3 * price_item3;
        
        subtotal = (itemPriceTotal1) + (itemPriceTotal2) + (itemPriceTotal3);
        double finalSubtotal = subtotal;
        
        salesTax = subtotal * (0.0625);
        double finalSalesTax = salesTax;
        
        total = subtotal + salesTax;
        
        
    //Output the Invoice, format into 4 columns
    // Output information in table format
    System.out.println("------------------ Invoice ------------------");
    
    System.out.printf("%-30s", "Item");
    System.out.printf("%-10s", "Quantity");
    System.out.printf("%-10s", "Price");
    System.out.printf("%-10s", "Total" );
    System.out.println("");
       
    System.out.printf("%-30s", item1 );
    System.out.printf("%-10s", quantity_item1 );
    System.out.printf("%-10s", moneyFormat.format(price_item1) );
    System.out.printf("%-10s", moneyFormat.format(itemPriceTotal1) );
    System.out.println("");
     
    System.out.printf("%-30s", item2 );
    System.out.printf("%-10s", quantity_item2 );
    System.out.printf("%-10s", moneyFormat.format(price_item2));
    System.out.printf("%-10s", moneyFormat.format(itemPriceTotal2) );
    System.out.println("");
    
    System.out.printf("%-30s", item3 );
    System.out.printf("%-10s", quantity_item3 );
    System.out.printf("%-10s", moneyFormat.format(price_item3) );
    System.out.printf("%-10s", moneyFormat.format(itemPriceTotal3) );
    System.out.println("\n");
    
    System.out.printf("%-30s", "Subtotal");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", moneyFormat.format(finalSubtotal));
    System.out.println("");
    
    System.out.printf("%-30s", "6.25 Sales Tax");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", moneyFormat.format(finalSalesTax));
    System.out.println("");
    
    System.out.printf("%-30s", "Total");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", "");
    System.out.printf("%-10s", moneyFormat.format(total));
    System.out.println("\n");
    
    }
    
}
