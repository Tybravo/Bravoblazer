
import java.util.Scanner;

public class NumberDivisibleBy5And3One {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	System.out.print("Check if a number is divisible by 5 and 3: ");
	int isDivisible = input.nextInt();

	if(isDivisible % 5 == 0 && isDivisible % 3 == 0)
	System.out.printf("Yes number %d is divisble by 5 and 3", isDivisible);
	else
	System.out.printf("No number %d is not divisble by 5 and 3", isDivisible);


    }

}
