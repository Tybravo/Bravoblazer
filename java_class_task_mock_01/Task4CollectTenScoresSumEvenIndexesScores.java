
import java.util.Scanner;

public class Task4CollectTenScoresSumEvenIndexesScores {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	

	int isSum = 0;
	int isIndex = 0;
	for(int getNum = 1; getNum <= 10; getNum++){

	System.out.print("Enter ten scosre and sum up even indexes: ");
	int isNum = input.nextInt();
	
	if(getNum % 2 == 0){
	isSum = isSum + isNum;
	}
	}
	
	
	System.out.printf("The sum of even scores is %d%n", +isSum);
	
   }

}









	