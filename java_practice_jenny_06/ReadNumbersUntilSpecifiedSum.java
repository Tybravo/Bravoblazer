//Question 4.34


import java.util.Scanner;

public class ReadNumbersUntilSpecifiedSum {

	public static void main(String[] args){

	Scanner bravo = new Scanner(System.in);


	int numTotal = 0;
	int numCounter  = 0;

	System.out.print("Enter a number for sum check of other integers to be entered: ");
	int isNum = bravo.nextInt();

	System.out.print("Enter integer for summation of all: ");
	int getNum = bravo.nextInt();


	while(isNum > numTotal){
	   numTotal = numTotal + getNum;
	   numCounter = numCounter + 1;

	   System.out.print("Enter integer for summation of all: ");
	   getNum = bravo.nextInt();
	}

	if(isNum == numTotal){
	   System.out.println("Stop! the total sum of values you entered is equal to the initial number input");
	}
	if(isNum < numTotal){
	   System.out.println("Stop! the total sum of values you entered is greater than to the initial number input");
	}
	


    }

}







