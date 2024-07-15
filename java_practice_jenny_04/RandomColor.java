//(Random color) Write a program that randomly generates an integer between 1 and 7 and display the name of a color in the rainbow ---violet, indigo, blue, green, yellow, orange, and red--- for numbers 1, 2, 3, 4, 5, 6, and 7 accordingly


import java.util.Scanner;

public class RandomColor {

	//use the main method to start execution of java application
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int isSmallest = 1;
	int isHighest = 7;
	
//String input = scanner.nextline();

	int randomColor = (int) (Math.random() * (isHighest - isSmallest) + 1) + isSmallest;

	if(randomColor == 1){
	System.out.println("violet '" + randomColor + "'");
	}else

	if(randomColor == 2){
	System.out.println("indigo '" + randomColor + "'");
	}else

	if(randomColor == 3){
	System.out.println("blue '" + randomColor + "'");
	}else

	if(randomColor == 4){
	System.out.println("green '" + randomColor + "'");
	}else

	if(randomColor == 5){
	System.out.println("yellow '" + randomColor + "'");
	}else

	if(randomColor == 6){
	System.out.println("orange '" + randomColor + "'");
	}else

	if(randomColor == 7){
	System.out.println("red '" + randomColor + "'");
	}

  }
	


}

