//Question 2.28


import java.util.Scanner;

public class DiameterCircumfAreaCircle {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Enter radius of circle: ");
	int radiusOfCircle = input.nextInt();
	
	float isPie = 3.14159f;

	
	int isDiameter = 2 * radiusOfCircle;
	System.out.printf("Diameter of circle is %d%n", isDiameter);	
	
	float isCircumference = 2 * isPie * radiusOfCircle;
	System.out.printf("Circumference of circle is %f%n", isCircumference);	
	
	float isArea = isPie * radiusOfCircle * radiusOfCircle;
	System.out.printf("Area of circle is %f%n", isArea);	
	
	
   }

}