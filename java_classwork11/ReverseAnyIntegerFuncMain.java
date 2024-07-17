import java.util.Scanner;

public class ReverseAnyIntegerFuncMain{


	public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any number digits to reverse: ");
        int firstNumber = scanner.nextInt();
        
	ReverseAnyIntegerFunc reverseAnyIntegerFunc = new ReverseAnyIntegerFunc();

	int isReverseNum = reverseAnyIntegerFunc.reverse(firstNumber);

	System.out.printf("The reverse is %d", isReverseNum);
	
	

   }

}