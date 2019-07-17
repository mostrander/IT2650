/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meganostrander_chapter7_problem6;

/**
 *
 * @author Michael
 */
public class Truck extends VehicleClass {
    
    //create private variables to hold information from user
    //specific to this type of class/object/vehicle
    
    double loadCapacity;
    int towCapacity;
    
    //constructor methods
    
    public Truck() //nothing given
    {
        super();
        loadCapacity = 0.0;
        towCapacity = 0;
    }
    
    public Truck(String manufacturerGiven) //manufacturer given
    {
        super(manufacturerGiven);
        loadCapacity = 0;
        towCapacity = 0;
    }
    
    public Truck(String theName, String manufacturerGiven) //name & manufacturer given
    {
        super(theName, manufacturerGiven);
        loadCapacity = 0;
        towCapacity = 0;
    }
    
    public Truck(String theName, String manufacturerGiven, 
            double loadCapacityGiven, int towCapacityGiven)
    {
        super(theName, manufacturerGiven);
        this.loadCapacity = loadCapacityGiven;
        this.towCapacity = towCapacityGiven;
    }
    
    public Truck(String theName, String manufacturerGiven, int cylindersGiven,
            double loadCapacityGiven, int towCapacityGiven )
    {
        super(theName, manufacturerGiven, cylindersGiven);
        this.loadCapacity = loadCapacityGiven;
        this.towCapacity = towCapacityGiven;
    }
    
    
    //set methods
    public void setCapacity(double newLoadCapacity, int newTowCapacity )
    {
        loadCapacity = newLoadCapacity;
        towCapacity = newTowCapacity;
    }
    
    public void setLoadCapacity(double newLoadCapacity)
    {
        loadCapacity = newLoadCapacity;
    }
    
    public void setTowCapacity(int newTowCapacity)
    {
        towCapacity = newTowCapacity;
    }
    
    
    //get methods
    public String getCapacity()
    {
        return "Load Capacity: " + loadCapacity + ", Towing Capacity: "
                + towCapacity;
    }
    
    public int getTowCapacity()
    {
        return towCapacity;
    }
    
    public double getLoadCapacity()
    {
        return loadCapacity;
    }
    
    
    public String toString(String name)
    {
        return "" + getManufacturer() + ", " + getCylinders() + 
                " cylinders, owned by ";
    }
    
    
    //equals method 
    public boolean equals(Truck otherTruck, String manufacturer)
    {
        if (otherTruck == null)
        {
            return false;
        }
        if (!(otherTruck instanceof Truck))
        {
            return false;
        }
        
        if (getClass() != otherTruck.getClass())
        {
            return false;
        }
        
        if (manufacturer != otherTruck.getManufacturerONLY())
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
}
