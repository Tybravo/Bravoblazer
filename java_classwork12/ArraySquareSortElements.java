import java.util.Arrays;
import java.util.Scanner;

public class ArraySquareSortElements{

	public static void main(String[] args){


	int [] numbers = new int[] {-8, 4, 7, 3, 4};
	

	numbers[0] *= numbers[0];
	numbers[1] *= numbers[1];
	numbers[2] *= numbers[2];
	numbers[3] *= numbers[3];
	

	System.out.println(Arrays.toString(numbers));

	for(int num = 0; num <= numbers.length - 1; num++){
	for(int numbs = num + 1; numbs < numbers.length; numbs++){
		int result = 0;
		if (numbers[num] > numbers[numbs]){
			result = numbers[num];
			numbers[num] = numbers[numbs];
			numbers[numbs] = result;
			
			}
			
			}  
		

		}
		System.out.print(Arrays.toString(numbers));































/*
int isFirst = 0;
int isSecond = 0;
int isThird = 0;
int isFourth = 0;
int isFifth = 0;

	int[] isNumbers =  {7, 3, 9, 1, 6}; //static initialization method

	
		 int firstNumber = isNumbers[0];
		 int secondNumber = isNumbers[1];
		 int thirdNumber = isNumbers[2];
		 int fourthNumber = isNumbers[3];
		 int fifthNumber = isNumbers[4];

 //isFirst, isSecond, isThird, isFourth, isFifth
		
	isFirst = firstNumber * firstNumber ;
	isSecond = secondNumber * secondNumber ;
	isThird = thirdNumber * thirdNumber ;
	isFourth= fourthNumber * fourthNumber ;
	isFifth= fifthNumber * fifthNumber ;
	

		if(isFirst < isSecond && isFirst < isThird && isFirst < isFourth && isFirst < isFifth){
		//isFirst = isFirst ;
		System.out.printf("Numbers are: %d %d %d %d %d", isFirst, isSecond, isThird, isFourth, isFifth);
		}
		else
		if(isSecond < isFirst && isSecond < isThird && isSecond < isFourth && isSecond < isFifth){
		//isSecond = isSecond ;
		System.out.printf("Numbers are: %d %d %d %d %d", isSecond, isFirst, isThird, isFourth, isFifth);
		}
		else
		if(isThird < isFirst && isThird < isSecond && isThird < isFourth && isThird < isFifth){
		//isThird = isThird ;
		System.out.printf("Numbers are: %d %d %d %d %d", isThird, isFirst, isSecond, isFourth, isFifth);
		}
		else
		if(isFourth < isFirst && isFourth < isSecond && isFourth < isThird && isFourth < isFifth){
		//isFourth= isFourth ;
		System.out.printf("Numbers are: %d %d %d %d %d", isFourth, isFirst, isSecond, isThird, isFifth);
		}
		else
		if(isFifth < isFirst && isFifth < isSecond && isFifth < isThird && isFifth < isFourth){
		//isFifth= isFifth ;
		System.out.printf("Numbers are: %d %d %d %d %d", isFifth, isFirst, isSecond, isThird, isFourth);
		}
		
		//System.out.printf("Numbers are: %d %d %d %d %d", isFirst, isSecond, isThird, isFourth, isFifth);
		//System.out.println(Arrays.toString(number));


*/


    }

}




