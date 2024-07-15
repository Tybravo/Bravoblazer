
import java.util.Scanner;

public class BreakAtFiveCollectTenScore {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	

	int isTenScore = 0;
	int totalScore = 0;

	for(int collectScore = 1; collectScore <= 10; collectScore++){
	
	System.out.print("Enter ten scores and break at 5: ");
	isTenScore = input.nextInt();
	
	totalScore = totalScore + isTenScore;
	
	if(collectScore == 5)
	break;
	
	}

	
	System.out.printf("The number scores is %d%n", +totalScore);
	
	
	
   }

}





	