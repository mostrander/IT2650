/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 4, Problem 9
 * Purpose of Assignment: To test a species program class created in another 
 *                      file. Store methods for program in SpeciesRecord class
 *                      and send information through constructors to class.
 *
 */
package meganostrander_chapter4_problem9;


//Import Java classes needed for program to function
import java.text.DecimalFormat;
import java.util.Scanner;

public class MeganOstrander_Chapter4_Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 4, Problem 9");
        System.out.println("______________________________________");
        System.out.println("");
        
        //Create scanner object keyboard to take user input
        Scanner keyboard = new Scanner(System.in);
        
        //Creates object of Species class, initialized without any data.
        //Uses default constructor
        SpeciesRecord Unicorn = new SpeciesRecord();
        
        //create variables to hold species information, initialize defaults
        String name;
        int population = 0;
        double growthRate = 0;
        
        //outputs initial species information by calling toString method
        System.out.println("Record is: " + Unicorn.toString() + "%");
        
        //Use SetName method from SpeciesRecord class to rename Unicorn object
        Unicorn.SetName("Unicorn");
        
        //outputs new species information by calling toString method
        System.out.println("Record is now: " + Unicorn.toString() + "%");
        
        
        //Use SpeciesRecord constructors to initalize 2 more objects with data
        SpeciesRecord Rabbit = new SpeciesRecord("Rabbit");
        SpeciesRecord Horse = new SpeciesRecord("Horse", 3000);
        
        //Output initial data for new objects
        System.out.println("Record is: " + Rabbit.toString() + "%");
        System.out.println("Record is: " + Horse.toString() + "%");
        
        //Reset growthRate for horse object, output results
        Horse.SetGrowthRate(56.70);
        System.out.println("Record is now: " + Horse.toString() + "%");
        
        
        //Create ANOTHER SpeciesRecord object: Dodo
        //Must pass population variable for constructor to accept growth rate
        //Output results
        SpeciesRecord Dodo = new SpeciesRecord("Dodo", 0, -33.50);
        System.out.println("Record is: " + Dodo.toString() + "%");
        
        //Reset population for Dodo object, output results
        Dodo.SetPopulation(2);
        System.out.println("Record is now: " + Dodo.toString() + "%");
        
        
        //Create German Shepard object, initialize with all data, output data
        SpeciesRecord GermanShepherd = new SpeciesRecord("German Shepherd", 
                                                                550, 45.00);
        System.out.println("Record is: " + GermanShepherd.toString() + "%");
        
        
        //Retrieve various information. Output results.
        System.out.println("Getting population of rabbits: " 
                                            + Rabbit.GetPopulation());
        System.out.println("Getting growth rate of German Shephards: "
                                            + GermanShepherd.GetGrowthRate());
        System.out.println("Getting name from first record: " 
                + Unicorn.GetName() ); //????
        
        System.out.println("The Dodo is endangered: " + Dodo.IsEndangered());
        System.out.println("The rabbit is endangered: "+ Rabbit.IsEndangered());
        System.out.println("Horses and Unicorns are the same: "
                + Horse.equals(Unicorn));
        
        
        //Make an Identical German Shepard object. 
        System.out.println("Making an identical object of German Shepherds.");
        SpeciesRecord GermanShepherd2 = new SpeciesRecord("German Shepherd", 
                                                                550, 45.00);
        System.out.println("Duplicate record is: " 
                                        + GermanShepherd2.toString() + "%");
        
        
        //Test to see if objects German Shephard and German Shephard2 contain
        //the same data
        System.out.println("Duplicate is same as original German Shepherd: "
                + GermanShepherd.equals(GermanShepherd2));
        System.out.println();
        
        
        
        
        
        
    }
    
}
