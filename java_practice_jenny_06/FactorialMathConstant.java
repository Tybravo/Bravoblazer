//Qestion 4.38


import java.util.Scanner;

public class FactorialMathConstant {

	public static void main(String[] args){

	Scanner bravo = new Scanner(System.in);


	System.out.print("Enter the number of terms to calculate the maths constant e: ");
	int isNum = bravo.nextInt();

	int isNumber = 1;
	int sumNum = 1;

	for(isNumber = 1; isNumber <= isNum; isNumber++){
	
	sumNum = sumNum + 1/isNumber;
	}

	double getconstant = 1 + sumNum;
	System.out.printf("The mathematical constant is %.2f%n", +getconstant);


   }

}



		