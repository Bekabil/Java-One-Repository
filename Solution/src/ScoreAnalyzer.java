
/**
 * Name:	Bekabil Tolassa
 * Class:	ICS 140
 * Project: This program prompt user to enter unspecified number of scores.
 * 			and determines how many scores are above or below the average and
 *          how many scores are equal to the average.
 *
 */
// import scanner class
import java.util.Scanner;

//class AnalyzeScores
public class ScoreAnalyzer {

    //main method
    public static void main(String[] args) {

        //input is type scanner object
        Scanner input = new Scanner(System. in );

        //studentScores is integer array with 10 location
        int[] studentScores = new int[10];

        //variable declaration
        int countMax = 0;
        int countMin = 0;
        int countEquality = 0;
        int testVal = 0;
        int average = 0;
        int total = 0;
        int scoreCount = 0;
        //prompts user to input scores 10 times or negative number to end input
        System.out.println("To make use of this example, score for 10 students should be entered one at a time.");
        System.out.println();
        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter students' score: ");
            testVal = input.nextInt(); // input is assigned to testVal
            if (testVal > 0) //check if input is negative #, end the loop if so.
            {
            studentScores[i] = testVal;
            scoreCount++; //counts number of valid scores entered
            }
            else {
            	 break;
            }
        }

        //adding the scores and assign the sum to total
        for (int j = 0; j < studentScores.length; j++) {
            total += studentScores[j];
        }
        //average score is computed
        average = total / scoreCount;

        for (int k = 0; k < studentScores.length; k++) {

            //check if score is greater than average 
            if (studentScores[k] > average) {


                countMax++; // countMax is increased

            }
            //check if score is nonzero and less than average 
            else if (studentScores[k] < average && studentScores[k] != 0) {


                countMin++; // countMin is increased
            }
            //check if score is equal to average
            else if (studentScores[k] == average) {

                countEquality++; // countEquality is increased
            }

        }
        //the result of computation is printed out to console
        System.out.println("\n There average score is : " + average +
            "\n score(s) equal to average occured : " + countEquality + " times" +
            "\n score(s) above average occured :    " + countMax + " times" +
            "\n score(s) below average occured :    " + countMin + " times");
    }


}