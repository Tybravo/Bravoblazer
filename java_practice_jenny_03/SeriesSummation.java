//(Summation of a series) Write a program that displays the result of
//1+2+3+4+5+6+7+8+9+10



//class scanner to be used for the program

import java.util.Scanner;

	public class SeriesSummation {

	//use the main method to start execution of java application
	public static void main(String[] args){


	//Define the radius and pie given
	int numOne = 1;
	int numTwo = 2;
	int numThree = 3;
	int numFour = 4;
	int numFive = 5;
	int numSix = 6;
	int numSeven = 7;
	int numEight = 8;
	int numNine = 9;
	int numTen = 10;

	//Get the summation of the series above
	int seriesSummation = numOne + numTwo + numThree + numFour + numFive + numSix + numSeven + numEight + numNine + numTen;

	//Display summation
	System.out.printf("Summation of a series is %d%n", seriesSummation);


    }

}

