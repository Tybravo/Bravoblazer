//class scanner to be used for the program
import java.util.Scanner;

	public class FutureInvestmentValue {

	//declare the constant percentge ready for use
	private static int setPercent = 100;
	private static int setAnnualToMonth = 12;

	//use main method to start execution
	public static void main(String[] args) {

	//create a Scanner to get input from the command window
	Scanner input = new Scanner(System.in);

	//prompt the user to enter investment amount
	System.out.print("Enter Investment Amount:");
	//read value entered from user
	double getInvestmentAmount = input.nextDouble();
	System.out.println("Investment Amount is: " + getInvestmentAmount);

	//prompt the user to enter annual interest rate
	System.out.print("Enter Annual Interest Rate:");
	//read value entered from user
	double getAnnualInterestRate = input.nextDouble();
	System.out.println("Annual Interest Rate is: " + getAnnualInterestRate);

	//prompt the user to enter number of years
	System.out.print("Enter No. of Years:");
	//read value entered from user
	int getNumberOfYears = input.nextInt();
	System.out.println("No. of Years is: " + getNumberOfYears);	

	
	//get percentage monthly rate and add 1 to it
	double monthlyInterestRate = getAnnualInterestRate / setPercent / setAnnualToMonth;
	double isMonthlyInterestRate = monthlyInterestRate + 1;

	//get power for monthly interest rate that has been added to 1
	int toPower = getNumberOfYears * 12;


	//get result from the monthly interest added to 1 and raised to power
	double getResult = Math.pow(isMonthlyInterestRate, toPower);
	
	//getfuture investment value
	double futureInvestmentValue = getResult * getInvestmentAmount;

	//display future investment value
	System.out.printf("Future Investment Value is %.2f%n", futureInvestmentValue);

}


}

