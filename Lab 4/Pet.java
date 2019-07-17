package meganostrander_chapter4_problem10;


/**
 Class for basic pet records: name, age, and weight.
*/

import java.text.DecimalFormat;

public class Pet
{
    private String name;
    private String type;//cat or dog
    private int age;//in years
    private double weight;//in pounds

    //create object to format drug dosage output.
    DecimalFormat dosage = new DecimalFormat("0.0000");
    
    
    public String toString( )
    {
        return ("Type: " + type + " Name: " + name + " Age: " + age + " years"
                       + "\nWeight: " + weight + " pounds");
    }

    public Pet(String initialName, String species, int initialAge, 
                                          double initialWeight)
    {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        else
        {
            type = species;
            age = initialAge;
            weight = initialWeight;
        }
    }

    public void set(String newName, String species, 
                                        int newAge, double newWeight)
    {
        name = newName;
        if ((newAge < 0) || (newWeight < 0))
        {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        }
        if (SpeciesOK(species))
        {
            type = species;
            age = newAge;
            weight = newWeight;
        }
        else
        {
            System.out.println("Error: Cannot complete record due to incorrect"
                    + " data. Please check information and try again.");
            System.out.println("Animal age and weight must be above 0."
                    + "\nAnimal type must be cat or dog.");
            System.exit(0);
        }
    }


    
    public boolean SpeciesOK(String species)
    {
        //System.out.println("SpeciesOK start"); // for testing
        return species.equals("cat") || species.equals("dog")
                || species.equals("Cat") || species.equals("Dog")
                || species.equals("CAT") || species.equals("DOG");   
    }
    

    
    //Following SetType & GetType work, verified!
    public void SetType(String species)
    {
        if (SpeciesOK(species))
            type = species;
        else
        {
            System.out.println("Error: Animal type is incorrect. "
                    + "Must be a cat or dog.");
            System.exit(0);
        }
    }
    
    
    public String GetType()
    {
        System.out.println("GetType start"); // for testing
        return "Animal type is set to: " + type;
    }
    
    
    public Pet(String initialName)
    {
        name = initialName;
        age = 0;
        weight = 0;
    } 

    public void setName(String newName)
    {
        name = newName; 
    }

    public Pet(int initialAge)
    {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = initialAge;
    }

    public void setAge(int newAge)
    {
        if (newAge < 0)
        {
            System.out.println("Error: Negative age.");
            System.exit(0);
        }
        else
            age = newAge;
    }

    public Pet(double initialWeight)
    {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = initialWeight;
    }

    public void setWeight(double newWeight)
    {
        if (newWeight < 0)
        {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        }
        else
            weight = newWeight;
    }

    public Pet( )
    {
        name = "No name yet.";
        age = 0;
        weight = 0; 
    }

    public String getName( )
    {
        return name;
    }

    public int getAge( )
    {
        return age;
    }

    public double getWeight( )
    {
        return weight;
    }
    
    
    public double acepromazine()
    {
        if (type.equals("cat") || type.equals("Cat") || type.equals("CAT"))
        {
            return (weight / 2.2) * (.002 / 10);
        }
        if (type.equals("dog") || type.equals("Dog") || type.equals("DOG"))
        {
            return (weight / 2.2) * (.03 / 10);
        }
        else 
            return 0;
    }
    
    
    public double carprofen()
    {
        if (type.equals("cat") || type.equals("Cat") || type.equals("CAT"))
        {
            return (weight / 2.2) * (.25 / 12);
        }
        if (type.equals("dog") || type.equals("Dog") || type.equals("DOG"))
        {
            return (weight / 2.2) * (.5 / 12);
        }
        else 
            return 0;
    }
    
    
}
