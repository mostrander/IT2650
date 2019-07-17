
package meganostrander_chapter4_problem6;

    import java.text.DecimalFormat;

    public class StudentRecord {
        
        DecimalFormat grade = new DecimalFormat("##0");
        
        
        //Initialize variables for calculations
        private double quizScore1Received = 0;
        private double quizScore2Received = 0;
        private double quizScore3Received = 0;
        
        private double midtermScoreReceived = 0;
        private double finalScoreReceived = 0;

        //Final output variables
        //Note: methods can pull these directly! 
        private double quizAverage = 0;
        private double midtermAverage = 0;
        private double finalAverage = 0;
        
        private double weightedQuiz = 0;
        private double weightedMidterm = 0;
        private double weightedFinal = 0;
        
        
        private double finalGrade = 0;
        
        
        /** Validates user input before executing rest of methods.
         * Variables quizScore1 - 3, passed from Main Class.
         * Precondition: User inputs appropriate values into variables 
         * @param quizScore1
         * @param quizScore2
         * @param quizScore3
         * @param quizScorePossible
         */
       public void SetQuizScore (double quizScore1, double quizScore2, 
               double quizScore3, int quizScorePossible)
        {
            if (QuizScoreOK(quizScore1, quizScore2, quizScore3, 
                    quizScorePossible))
            {
                this.quizScore1Received = quizScore1;
                this.quizScore2Received = quizScore2;
                this.quizScore3Received = quizScore3;
            }
            else 
            {
                System.out.println("Error: Quiz scores must be between 0 and "
                            + quizScorePossible);
                System.exit(0);
            }
            
        }
        
       /** Verifies quiz scores are within appropriate grade range &
        * stores information in midtermScoreReceived variable if OK
         * Note: Change variable totalMidtermScorePossible in Main class
         * at beginning of Class to change the grade range.
         * @param midtermScore
         * @param totalMidtermScorePossible
         */
        public void SetMidtermScore (double midtermScore, 
                int totalMidtermScorePossible)
        {
            if (MidtermScoreOK(midtermScore, totalMidtermScorePossible))
            {
                this.midtermScoreReceived = midtermScore;
            }
            else
            {
                System.out.println("Error: Midterm score must be between 0 and "
                            + totalMidtermScorePossible);
                System.exit(0);
            }
        }
        
        /** Verifies quiz scores are within appropriate grade range &
        * stores information in finalScoreReceived variable if OK
         * Note: Change variable totalFinalScorePossible in Main class at 
         * beginning of Class to change the grade range.
         * @param finalScore
         * @param totalFinalScorePossible
         */
        public void SetFinalScore (double finalScore, 
                int totalFinalScorePossible)
        {
            if (FinalScoreOK(finalScore, totalFinalScorePossible))
            {
                this.finalScoreReceived = finalScore;
            }
            else
            {
                System.out.println("Error: Final score must be between 0 and "
                            + totalFinalScorePossible);
                System.exit(0);
            }
        }
        
        
        
        
        /** Verifies quiz scores are within appropriate grade range
         * Note: Change variable quizScorePossible to at beginning of Class to
         * change the grade range.
         * @param quizScore1
         * @param quizScore2
         * @param quizScore3
         * @param quizScorePossible
         */
        private boolean QuizScoreOK (double quizScore1, double quizScore2, 
                                    double quizScore3, double quizScorePossible)
        {
            return ( ((quizScore1 >= 0) && (quizScore1 <= quizScorePossible)) 
                && ((quizScore2 >= 0) && (quizScore2 <= quizScorePossible)) 
                && ((quizScore3 >= 0) && (quizScore3 <= quizScorePossible)) );
        }
        
        /** Verifies quiz scores are within appropriate grade range
         * Note: Change variable totalMidtermScorePossible in Main class
         * at beginning of Class to change the grade range.
         * @param midtermScore
         * @param totalMidtermScorePossible
         */
        private boolean MidtermScoreOK (double midtermScore, 
                int totalMidtermScorePossible)
        {
            return ( (midtermScore >= 0) && (midtermScore <= 
                    totalMidtermScorePossible));
        }
        
        /** Verifies quiz scores are within appropriate grade range
         * Note: Change variable totalFinalScorePossible in Main class at 
         * beginning of Class to change the grade range.
         * @param finalScore
         * @param totalFinalScorePossible
         */
        private boolean FinalScoreOK (double finalScore, 
                int totalFinalScorePossible)
        {
            return ( (finalScore >= 0) && (finalScore <= 
                    totalFinalScorePossible));
        }
        
        
        //Personal note: Score checks valid properly, variables are initially 
        //set as well. UP TO THIS POINT OK!
        
        
        public String GetScores() //call order based on MAIN method
        {
            //System.out.println("GetScores started"); //debug tool
            return "Quiz 1: " + grade.format(quizScore1Received) + ", Quiz 2: " 
                    + grade.format(quizScore2Received) + ", Quiz 3: " 
                    + grade.format(quizScore3Received) + ", Midterm: " 
                    + grade.format(midtermScoreReceived) + ", Final: " + 
                    grade.format(finalScoreReceived) 
                    + ".  Overall numeric grade: ";
        }
        
        
        /**Method for calculating average of quiz scores
         * Precondition: User enters valid scores (true for Midterm & Final 
         * scores as well).
         * @return quizAverage
        */
        public double QuizAverage()
        {
            //System.out.println("QuizAverage started");
            //System.out.println(quizAverage);
            quizAverage = ((quizScore1Received + quizScore2Received + 
                    quizScore3Received)/30);
            return quizAverage;
        }
        
        public double MidtermAverage()
        {
            //System.out.println("MidtermAverage started");
            //System.out.println(midtermAverage);
            midtermAverage = midtermScoreReceived / 100;
            return midtermAverage;
        }
        
        public double FinalAverage()
        {
            //System.out.println("FinalAverage started");
            //System.out.println(finalAverage);
            finalAverage = finalScoreReceived / 100;
            return finalAverage;
        }
        
        
        /**Method for calculating the weighted score of the quiz average
         * Precondition: quizAverage calculated by QuizAverage method
         * @return weightedQuiz
         */
        public double WeightedQuiz()
        {
            //System.out.println("WeightedQuiz started");
            //System.out.println(quizAverage);
            weightedQuiz = quizAverage * .25;
            return weightedQuiz;
        }
        
        /**Method for calculating the weighted score of the midterm average
         * Precondition: midtermAverage calculated by MidtermAverage method
         * @return weightedMidterm
         */
        public double WeightedMidterm()
        {
            //System.out.println("WeightedMidterm started");
            //System.out.println(midtermAverage);
            weightedMidterm = midtermAverage * .35;
            return weightedMidterm;
        }
        
        /**Method for calculating the weighted score of the final average
         * Precondition: finalAverage calculated by FinalAverage method
         * @return weightedFinal
         */
        public double WeightedFinal()
        {
            //System.out.println("WeightedFinal started");
            //System.out.println(finalAverage);
            weightedFinal = finalAverage * .40;
            return weightedFinal;
        }
        
        /**Method for calculating the overall weighted score of all averages
         * Precondition: quizAverage, midtermAverage, finalAverage calculated
         * by respective methods of same name.
         * @return finalGrade
         */
        public double WeightedAverageScore()
        {
            //System.out.println("WeightedAverageScore started");
            //System.out.println(finalGrade);
            finalGrade = (weightedQuiz + weightedMidterm + weightedFinal) * 100;
            return finalGrade;
        }
        

        
        //NOTE: Able to pull finalGrade value if initialized OUTSIDE of method
        /*Must receive user input and call method FinalGrade with them to
        * function properly! 
        */
        
        /**Method for returning the final grade when called
         * Precondition: finalGrade calculated by WeightedAverageScore method
         * @return finalGrade
         */
        public double GetFinalGrade()
        {
            //System.out.println("GetFinalGrade started");
            return finalGrade;
        }
        
        
        /**Method Outputs letter grade based on value passed by GetFinalGrade 
         * method
         * Precondition: finalGrade calculated by WeightedAverageScore method
         * @return string letter grade
         */
        public String LetterGrade()
        {
            //System.out.println("GradeLetter started");
            if (finalGrade >= 90)
                return "A";
            if (finalGrade < 90 && finalGrade >= 80)
                return "B";
            if (finalGrade < 80 && finalGrade >= 70)
                return "C";
            if (finalGrade < 70 && finalGrade >= 60)
                return "D";
            else
                return "F";
        }
        
    }
