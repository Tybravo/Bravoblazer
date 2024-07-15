//(Area and Perimeter of a rectangle) Write a program that displays the area and perimeter oa a rectangle width of //5.3 and height of 8.6 using the 


//class scanner to be used for the program

import java.util.Scanner;

	public class RectangleAreaPerimeter {

	//use the main method to start execution of java application
	public static void main(String[] args){


	//Define the width and height of the rectangle
	double rectangleWidth = 5.3;
	double rectangleHeight = 8.6;

	//Multiply the width by the height to get the area
	double areaRectangle = rectangleWidth * rectangleHeight;

	//Sum the width by the height and multiply by 2 to get the perimeter
	double PerimeterRect = (rectangleWidth + rectangleHeight) * 2;
	
	//Display Area of rectangle
	System.out.printf("Area of the rectangle is %.2f%n", areaRectangle);

	//Display Perimeter of Rectangle
	System.out.printf("Perimeter of the rectangle is %.2f%n", PerimeterRect);

   }

}