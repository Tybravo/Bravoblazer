

import java.util.Scanner;

public class AreaPerimeterRect {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter width of the rectangle: ");
	double isWidth = input.nextDouble();

	System.out.print("Enter height of the rectangle: ");
	double isHeight = input.nextDouble();


	double getArea = isWidth * isHeight;
	double addWidthHeight = isWidth + isHeight;
	
	double getPerimeter = 2 * addWidthHeight;

	System.out.printf("Area of the rectangle is %.2f%n", getArea);
	System.out.printf("Perimeter of the rectangle is %.2f%n", getPerimeter);


   }

}
