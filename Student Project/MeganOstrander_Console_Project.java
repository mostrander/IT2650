/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Student Projecty
 * Purpose of Assignment: To create a GUI that runs three different types of 
 *      loops (for loop, while loop, do while loop) when the corresponding 
 *      buttons are pressed. Loops process 2 equations for 10 million iterations.
 *      Loops are used to compare the time differences between loop types.
 * 
 *
 */
package meganostrander_console_project;

import java.util.Scanner;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author Megan Ostrander
 */
public class MeganOstrander_Console_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Student Project");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        double doubleSquared = 0.0;
        double doubleLog = 0.0;
        double doubleElapsedTime = 0.0;
        int intLoops = 0;
        int intCounter = 1;
        
        //formatter for dates
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        
   
        //gets current date & hour, place hour value in timeOfDay variable
        Calendar c = Calendar.getInstance();
        int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
        LocalDateTime startTime = LocalDateTime.now();
        
 
        //gets current date & hour, place hour value in timeOfDay variable
        Calendar d = Calendar.getInstance();
        int timeOfDay2 = d.get(Calendar.HOUR_OF_DAY);

        //get end time in hour/min/sec format
        LocalDateTime endTime = LocalDateTime.now();
        endTime = LocalDateTime.now();
        
        
        //START OF DO WHILE LOOP
        System.out.println("Do While Loop: \n");
        
        //gets start time, both in hour/min/sec & millisecond format
        startTime = LocalDateTime.now();
        long start = System.currentTimeMillis();

        //checks for AM or PM conditions
        if (timeOfDay >= 0 && timeOfDay < 12)
        {
            System.out.println("Start time: " + dtf.format(startTime) + " AM");
        }
        else
        {
            System.out.println("Start time: " + dtf.format(startTime) + " PM");
        }

        
        //Do While loop
        do {
            intCounter++; //increase by 1
            intLoops++; //increase by 1

            doubleSquared = Math.pow(intCounter, 2);
            doubleLog = Math.log10(intCounter);
        } while (intCounter < 10000001);
        

        //gets current date & hour, place hour value in timeOfDay variable
        d = Calendar.getInstance();
        timeOfDay2 = d.get(Calendar.HOUR_OF_DAY);

        //get end time in hour/min/sec format
        endTime = LocalDateTime.now();

        //gets end time in milliseconds
        long end = System.currentTimeMillis();

        //checks for AM or PM conditions
        if ((timeOfDay2 >= 0) && (timeOfDay2 < 12))
        {
            System.out.println("End time: " + dtf.format(endTime) + " AM");
        }
        else
        {
            System.out.println("End time: " + dtf.format(endTime) + " PM");
        }

        DecimalFormat secondsFormat = new DecimalFormat("##0.#########");

        //subtract previous results, returns difference in milliseconds
        float sec = (end - start) / 1000F;

        //formats the milliseconds
        String Elapse = (secondsFormat.format(sec));
        
        System.out.println("Elapse time: " + Elapse);
        System.out.println("Number of Loops: " + Integer.toString(intLoops));
        System.out.println("");
        
        
        
        
        //START OF FOR LOOP
        System.out.println("For Loop: \n");
        
        //reset all variables
        doubleSquared = 0.0;
        doubleLog = 0.0;
        doubleElapsedTime = 0.0;
        intLoops = 0;
        intCounter = 1;
        
        //gets start time, both in hour/min/sec & millisecond format
        startTime = LocalDateTime.now();
        start = System.currentTimeMillis();

        //checks for AM or PM conditions
        if (timeOfDay >= 0 && timeOfDay < 12)
        {
            System.out.println("Start time: " + dtf.format(startTime) + " AM");
        }
        else
        {
            System.out.println("Start time: " + dtf.format(startTime) + " PM");
        }

        
        
        for (intCounter = 1; intCounter < 10000001; ++intCounter)
        {
            intLoops = intLoops + 1; // this starts at 0

            //cannot use intCounter for these!
            doubleSquared = Math.pow(intLoops, 2);
            doubleLog = Math.log10(intLoops);
        }
        

        //gets current date & hour, place hour value in timeOfDay variable
        d = Calendar.getInstance();
        timeOfDay2 = d.get(Calendar.HOUR_OF_DAY);

        //get end time in hour/min/sec format
        endTime = LocalDateTime.now();

        //gets end time in milliseconds
        end = System.currentTimeMillis();

        //checks for AM or PM conditions
        if ((timeOfDay2 >= 0) && (timeOfDay2 < 12))
        {
            System.out.println("End time: " + dtf.format(endTime) + " AM");
        }
        else
        {
            System.out.println("End time: " + dtf.format(endTime) + " PM");
        }

        //subtract previous results, returns difference in milliseconds
        sec = (end - start) / 1000F;

        //formats the milliseconds
        Elapse = (secondsFormat.format(sec));
        
        System.out.println("Elapse time: " + Elapse);
        System.out.println("Number of Loops: " + Integer.toString(intLoops));
        System.out.println("");
        
        
       
        

        //START OF WHILE LOOP
        System.out.println("While Loop: \n");
        
        //reset all variables
        doubleSquared = 0.0;
        doubleLog = 0.0;
        doubleElapsedTime = 0.0;
        intLoops = 0;
        intCounter = 1;
        
        //gets start time, both in hour/min/sec & millisecond format
        startTime = LocalDateTime.now();
        start = System.currentTimeMillis();

        //checks for AM or PM conditions
        if (timeOfDay >= 0 && timeOfDay < 12)
        {
            System.out.println("Start time: " + dtf.format(startTime) + " AM");
        }
        else
        {
            System.out.println("Start time: " + dtf.format(startTime) + " PM");
        }

        //reset loop counter
        intLoops = 0;
        
        while (intCounter < 10000001) //do 10 million loops
        {
            intCounter = intCounter + 1; // this starts at 1
            intLoops = intLoops + 1; // this starts at 0

            doubleSquared = Math.pow(intCounter, 2);
            doubleLog = Math.log10(intCounter);
        }
        

        
        //gets current date & hour, place hour value in timeOfDay variable
        d = Calendar.getInstance();
        timeOfDay2 = d.get(Calendar.HOUR_OF_DAY);

        //get end time in hour/min/sec format
        endTime = LocalDateTime.now();

        //gets end time in milliseconds
        end = System.currentTimeMillis();

        //checks for AM or PM conditions
        if ((timeOfDay2 >= 0) && (timeOfDay2 < 12))
        {
            System.out.println("End time: " + dtf.format(endTime) + " AM");
        }
        else
        {
            System.out.println("End time: " + dtf.format(endTime) + " PM");
        }

        //subtract previous results, returns difference in milliseconds
        sec = (end - start) / 1000F;

        //formats the milliseconds
        Elapse = (secondsFormat.format(sec));
        
        System.out.println("Elapse time: " + Elapse);
        System.out.println("Number of Loops: " + Integer.toString(intLoops));
        System.out.println("");
    }
    
}
