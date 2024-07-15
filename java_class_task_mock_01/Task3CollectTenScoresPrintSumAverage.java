
import java.util.Scanner;

public class Task3CollectTenScoresPrintSumAverage {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);

	int averageScores = 0;	

	int sumScores = 0;
	int increase = 0;
	for(increase = 1; increase <= 10;){

	System.out.print("Enter ten scores to sum up: ");
	int isScore = input.nextInt();
	increase++;
	
	sumScores = sumScores + isScore;

	averageScores = sumScores / increase;
	}

	
	System.out.printf("The sum of the scores is %d%n", +sumScores);
	System.out.printf("The average of the scores is %d%n", +averageScores);



    }

}