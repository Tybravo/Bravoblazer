//(Compute the volume of a triangle) Write a program that reads the length of sides of an equilateral triangle and //computes the area and volume using the following formulas:

//volume = area x length


//class scanner to be used for the program
import java.util.Scanner;

public class VolumeTriangle {

	//use the main method to start execution of java application
	public static void main(String[] args){

	//create a Scanner to get input from the command window
	Scanner input = new Scanner(System.in);
	
	//prompt the user to enter an first integer
	System.out.print("Enter height of equilateral triangle:");

	//prompt the user to enter an second integer
	double isHeight = input.nextDouble();
	
	//prompt the user to enter an first integer
	System.out.print("Enter length of equilateral triangle:");

	//prompt the user to enter an second integer
	double isLength = input.nextDouble();
	
	//find the square of the lenght
	double squareLength = isLength * isLength;

	
	//find the square root of three and divide by 4
	double squareRootOfThree = Math.sqrt(3);
	double squareRootThreeOverFour = squareRootOfThree / 4;

	//multiply the result from the square root of three divide by 4 By the square of the length
	double areaOfTriangle = squareLength * squareRootThreeOverFour;

	//get the volume of the triangle.
	double volumeOfTriangle = areaOfTriangle * isHeight;

	//display volume of the triangle
	System.out.printf("The volume of equilateral trainglar prism is %.2f%n", volumeOfTriangle);
	

   }

}

