
import java.util.Scanner;

public class CalculateInterest {

 	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	System.out.print("Enter the balance: ");
	double amountOfBalance = input.nextDouble();
	
	System.out.print("Enter annual interest rate: ");
	double annualRate = input.nextDouble();


	double isAnnualRate = annualRate / 1200;

	double InterestMonthlyPay = isAnnualRate * amountOfBalance;

	System.out.printf("Interest on the next monthly pay is %.5f%n", InterestMonthlyPay);


    }

}