import java.util.Scanner;

public class ReverseAnyInteger{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

//12345

	int reverseNum= 0;

	System.out.print("Enter a number to reverse: ");
	int entryNum = scanner.nextInt();
		
	while(entryNum > 0){
	 
	reverseNum = (reverseNum * 10) + (entryNum % 10);
		
	entryNum = entryNum / 10;
	}
	System.out.print(reverseNum);
	




/*
	System.out.print("Enter a number to reverse: ");
	int reverseNum = scanner.nextInt();
	int lengthOfDigits = String.valueOf(reverseNum).length();

	for(int count = 1; count <=  lengthOfDigits;){
	count++;
	
	//for(int counter = 1; counter <= lengthOfDigits;){
	//counter++;
	getPow = getPow * 10;

	int eachDigit = (reverseNum / getPow) % 10;

	
	System.out.print(eachDigit);
	//}
	}



	int base = 10;
	int expo =  (lengthOfDigits - count);
	double getPow = Math.pow(base, expo);
	
	getPow = getPow % 10;
	getPow = (int) getPow;

	double  eachDigit = reverseNum / getPow;
	eachDigit = (int) eachDigit;
	System.out.print(eachDigit);
	}
	//eachdigit = reversenum / 10 **(4 - count) % 10
	


int firstdigit = 0;
int seconddigit = 0;
int thirddigit = 0;
int fourthdigit = 0;
int fifthdigit = 0;


	for count in range(5):
			eachdigit = entrynum // 10**(4 - count) % 10
			
			alldigits.append(eachdigit)

		for eachdigit in alldigits:
			print(eachdigit, end=' \n')



int countFiveDigits = 5;


	System.out.print("Enter a number to reverse: ");
	int reversenum = scanner.nextInt();
	int lengthOfDigits = String.valueOf(reversenum).length();

	while(lengthOfDigits > countFiveDigits || lengthOfDigits < countFiveDigits){
		System.out.println("The number must be five digit");
		System.out.print("Enter a number to reverse: ");
		reversenum = scanner.nextInt();
		lengthOfDigits = String.valueOf(reversenum).length();
	}
	if(lengthOfDigits == countFiveDigits){
		firstdigit = reversenum / 10000 % 10;
		seconddigit = reversenum / 1000 % 10;
		thirddigit = reversenum / 100 % 10;
		fourthdigit = reversenum /10 % 10;
		fifthdigit = reversenum % 10;

	System.out.printf("The reverse is %d %d %d %d s%d", fifthdigit, fourthdigit, thirddigit, seconddigit, firstdigit);

	}
*/


   }

}

