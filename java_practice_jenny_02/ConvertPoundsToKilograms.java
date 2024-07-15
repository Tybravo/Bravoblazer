//class scanner to be used for the program
import java.util.Scanner;

public class ConvertPoundsToKilograms{
	//declare the constant pounds ready for use
	private static int setPounds = 1;
	
	//declare the constant kilograms ready for use
	private static double setKilograms = 0.454;
	

	//use the main method to start execution of java application
	public static void main(String[] args){
	
	
	//create a Scanner to get input from the command window
	Scanner input = new Scanner(System.in);

	//prompt the user to enter a number
	System.out.print("Enter a number in pounds:");
	
	//get value of pounds from user
	double getPounds = input.nextDouble();

	//convert in order to output result
	double convert = (getPounds * setKilograms) / setPounds;
	
	//display result
	System.out.printf("Conversion gives %3f%n", convert);
}

}
