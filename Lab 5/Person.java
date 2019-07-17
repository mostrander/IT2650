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


        
public class Person {
    
    private String name;
    
    
    //methods
    
    public Person()
    {
        this.name = ""; //leave blank since no name was entered.
    }
    
    public Person(String theName)
    {
        if (theName == null)
        {
            System.out.println("Fatal error setting name.");
            System.exit(0);
        }
        
        this.name = theName; //place input into private name variable.
    }
    
    public Person(Person theObject)
    {
        this.name = theObject.name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String newName)
    {
        if (newName == null)
        {
            System.out.println("Fatal error setting name.");
            System.exit(0);
        }
        else
        {
            this.name = newName;
        }
    }
    
    public String toString()
    {
        return name;
    }
    
    
    
    public boolean equals (Person otherPerson, String name)
    {
        if (otherPerson == null)
        {
            return false;
        }
        
        if (!(otherPerson instanceof Person))
        {
            return false;
        }
        
        if ((getClass() != otherPerson.getClass()))
        {
            return false;
        }
        
        if (!(name == otherPerson.name))
        {
            return false;
        }
        
        else
        {
            return true;
        }
    }
    
}
