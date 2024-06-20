//Qestion 2.24


import java.util.Scanner;

public class LargestAndSmallestIntegers {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter five integers to determine the largest and smallest: ");
	int isNum = input.nextInt();

	int getNum = isNum;
		
	int getFifthNum = getNum % 10;
	int getFirstNum = getNum / 10000;

	int toGetFourthNum = getNum / 10;
	int getFourthNum = toGetFourthNum % 10;

	int toGetThirdNum = getNum / 100;
	int getThirdNum = toGetThirdNum % 10;
	
	int toGetSecondNum = getNum / 1000;
	int getSecondNum = toGetSecondNum % 10;


	if(getFirstNum > getSecondNum && getFirstNum > getThirdNum && getFirstNum > getFourthNum && getFirstNum > getFifthNum){
	System.out.printf("The largest number is %d%n", getFirstNum);
	}else
	if(getSecondNum > getFirstNum && getSecondNum > getThirdNum && getSecondNum > getFourthNum && getSecondNum > getFifthNum){
	System.out.printf("The largest number is %d%n", getSecondNum);
	}else
	if(getThirdNum > getFirstNum && getThirdNum > getSecondNum && getThirdNum > getFourthNum && getThirdNum > getFifthNum){
	System.out.printf("The largest number is %d%n", getThirdNum);
	}else
	if(getFourthNum > getFirstNum && getFourthNum > getSecondNum && getFourthNum > getThirdNum && getFourthNum > getFifthNum){
	System.out.printf("The largest number is %d%n", getFourthNum);
	}else
	if(getFifthNum > getFirstNum && getFifthNum > getSecondNum && getFifthNum > getThirdNum && getFifthNum > getFourthNum){
	System.out.printf("The largest number is %d%n", getFifthNum);
	}


	if(getFirstNum < getSecondNum && getFirstNum < getThirdNum && getFirstNum < getFourthNum && getFirstNum < getFifthNum){
	System.out.printf("The Smallest number is %d%n", getFirstNum);
	}else
	if(getSecondNum < getFirstNum && getSecondNum < getThirdNum && getSecondNum < getFourthNum && getSecondNum < getFifthNum){
	System.out.printf("The Smallest number is %d%n", getSecondNum);
	}else
	if(getThirdNum < getFirstNum && getThirdNum < getSecondNum && getThirdNum < getFourthNum && getThirdNum < getFifthNum){
	System.out.printf("The Smallest number is %d%n", getThirdNum);
	}else
	if(getFourthNum < getFirstNum && getFourthNum < getSecondNum && getFourthNum < getThirdNum && getFourthNum < getFifthNum){
	System.out.printf("The Smallest number is %d%n", getFourthNum);
	}else
	if(getFifthNum < getFirstNum && getFifthNum < getSecondNum && getFifthNum < getThirdNum && getFifthNum < getFourthNum){
	System.out.printf("The Smallest number is %d%n", getFifthNum);
	}







    }

}	
	
