/*
 * ITMP-2650 Java Programming, Summer 2019
 * Instructor: Martin P. Walsh
 * Student Name: Megan Ostrander
 * Homework Assignment: Chapter 4, Problem 6
 * Purpose of Assignment: To calculate a student's final score in a course
 *                  that uses weighted grading, using two classes to separate
 *                  user input and calculations.
 *
 */
package meganostrander_chapter4_problem6;


//Import Java classes needed for program to function
import java.text.DecimalFormat;
import java.util.Scanner;

public class MeganOstrander_Chapter4_Problem6 {

    
    public static void main(String[] args) {
        //Information for class assignment printed to console.
        System.out.println("ITMP-2650 Java Programming");
        System.out.println("Student Name: Megan Ostrander");
        System.out.println("Homework Assignment: Chapter 4, Problem 6");
        System.out.println("______________________________________");
        System.out.println("");
        
        
        /** initialize overall possible score variables & weight variables, 
         * set to final to prevent alteration during program.
         * Also, allows programmer to easily change values in one location.
        */
        final int quizScorePossible = 10;
        final int totalQuizScorePossible = 30;
        final int totalMidtermScorePossible = 100;
        final int totalFinalScorePossible = 100;
        
        
        
        //Create user input and result format objects
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat grade = new DecimalFormat("##0.00");
        
        //Create object of StudentRecord class so you can use it!!
        StudentRecord student = new StudentRecord();
        
        //Initialize variables to hold user input.
        double quizScore1;
        double quizScore2;
        double quizScore3;
        double midtermScore;
        double finalScore;
//        double finalClassScore;
        double finalClassGrade;
        
        //Prompt user for input
        System.out.println("Enter the student's score on the first quiz"
                + " (10 Possible Points):");
        quizScore1 = keyboard.nextDouble();
        
        System.out.println("Enter the student's score on the second quiz"
                + " (10 Possible Points):");
        quizScore2 = keyboard.nextDouble();
        
        System.out.println("Enter the student's score on the third quiz"
                + " (10 Possible Points):");
        quizScore3 = keyboard.nextDouble();
        
        System.out.println("Enter the student's score on the midterm"
                + " (100 Possible Points):");
        midtermScore = keyboard.nextDouble();
        
        System.out.println("Enter the student's score on the final"
                + " (100 Possible Points):");
        finalScore = keyboard.nextDouble();
        
        
        /*Pass values to StudentRecord class */
        student.SetQuizScore(quizScore1, quizScore2, quizScore3, 
                quizScorePossible);
        student.SetMidtermScore(midtermScore, totalMidtermScorePossible);
        student.SetFinalScore(finalScore, totalFinalScorePossible);
        
        
        
     
       
       /** For testing Class StudentRecord to ensure information is passing
        * correctly between methods.
        * GetScores() retrieves the stored values for the 3 quizzes.
        
        System.out.println(student.GetScores()); 
        System.out.println(student.QuizAverage());
        System.out.println(student.MidtermAverage());
        System.out.println(student.FinalAverage());
       
        System.out.println(student.WeightedQuiz());
        System.out.println(student.WeightedMidterm());
        System.out.println(student.WeightedFinal());
       */
       
       
       // MUST call each method to run it, even if value is not used!!
        //student.GetScores(); 
        student.QuizAverage();
        student.MidtermAverage();
        student.FinalAverage();
       
        student.WeightedQuiz();
        student.WeightedMidterm();
        student.WeightedFinal();
        
        
        student.WeightedAverageScore();
        student.LetterGrade();
        
        
       
       /** Outputs the final results to the user console using Get methods
        * from the Class StudentRecord.
        */    
         System.out.println("Student Record: " + student.GetScores() + 
                 grade.format(student.GetFinalGrade()) + ", Letter Grade: " + 
                 student.LetterGrade());
    }
    
}
