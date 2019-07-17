/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 4, Problem 10
 * Purpose of Assignment: To alter the chapter 4 Pet java project files so it 
 *                      includes input for type of animal (cat or dog), and
 *                      calculation methods for acepromazine & carprofen.
 *
 */
package meganostrander_chapter4_problem10;


import java.text.DecimalFormat;
import java.util.Scanner;

public class PetDemo
{
    public static void main(String[] args)
    {
        
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 4, Problem 10");
        System.out.println("______________________________________");
        System.out.println("");
        
        //create object to format drug dosage output.
        DecimalFormat dosage = new DecimalFormat("0.0000");
    
    
        Pet usersPet = new Pet("Jane Doe");
        System.out.println("My records on your pet are incomplete.");
        System.out.println("Here is what they currently say:");
        System.out.println(usersPet);

        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the pet's name:");
        String name = keyboard.nextLine( );
        
        
        //Prompt for use to specify if animal is a cat or dog
        System.out.println("Please enter the pet's type (cat or dog): ");
        String species = keyboard.nextLine();
        
        
        //For testing species is cat or dog.
        //usersPet.SpeciesOK(species); //method for testing if cat or dog
        //System.out.println(usersPet.GetType()); // returns null because not set yet!
        //usersPet.SetType(species); //test for setting type with animal species check
        //System.out.println(usersPet.GetType()); //should return as cat or dog only
        
        
        //prompt for rest of user input
        System.out.println("Please enter the pet's age:");
        int age = keyboard.nextInt( );
        System.out.println("Please enter the pet's weight:");
        double weight = keyboard.nextDouble( );
        usersPet.set(name, species, age, weight);
        
        //output updated information + output drug dosage information
        System.out.println("My records now say:");
        System.out.println(usersPet.toString());
        
        System.out.println("Dose of carprofen: " 
                                + dosage.format(usersPet.carprofen()));
        System.out.println("Dose of acepromazine: " 
                             + dosage.format(usersPet.acepromazine()));
        
        
    }
}
