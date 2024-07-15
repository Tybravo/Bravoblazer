
import java.util.Scanner;

public class CollectTenSumEven {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	

	int isSum = 0;
	for(int getNum = 1; getNum <= 10; getNum++){

	System.out.print("Enter ten scosre and sum up even Scores: ");
	int collectNum = input.nextInt();
	
	if(collectNum % 2 == 0){
	isSum = isSum + collectNum;
	}
	}
	
	
	System.out.printf("The sum of even scores is %d%n", +isSum);
	
   }

}









	