
import java.util.Scanner;

public class Task10PrintAverageTask9 {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	int isAverage = 0;	

	int countNum =0;
	int getNum = 0;
	int isSum = 0;
	for(getNum = 1; getNum <= 10; getNum++){
	
	System.out.println("Enter ten valid score between 0 and 100 to get average: ");
	int isNum = input.nextInt();
	
	if(isNum > 0 && isNum < 100){
	isSum = isSum + isNum;
	countNum++;
	}
	else{
	System.out.println("Pls enter a valid number between 0 and 100: ");
	}
	isAverage = isSum / countNum;
	}
	
	
	System.out.printf("The average of even scores is %d%n", +isAverage);
	
   
   }

}









	