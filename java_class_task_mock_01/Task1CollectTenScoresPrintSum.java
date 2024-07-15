
import java.util.Scanner;

public class Task1CollectTenScoresPrintSum {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	int sumScores = 0;
	int increase = 0;
	for(increase = 1; increase <= 10; increase++){

	System.out.print("Enter ten scores to sum up: ");
	int isScore = input.nextInt();

	sumScores = sumScores + isScore;
	}

	System.out.printf("The sum of the scores is %d%n", +sumScores);


    }

}