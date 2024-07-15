
import java.util.Scanner;

public class SumDigitInteger {

 	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number between 0 and 1000: ");
	int isNum = input.nextInt();

	int getNum = isNum;

	int moduNumOne = getNum % 10;       //9
	int moduNumTwo = getNum / 100;      //9
	int moduNumThree = getNum / 10;     //99
	int divNum  = moduNumThree % 10;    //9

	int sumAllDigits = moduNumOne + moduNumTwo + divNum;

	System.out.printf("Sum of the integer digits is %d", sumAllDigits);


    }

}
