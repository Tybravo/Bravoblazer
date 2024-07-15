import java.util.Scanner;

public class ReverseInteger{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

int firstdigit = 0;
int seconddigit = 0;
int thirddigit = 0;
int fourthdigit = 0;
int fifthdigit = 0;

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
	


   }

}

