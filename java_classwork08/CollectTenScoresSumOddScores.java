
import java.util.Scanner;

public class CollectTenScoresSumOddScores {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	

	int isSum = 0;
	int isIndex = 0;
	for(int getOdd = 1; getOdd <= 10;){
	
	System.out.print("Enter ten scosre and sum up odd indices: ");
	int isNum = input.nextInt();
	
	if(getOdd == 6){
	break;
	}
	
	if(getOdd % 2 != 0){
	isSum = isSum + isNum;
	}
	getOdd++;
	}
	
	System.out.printf("The sum of even scores is %d%n", +isSum);
	
   }

}









	