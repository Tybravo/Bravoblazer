//Question 2.16


import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	double getSum = 0;
	System.out.print("Enter a number:");
	int getInteger = input.nextInt();

	int toPowerTwo = 2;

	double  squareOfInteger = Math.pow(getInteger, toPowerTwo);
	getSum = getInteger + squareOfInteger;
	
	if(getSum == 100){
	System.out.printf("The sum and square of the number you entered which is %.0f %s %n", getSum, "is equal to 100");
	}

	if(getSum > 100){
	System.out.printf("The sum and square of the number you entered which is %.0f %s %n", getSum, "is greater 100");
	}
	
	if(getSum < 100){
	System.out.printf("The sum and square of the number you entered which is %.0f %s %n", getSum, "is less than 100");
	}


    }

}




	