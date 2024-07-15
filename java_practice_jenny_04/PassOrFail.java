//() Write a program that prompt a student to enter a java score. If the score is greater or equal to 60, display "you pass the exaam" otherwise, display "you dont pass the exam". Your program ends with input -1



import java.util.Scanner;

public class PassOrFail {

	//use the main method to start execution of java application
	public static void main(String[] args){
	
	//create a Scanner to get input from the command window
	Scanner input = new Scanner(System.in);

	//use while loop to end the program
	while (true) {

	System.out.print("Enter a java score to display a decision: ");
	int aboveOrEquallSixty = input.nextInt();

	if(aboveOrEquallSixty == -1) {
	System.out.println("Booted out!");
	break;
	}

	//if score is greater than or equal to sixty
	if(aboveOrEquallSixty >= 60){
	
	//display decision
	System.out.println("You pass the exam");
 	}
 else{
  	//if score is greater than or equal to sixty
	if(aboveOrEquallSixty < 60){

	//display decision
	System.out.println("You dont pass the exam");
  	}

    }

}


   }
}


