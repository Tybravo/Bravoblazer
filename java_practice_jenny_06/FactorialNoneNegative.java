//Qestion 4.38


import java.util.Scanner;

public class FactorialNoneNegative {

	public static void main(String[] args){

	Scanner bravo = new Scanner(System.in);


	System.out.print("Enter a none negative integer to find its factorial: ");
	int isNum = bravo.nextInt();

	int isNumber = 1;
	int productNum = 1;

	for(isNumber = 1; isNumber <= isNum; isNumber++){
	
	productNum = productNum * isNumber;

	//System.out.println("The factorial is:" +productNum);
	//System.out.printf(" %d Factorial is %d", isNum, +productNum);
	}

	System.out.println("The factorial is:" +productNum);




   }

}



		