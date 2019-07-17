/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 4, Problem 9
 * Purpose of Assignment: ...
 *
 */
package meganostrander_chapter4_problem9;

import java.text.DecimalFormat;

/**
 *
 * @author Megan Ostrander
 */

public class SpeciesRecord {
    
    //create private variables to store user information. speciesName set to blank
    //so toString method does not return null when called without value.
    private String speciesName;
    private int speciesPopulation;
    private double speciesGrowthRate;
    
    //Create DecimalFormat object to format speciesGrowthRate for output
    DecimalFormat decimalRate = new DecimalFormat("##0.00");
    
    
    /**Default constructor
     * 
     */
    public SpeciesRecord()
    {
        speciesName = "";
        speciesPopulation = 0;
        speciesGrowthRate = 0;
    }
    
    /**Constructor that initializes with name provided
     * 
     * @param name 
     */
    public SpeciesRecord(String name)
    {
        speciesName = name;
        speciesPopulation = 0;
        speciesGrowthRate = 0;
    }
    
    /**Constructor that initializes with name & population value provided
     * 
     * @param name
     * @param population 
     */
    public SpeciesRecord(String name, int population)
    {
        speciesName = name;
        speciesPopulation = population;
        speciesGrowthRate = 0;
    }
    
    /**Constructor that initializes with all information provided by user
     * 
     * @param name
     * @param population
     * @param growthRate 
     */
    public SpeciesRecord(String name, int population, double growthRate)
    {
        speciesName = name;
        speciesPopulation = population;
        speciesGrowthRate = growthRate;
    }
    
    
    
    
    
    /**
     * Method returns stored information for species to user when program calls
     * @return string of species information.
     */
    public String toString()
    {
        return ("Name: " + speciesName + ", Current population: " 
                + speciesPopulation + ", Growth rate: " 
                + decimalRate.format(speciesGrowthRate));
    }
    
    /**
     * Mutator Method for setting the name of species after initial creation.
     * @param name 
     * @return
     */
    public void SetName(String name)
    {
        System.out.println("Setting name.");
        this.speciesName = name;
    }
    
    /**
     * Method for resetting the population of a SpeciesRecord object
     * @param population 
     */
    public void SetPopulation(int population)
    {
        System.out.println("Setting population.");
        this.speciesPopulation = population;
    }
    
    /**
     * Method for resetting the growthRate of a SpeciesRecord object
     * @param growthRate 
     */
    public void SetGrowthRate(double growthRate)
    {
        System.out.println("Setting growth rate.");
        this.speciesGrowthRate = growthRate;
    }
    
    
    /**accessor methods for retrieving private variable values
     * retrieves value from speciesName
     * @return name of species object
     */
    public String GetName()
    {
        return this.speciesName;
    }
    
    /**
     * Method for retrieving the value in speciesPopulation variable
     * @return population value for species object
     */
    public int GetPopulation()
    {
        return this.speciesPopulation;
    }
    
    /**
     * Method for obtaining and formatting value from growthRate variable.
     * @return value within growthRate variable, formats to 0.00%
     */
    public String GetGrowthRate()
    {
        return decimalRate.format(this.speciesGrowthRate);
    }
    
    /** 
     * Method checks growth rate of species and returns true if negative
     * @return true if negative growth rate %, false if positive growth rate %
     */
    public boolean IsEndangered()
    {
        if (this.speciesGrowthRate < 0)
                return true;
        else
            return false;
    }
       
    
    /**
     * Method for determining if one Animal species record holds the same 
     * information / data as another species record.
     * @param other
     * @return 
     */
    public boolean equals(SpeciesRecord other) //can leave as other! instead of otherSpeciesRecord
    {
        return ( ((this.speciesName).equals(other.speciesName)) );
    }
    
    
    
    
}
