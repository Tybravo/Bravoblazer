
import java.util.Scanner;

public class Task9CollectTenScoresSumValid {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	int isAverage = 0;	

	int countNum =0;
	int getNum = 0;
	int isSum = 0;
	for(getNum = 1; getNum <= 10; getNum++){
	
	System.out.println("Enter ten valid score between 0 and 100: ");
	int isNum = input.nextInt();
	
	if(isNum > 0 && isNum < 100){
	isSum = isSum + isNum;
	}
	else{
	System.out.println("Pls enter a valid number between 0 and 100: ");
	}
	}
	
	
	System.out.printf("The sum of even scores is %d%n", +isSum);
	
   
   }

}









	