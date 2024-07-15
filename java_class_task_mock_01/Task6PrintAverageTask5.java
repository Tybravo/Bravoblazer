
import java.util.Scanner;

public class Task6PrintAverageTask5 {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	int isAverage = 0;	

	int countNum = 0;
	int getNum = 0;
	int isSum = 0;
	for(getNum = 1; getNum <= 10; getNum++){
	
	System.out.print("Enter ten score and get average of even Scores: ");
	int isNum = input.nextInt();
	
	if(isNum % 2 == 0){
	isSum = isSum + isNum;
	countNum++;
	System.out.printf("The even count is %d%n", +countNum);
	}
	isAverage = isSum / countNum;
	}
	
	
	System.out.printf("The average of even scores is %d%n", +isAverage);
	
   }

}









	