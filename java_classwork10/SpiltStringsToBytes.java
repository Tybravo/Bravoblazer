//split is a method of class string to separate the characters in a string
// using the parse.int method is used to convert strings to integer

import java.util.Scanner;

public class SpiltStringsToBytes{

	public static void main(String...args){	

	Scanner scanner = new Scanner(System.in);
	String numbers = "";

	for(int count = 0; count < 10; count++){
	System.out.println("Enter number "+(count+1));
	int number = scanner.nextInt();		
	numbers = (numbers + number);
	if(count < 9) numbers+=", ";
}

	String[] bytes = numbers.split(",");   ///["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]
	int sum = 0;

	for(int counter = 0; counter < bytes.length; counter++){
	String num = bytes[counter];
	int number = Integer.parseInt(num);
	sum = sum + number;

	}
	System.out.println("Sum of number is: "+sum);


   }

}


