
/*
   @author Camila Arbaiza
   CSC 201-004N
   Professor Tanes Kanchanawanchai
   The purpose of this program is to read in student scores, get the best score,
   and then assign grades
   */


import java.util.Scanner;

public class Assignment7 {

    public static void main(String [] args){


        int numStudents = 0;    // number of students
        double [] listScores;   // array of scores of the students
        int i;                  // counter for for loop
        double score;           // best score in the listScores array
        char letterGrade;       //letter Grade assigned to score


        Scanner input = new Scanner(System.in);

        //Get user input for number of students
        System.out.println("Enter the number of students: ");
        numStudents = input.nextInt();

        //Assign length to listScores array
        listScores = new double [numStudents];

        //Get user input for scores
        System.out.println("Enter " + numStudents + " scores: ");
        for(i = 0; i < listScores.length; i++) {

            listScores[i] = input.nextDouble();
        }

        //Call getBest method to get the best score in listScores array
        score = getBest(listScores);


        for(i=0 ; i < listScores.length; i++){

            //Call assignGrades method to assign a letter grade to each individial score
            letterGrade = assignGrades(listScores[i],score);

            //Print out results
            System.out.println("Student " +i + " score is " +listScores[i]+ " and grade is " +letterGrade);

        }

    }//end main

    /**
     * getBest method compares the elements of the scoreList array and gets the best score
     *
     * @param scoreList  Array of scores
     * @return bestScore highest score in array of scores scoreList
     */
    public static double getBest(double[] scoreList){


        double bestScore = scoreList[0];

        for(int i = 1; i < scoreList.length; i++){

            if(scoreList[i] > bestScore ){
                bestScore = scoreList[i];
            }
        }

    return bestScore;}

    /**
     * assignGrades method assigns a letter grade to the score entered by comparing it to the best score
     *
     * @param s  score entered
     * @param b  best score to compare the score entered
     * @return grade  letter grade assigned
     */
    public static char assignGrades(double s, double b){
       char grade;

        if (s >= (b-10)){
            grade ='A';
        }
        else if(s >= (b-20)){
            grade = 'B';
        }
        else if(s >= (b-30)){
            grade = 'C';
        }
        else if(s >= (b-40)){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

   return grade; }
}//end Assignment7 class
