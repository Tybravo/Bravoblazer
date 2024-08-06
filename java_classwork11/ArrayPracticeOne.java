import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeOne{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	

		
	System.out.print("Enter number of collection: ");
	int setOfNumbers = scanner.nextInt();

	int[] numbers = new int[setOfNumbers];

	numbers[4] = 20; //[0, 0, 0, 0, 20]
	numbers[0] = 11; //[11, 0, 0, 0, 0]
	numbers[7] = 599; //[11, 0, 0, 0, 0]
	numbers[3] = 200; //[11, 0, 0, 0, 0]




	System.out.println(Arrays.toString(numbers));


     }

}






/*
		int[] numbers = {10, 11, 12 ,13, 14, 15};

		int firstnumber = numbers[0];
		int secondnumber = numbers[1];

		System.out.println("firstNumber: "+firstNumber);
		System.out.println("secondNumber: "+secondNumber);
*/
