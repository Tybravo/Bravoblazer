//(Area and Perimeter of a circle) Write a program that display the area and perimeter of a circle that has a //radius of 6.5 using the following formula
//pie = 3.14159
//perimeter = 2 x radius x pie
//area = radius x radius x pie


//class scanner to be used for the program

import java.util.Scanner;

	public class CircleAreaPerimeter {

	//use the main method to start execution of java application
	public static void main(String[] args){


	//Define the radius and pie given
	double circleRadius = 6.5;
	double circlePie = 3.14159;

	//Get the perimeter of the circle
	double circlePerimeter = 2 * circleRadius * circlePie;

	//Get the area of the circle
	double circleArea = circleRadius * circleRadius * circlePie;
	

	//Display Perimeter of circle
	System.out.printf("Perimeter of the circle is %.2f%n", circlePerimeter);

	//Display Area of circle
	System.out.printf("Area of the circle is %.2f%n", circleArea);

	

    }

}

