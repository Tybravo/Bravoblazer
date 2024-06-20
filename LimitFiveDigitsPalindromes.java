//Question 4.31


import java.util.Scanner;
import java.math.BigInteger;

public class LimitFiveDigitsPalindromes {

	public static void main(String[] args){


	Scanner bravo = new Scanner(System.in);

	int countFiveDigits = 5;

	System.out.print("Enter five-digit integers: ");
	Long fiveDigits = bravo.nextLong();

	int lengthOfDigits = String.valueOf(fiveDigits).length();

	while(lengthOfDigits > countFiveDigits || lengthOfDigits < countFiveDigits){
	System.out.print("Invalid number of digits, Please enter five digits: ");
	    fiveDigits = bravo.nextLong();
	    lengthOfDigits = String.valueOf(fiveDigits).length();
	}


	if(lengthOfDigits == countFiveDigits){
	
	long getFifthNum = fiveDigits % 10;
	long getFirstNum = fiveDigits / 10000;

	long toGetFourthNum = fiveDigits / 10;
	long getFourthNum = toGetFourthNum % 10;

	long toGetThirdNum = fiveDigits / 100;
	long getThirdNum = toGetThirdNum % 10;
	
	long toGetSecondNum = fiveDigits / 1000;
	long getSecondNum = toGetSecondNum % 10;
	
	if(getFirstNum == getFifthNum && getSecondNum == getFourthNum){
	System.out.println("Yes! The digits you entered is a Palindrome");
	}
	if(getFirstNum != getFifthNum && getSecondNum != getFourthNum){
	System.out.println("Noway! The digits you entered is not Palindrome");
	}
	}


    }

}
