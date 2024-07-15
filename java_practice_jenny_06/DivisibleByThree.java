//Question 2.25


import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to determine if it is divisible by 3:  ");
	int isNum = input.nextInt();

	int getNum = isNum;
		
	int isDivisibleByThree = getNum % 3;
	
	if(isDivisibleByThree == 0){
	System.out.printf("Correct! The number you entered is divisible by 3 and the remainder is %d%n", isDivisibleByThree);
	}else
	if(isDivisibleByThree > 0){
	System.out.printf("Noway! The number you entered not divisible by 3 and the remainder is %d%n", isDivisibleByThree);
	}
	

    }

}