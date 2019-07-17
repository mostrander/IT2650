/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 7, Problem 6
 * Purpose of Assignment: To utilize inheritance for a truck class that derives
 *              part of its values and methods from a base class of vehicle.
 *              Truck extends the vehicle class. 
 *
 */
package meganostrander_chapter7_problem6;

/**
 *
 * @author Megan
 */

import meganostrander_chapter7_problem6.Person;
import meganostrander_chapter7_problem6.VehicleClass;
import meganostrander_chapter7_problem6.Truck;
        
public class MeganOstrander_Chapter7_Problem6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 7, Problem 6");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        //Initialize the variables that will be passed to constructors
        String theName;
        double loadCapacityGiven;
        int towCapacityGiven;
        String manufacturerGiven;
        int cylindersGiven;
        
        
        //Create new person objects
        Person p1 = new Person();
        
        System.out.println("p1:" + p1); //output current name, should be blank
        
        p1.setName("Bob"); //reset p1 name
        
        System.out.println("p1's name is: " + p1.toString()); //output updated name
        
        
        //create new person object
        Person p2 = new Person("Joe");
        
        System.out.println("p2: " + p2); //output current name, should be "Joe"
        
        
        //create p3 Person object, copy p1 info to p3
        Person p3 = new Person();
        p3 = p1; //should be same data now
        
        
        //test p1, p2, p3 objects for equality
        System.out.println("p3 equal to p1: " + p3.equals(p1)); //true
        System.out.println("p2 equal to p1: " + p2.equals(p1)); //false
        
        
        //Create new vehicle object
        VehicleClass v1 = new VehicleClass();
        System.out.println("v1: " + v1);
        
        v1.setManufacturer("Ford"); //should reset manufacturer data to ford
        System.out.println("v1's " + v1.getManufacturer());
        
        v1.setOwner("Joe"); //should reset v1 owner to "joe"
        v1.setCylinders(4); //should reset v1 cylinders to value = 4
        
        //call methods to obtain new v1 data.
        System.out.println("v1's " + v1.getCylinders());
        System.out.println("v1's owner is: " + v1.getOwner());
        
        //WORKS UP TO THIS POINT!
        
        //create new vehicle object
        VehicleClass v2 = new VehicleClass("Betty", "Chevy", 4 );
        System.out.println("v2: " + v2);
        
        
        //create new vehicle object 
        VehicleClass v3 = new VehicleClass();
        v3 = v1;
        
        System.out.println("v3 equal to v1: " + v3.equals(v1)); //true
        System.out.println("v2 equal to v1: " + v2.equals(v1)); //false
        
        
        //create new truck object
        Truck t1 = new Truck();
        System.out.println("t1: " + t1.toString() + ", " +
                " " + t1.getCapacity());
        
        //change t1 information with set methods
        t1.setCapacity(54.36, 10); //set load, tow capacity
        
        System.out.println("t1's load capacity is: " + t1.getLoadCapacity());
        System.out.println("t1's towing capacity is: " + t1.getTowCapacity());
        
        
        //create new truck object
        Truck t2 = new Truck("Betty", "Chevy", 4, 34.5, 65);
        System.out.println("t2: " + t2 + ", " + t2.getCapacity());
        
        //create new truck object, set it with t1 data
        Truck t3 = new Truck();
        t3 = t1;
        
        
        System.out.println("t3 equal to t1: " + t3.equals(t1)); //true
        System.out.println("t2 equal to t1: " + t2.equals(t1)); //false
        
        
        
    }
    
}
