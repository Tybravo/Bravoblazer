
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopCollectOneToTen{

	public static void main(String[] args){

	int [] isNumbers = new int [10];

	int sumArray = 0;
	int sum = 0;
	int number = 0;

	for(int index = 0; index < isNumbers.length; index++){
	number = number + 1;
	isNumbers[index]  = number;
	}

		
	String getArrays = (Arrays.toString(isNumbers));
	System.out.println(getArrays);
	

     }

}