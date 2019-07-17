/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 6, Problem 4
 * Purpose of Assignment: To create a method that deletes repeated data in an 
 *                  array(s) by accepting two variables: the array itself, and 
 *                  an int value that keeps track of the array size. Array 
 *                  elements should move to fill empty spaces, too.
 *
 */
package meganostrander_chapter6_problem4;

/**
 *
 * @author Megan Ostrander
 */

import java.util.*;
import java.lang.*;

public class MeganOstrander_Chapter6_Problem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 6, Problem 4");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        //create arrays for testing 'delete repeats' method
        char [] example1 = {'a', 'b', 'c'};
        char [] example2 = {'a', 'b', 'c', 'c'};
        char [] example3 = {'a', 'a', 'b'};
        char [] example4 = {'b', 'a', 'a'};
        char [] example5 = {'c', 'c', 'c', 'd'};
        char [] example6 = {'a', 'b', 'a', 'c', 'a', 'a', 'c', 'd', 'e', 'e'};
        char [] example7 = {'a', 'a', 'b', 'b', 'b', 'c', 'd'};
        
        int index;
        
        //output original arrays, followed by modified version post deletion
        System.out.println("Example 1:");
        System.out.print("Original array value: ");
        
        for (index = 0; index < example1.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example1[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example1);
        
        System.out.println("\n");
        
        System.out.println("Example 2:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example2.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example2[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example2);
        
        
        System.out.println("\n");
        
        System.out.println("Example 3:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example3.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example3[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example3);
        
        
        System.out.println("\n");
        
        System.out.println("Example 4:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example4.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example4[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example4);
        
        
        System.out.println("\n");
        
        System.out.println("Example 5:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example5.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example5[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example5);
        
        
        System.out.println("\n");
        
        System.out.println("Example 6:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example6.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example6[index] + ",");
        }
        System.out.println("\n");
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example6);
        
        
        System.out.println("\n");
        
        System.out.println("Example 7:");
        System.out.print("Original array value: " );
        
        for (index = 0; index < example7.length; index++) //read elements from array as long as index is less than length of array
        {
            System.out.print(example7[index] + ",");
        }
        System.out.println("\n");
        
        
        System.out.print("Revised array value after repeats removed: ");
        deleteRepeats(example7);
        
        
        
        
        
        //used to tell how many elements in original array
        //System.out.println(example7.length);
        
        //create a list object to hold array values!
        //for example6 array
        /*List<Character> exampleList6 = new ArrayList<Character>();
        for (char c : example6) 
        {
            exampleList6.add(c);
        }
        
        //sorts the list in order!
        Collections.sort(exampleList6);
        */
        
        
        
    }
    
    /* This is HOW to create a list using an array, and sort it.
    * char [] original refers to whatever array is sent to it. NOT an array CALLED
    * 'original'
    private static void Sort(char [] original)
    {
        List<Character> charList = new ArrayList<Character>();
        for (char c : original) 
        {
            charList.add(c);
        }
        
        Collections.sort(charList);
    }
    */
    
    private static void deleteRepeats(char [] original)
    {
        List<Character> charList = new ArrayList<Character>();
        for (char c : original) 
        {
            charList.add(c);
        }
        
        Collections.sort(charList);
        
        //System.out.println(original); TEST for sorting
        //System.out.println(charList);
        
        //This is how you convert list BACK to array
        Character [] revisedEx1 = 
                charList.toArray(new Character[charList.size()]);
        
        
        //creates a NEW array with MAX size of revisedEx1 array length.
        char [] noDuplicate = new char[revisedEx1.length + 1];
        
        //places value of element 1 in revisedEx1 to noDuplicate [0]
        noDuplicate[0] = revisedEx1[0];
     
        int j = 1;
        
        //A loop for removing duplicates.
        for (int index = 0; index < revisedEx1.length - 1; index++ )
        {
            
            if (revisedEx1[index] != revisedEx1[index + 1])
            {
                //System.out.println("index="+index );
                //System.out.println("revisedEx1[index]="+revisedEx1[index] );
                //System.out.println("revisedEx1[index+1]="+revisedEx1[index+1] );
                
                noDuplicate[j] = revisedEx1[index + 1];
                
                //System.out.println("noDuplicate="+noDuplicate);
                j++;
            }
            else
                continue;
            
        }
        
        
        //if array element is NOT empty, print with a ','
        for (int i = 0; i < noDuplicate.length; i++)
        {
            if (noDuplicate[i] != '\u0000') //the default empty value for arrays (code)!
            {
                System.out.print(noDuplicate[i] + ",");
            }
            else
                continue;
        }
        

        System.out.println("\n");

       
        
    }
    
}
