
import java.util.Scanner;

public class ContinueAtFiveCollectTenScore {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	

	int isTenScore = 0;
	int totalScore = 0;

	for(int collectScore = 1; collectScore <= 10; collectScore++){
	
	System.out.print("Enter ten scores and continue at 5: ");
	isTenScore = input.nextInt();
	
	if(collectScore == 7)
	continue;
	
	totalScore = totalScore + isTenScore;
	
	
	}

	
	System.out.printf("The number scores is %d%n", +totalScore);
	
	
	
   }

}









	