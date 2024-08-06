
//4567
import java.util.Scanner;

public class CryptographyDecryption{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

int firstDigit = 0;
int secondDigit = 0;
int thirdDigit = 0;
int fourthDigit = 0;

int isFirstDigit = 0;
int isSecondDigit = 0;
int isThirdDigit = 0;
int isFourthDigit = 0;

int getFirstDigit = 0;
int getSecondDigit = 0;
int getThirdDigit = 0;
int getFourthDigit = 0;


	System.out.print("Enter four digit to decrypt: ");
	int collectNum = scanner.nextInt();

		firstDigit = collectNum / 1000 % 10;
		secondDigit = collectNum / 100 % 10;
		thirdDigit = collectNum / 10 % 10;
		fourthDigit = collectNum % 10;
		
		isFirstDigit = firstDigit + 3;
		isSecondDigit = secondDigit + 3;
		isThirdDigit = thirdDigit + 3;
		isFourthDigit = fourthDigit + 3;

		getFirstDigit = isFirstDigit % 10;
		getSecondDigit = isSecondDigit  % 10;
		getThirdDigit = isThirdDigit % 10;
		getFourthDigit = isFourthDigit % 10;


		System.out.printf("Encryped number is %d %d %d %d ", getSecondDigit, getFourthDigit, getFirstDigit, getThirdDigit);
		
		//int encryptedNum = getThirdDigitgetFirstDigit getFourthDigit getSecondDigit;
		//System.out.printf("Encryped number is %d %d %d %d ", getThirdDigit, getFirstDigit, getFourthDigit, getSecondDigit);
		//System.out.print("Encryped number is " +encryptedNum);



      }

}






/*
- Prompt the user to enter four digit
- Read the four digit integer
- get each digit separated
- add 7 to each digit
- get the remainder of each dight after dividing the new value by 10
- swap the first digit with the third digit
- swap the second digit with the fourth digit
- print the encrypted integer.
*/

