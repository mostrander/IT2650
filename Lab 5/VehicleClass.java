/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meganostrander_chapter7_problem6;

/**
 *
 * @author Megan
 */


import meganostrander_chapter7_problem6.Person;

public class VehicleClass {
    
    //create private variables that hold user input information
    private String manufacturer;
    private int cylinders;
    private Person owner;
    
    
    //constructors
    public VehicleClass()
    {
        owner = new Person();
        this.manufacturer = "None";
        this.cylinders = 0;
        
    }
    
    public VehicleClass(String manufacturerGiven)
    {
        this.manufacturer = manufacturerGiven;
    }
    
    public VehicleClass(String theName, String manufacturerGiven)
    {
        this.owner = new Person(theName);
        this.manufacturer = manufacturerGiven;
    }
    
    public VehicleClass(String theName, String manufacturerGiven, 
            int cylindersGiven)
    {
        this.owner = new Person(theName);
        this.manufacturer = manufacturerGiven;
        this.cylinders = cylindersGiven;
    }
    
    
    
    //set method for changing name of owner
    public void setOwner(String newName)
    {
        this.owner = new Person(newName); 
    }
    
    
    //set method for changing cylinders data
    public void setCylinders(int newCylinders)
    {
        this.cylinders = newCylinders;
    }
    
    
    //set method for changing manufacturer information
    public void setManufacturer(String newManufacturerGiven)
    {
        this.manufacturer = newManufacturerGiven;
    }
    
    
    //methods for returning different pieces of information.
    public String getOwner()
    {
        return "" + owner;
    }
    
    public String getCylinders()
    {
        return "cylinders " + cylinders  ;
    }
    
    public String getManufacturer()
    {
        return "manufacturer is: " + manufacturer;
    }
    
    public String getManufacturerONLY()
    {
        return manufacturer;
    }
    
    
    public String toString()
    {
        return manufacturer + ", " + cylinders + " cylinders, " + 
                "owned by " + owner;
    }
    
    
    //equals method 
    public boolean equals(VehicleClass otherVehicleClass, String manufacturer)
    {
        if (otherVehicleClass == null)
        {
            return false;
        }
        if (!(otherVehicleClass instanceof VehicleClass))
        {
            return false;
        }
        
        if (getClass() != otherVehicleClass.getClass())
        {
            return false;
        }
        
        if (manufacturer != otherVehicleClass.manufacturer)
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
}
