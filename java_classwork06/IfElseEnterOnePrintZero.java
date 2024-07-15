import java.util.Scanner;

public class IfElseEnterOnePrintZero {

	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

	System.out.print(" Enter a number 1: ");
	int isNumber = input.nextInt();

	int isNumOne = 1;
	int isNumTwo = 2;
	int isNumThree = 3;
	int isNumFour = 4;
	int isNumFive = 5;
	int isNumSix = 6;
	int isNumSeven = 7;
	int isNumEight = 8;
	int isNumNine = 9;
	int isNumTen = 10;
	


	if(isNumber == isNumOne)
	System.out.print(" One");
	else
	if(isNumber == isNumTwo)
	System.out.print(" Two");
	else
	if(isNumber == isNumThree)
	System.out.print(" Three");
	else
	if(isNumber == isNumFour)
	System.out.print(" Four");
	else
	if(isNumber == isNumFive)
	System.out.print(" Five");
	else
	if(isNumber == isNumSix)
	System.out.print(" Six");
	else
	if(isNumber == isNumSeven)
	System.out.print(" Seven");
	else
	if(isNumber == isNumEight)
	System.out.print(" Eight");
	else
	if(isNumber == isNumNine)
	System.out.print(" Nine");
	else
	if(isNumber == isNumTen)
	System.out.print(" Ten");
	else
	System.out.print(" Invalid");
	

     }

}
