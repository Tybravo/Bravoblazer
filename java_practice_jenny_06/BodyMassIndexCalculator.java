//Question 2.33


import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter weight in Kilogram: ");
	int weightInHeight = input.nextInt();
	
	System.out.print("Enter height in Meters: ");
	int heightInMeters = input.nextInt();
	

	double heightInMetersSqare = Math.pow(heightInMeters, 2);
	double bodyMass = weightInHeight / heightInMetersSqare;


	System.out.printf("Body Mass Index is %.2f%n", bodyMass);

    }

}

