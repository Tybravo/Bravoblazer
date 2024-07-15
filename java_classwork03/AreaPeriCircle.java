
import java.util.Scanner;

	public class AreaPeriCircle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pieOfCircle = 3.14159;

	System.out.print("Enter radius of circle: ");
	double radiusOfCircle = input.nextDouble();
	
	double circlePerimeter = 2 * radiusOfCircle * pieOfCircle;

	double circleArea = radiusOfCircle * radiusOfCircle * pieOfCircle;
	
	System.out.printf("Perimeter of the circle is %.2f%n", circlePerimeter);

	System.out.printf("Area of the circle is %.2f%n", circleArea);


    }

}

