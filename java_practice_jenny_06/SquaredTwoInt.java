//Question 2.15


import java.util.Scanner;

	public class SquaredTwoInt {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number:");
	int getFirstInteger = input.nextInt();

	System.out.print("Enter another number:");
	int getSecondInteger = input.nextInt();


	int toPowerTwo = 2;

	double squaredFirstNum = Math.pow(getFirstInteger, toPowerTwo);
	double squaredSecondNum = Math.pow(getSecondInteger, toPowerTwo);
	
	double summedSquares = squaredFirstNum + squaredSecondNum;
	
	double diffSquared = squaredFirstNum - squaredSecondNum;

	
	System.out.printf("The square of each integer is %.2f %s %.2f%n", squaredFirstNum, "and", squaredSecondNum);

	System.out.printf("The sum of their squares is %.2f%n", summedSquares);

	System.out.printf("The difference of the squares is %.2f%n", diffSquared);

  }


}

