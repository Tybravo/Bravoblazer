
import java.util.Scanner;

public class Collect10ScorePrintSumAverage {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the Score from 1st student: ");
	int isScores1 = input.nextInt();
 	System.out.print("Enter the Scores from 2nd student: ");
	int isScores2 = input.nextInt();
 	System.out.print("Enter the Scores from 3rd student: ");
	int isScores3 = input.nextInt();
 	System.out.print("Enter the Scores from 4th student: ");
	int isScores4 = input.nextInt();
 	System.out.print("Enter the Scores from 5th student: ");
	int isScores5 = input.nextInt();
 	System.out.print("Enter the Scores from 6th student: ");
	int isScores6 = input.nextInt();
 	System.out.print("Enter the Scores from 7th student: ");
	int isScores7 = input.nextInt();
 	System.out.print("Enter the Scores from 8th student: ");
	int isScores8 = input.nextInt();
 	System.out.print("Enter the Scores from 9th student: ");
	int isScores9 = input.nextInt();
	System.out.print("Enter the Scores from 10th student: ");
	int isScores10 = input.nextInt();

	int sumScore = isScores1 + isScores2 + isScores3 + isScores4 + isScores5 + isScores6 + isScores7 + isScores8 + isScores9 + isScores10;

	int isAverage = sumScore / 10;

	System.out.printf("The Sum of the Scores is %d%n", +sumScore);
	System.out.printf("The Average of the Scores is %.2d%n", +isAverage);


    }

}









	
