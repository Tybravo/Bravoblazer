import java.util.Scanner;

public class LetterGradeWithOnlyIfStatement {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the Score 60 to know your grade: ");
	int isScore = input.nextInt();
 	

	if(isScore >= 80){
	System.out.println("Your grade is A");
	}

	if(isScore >= 70  && isScore <= 79){
	System.out.println("Your grade is B");
	}
	
	if(isScore >= 60  && isScore <= 69){
	System.out.println("Your grade is C");
	}

	if(isScore >= 50  && isScore <= 59){
	System.out.println("Your grade is D");
	}

	if(isScore >= 0  && isScore <= 49){
	System.out.println("Your grade is E");
	}


   }

}