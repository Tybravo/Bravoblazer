

import java.util.Scanner;

public class RunwayLength {

 	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	System.out.print("Enter the plane take-off speed: ");
	double takeOffSpeed = input.nextDouble();
	
	System.out.print("Enter the plane acceleration: ");
	double planeAcceleration = input.nextDouble();

	double sqaureOfPlaneSpeed = takeOffSpeed * takeOffSpeed;

	double lengthToTakeOff = sqaureOfPlaneSpeed / (2 * planeAcceleration);

	System.out.printf("Lenth to take off is %.3f%n", lengthToTakeOff);


    }

}