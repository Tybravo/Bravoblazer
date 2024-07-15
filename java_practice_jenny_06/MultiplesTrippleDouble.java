//Question 2.26


import java.util.Scanner;

public class MultiplesTrippleDouble {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number to determine it's multiple with the double of second number: ");
	int isNumOne = input.nextInt();
	
	System.out.print("Enter second number to determine it's multiple with the triple of first number: ");
	int isNumTwo = input.nextInt();

	int isNumOneTripple =  isNumOne + isNumOne + isNumOne;
	int isNumTwoDouble = isNumTwo + isNumTwo;					

	int isMultiple = isNumOneTripple % isNumTwoDouble;
		
	
	if(isMultiple == 0){
	System.out.println("Yes! Their triple and double are multiple");	
	}else
	if(isMultiple > 0){
	System.out.println("No! Their triple and double are not multiple");	
	}

   }

}