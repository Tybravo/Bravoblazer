import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopSumCollectionOneToTen{

	public static void main(String[] args){

	int [] isNumbers = new int [10];

	int sum = 0;
	int number = 0;

	for(int index = 0; index < isNumbers.length; index++){
	number = number + 1;
	isNumbers[index]  = number;

	sum = sum + number;
	}


	String getArrays = (Arrays.toString(isNumbers));
	System.out.println(getArrays);
	
	int [] arrayNum = isNumbers;
	sum = Arrays.stream(arrayNum).sum();
	System.out.printf("The sum of array is %d%n ", sum);
	
	
	//System.out.println(sum);





     }

}