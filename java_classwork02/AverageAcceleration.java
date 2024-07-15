
import java.util.Scanner;

public class AverageAcceleration {

 	public static void main(String[] args) {


	Scanner input = new Scanner(System.in);

	System.out.print("Enter the starting velocity: ");
	double startingVelocity = input.nextDouble();
	
	System.out.print("Enter the ending velocity: ");
	double endingVelocity = input.nextDouble();

	System.out.print("Enter the time span in seconds: ");
	double timeSpan = input.nextDouble();


	double velocityChange = endingVelocity - startingVelocity;

	double acceleration = velocityChange / timeSpan;

	System.out.printf("Average acceleration is %.4f%n", acceleration);


    }

}