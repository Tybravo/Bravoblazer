import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLoopAverageCollectionOneToTen{

	public static void main(String[] args){

	int [] isNumbers = new int [10];

	int sum = 0;
	int number = 1;
	double averageNumber = 0;
	for(int index = 0; index < isNumbers.length; index++){
	isNumbers[index]  = number;

	sum = sum + isNumbers[index] ;
	averageNumber = averageNumber + 1;
	number = number + 1;
	}
	

	double average =   sum / averageNumber;
	//int [] arrayNum = isNumbers;
	//sum = Arrays.stream(arrayNum).sum();
	
	System.out.println("The average of array is " + average);
	
	



     }

}