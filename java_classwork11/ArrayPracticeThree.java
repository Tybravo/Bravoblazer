import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeThree{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	

	int entryScore = 0;

	for(int count = 1; count <= 10;){
	count++;

	System.out.println("Enter score: ");
	entryScore = scanner.nextInt();

	System.out.print(+entryScore);
	}
	System.out.printf("All Scores: %d %d", +entryScore,);
	
	

   }

}		





	//System.out.println("when number =" +number+ " Sum is" +sum);

