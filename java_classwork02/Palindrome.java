import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number and check for Palliandrome: ");
	int isNum = input.nextInt();

	int getNum = isNum;
		
	int divOneNum = getNum / 10;
	int divTwoNum = divOneNum / 10;

	int moduNum = getNum % 10;

	if(divTwoNum == moduNum){
	System.out.println("The number you entered is a Palliandrome");
	}

	if(divTwoNum != moduNum){
	System.out.println("The number you entered is not a Palliandrome");
	}


    }

}	
	
	

	
	
	

	
