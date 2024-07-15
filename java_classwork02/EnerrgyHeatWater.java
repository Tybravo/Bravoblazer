
import java.util.Scanner;

public class EnerrgyHeatWater {

 	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	System.out.print("Enter the amount of water: ");
	double amountOfWater = input.nextDouble();
	
	System.out.print("Enter initail temperature: ");
	double intTemp = input.nextDouble();

	System.out.print("Enter final temperature: ");
	double finTemp = input.nextDouble();


	double getDiffTemp = finTemp - intTemp;

	double energyHeatWater = amountOfWater * getDiffTemp * 4184.0;

	System.out.printf("Energy to heat water is %.1f%n", energyHeatWater);


    }

}