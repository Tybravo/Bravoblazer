
import java.util.Scanner;

public class Task2CollectTenScoresPrintAverage {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);

	int averageScores = 0;	

	int sumScores = 0;
	for(int increase = 1; increase <= 10; increase++){

	System.out.print("Enter ten scores to sum up: ");
	int isScore = input.nextInt();

	sumScores = sumScores + isScore;

	averageScores = sumScores / increase;
	}

	
	System.out.printf("The average of the scores is %d%n", +averageScores);


    }

}