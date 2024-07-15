import java.util.Scanner;

public class LetterGradeWithIfAndElseStatement {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);


	System.out.print("Enter the Score 60 to know your grade: ");
	int isScore = input.nextInt();
 	

	if(isScore >= 80){
	System.out.println("Your grade is A");
	}else

	if(isScore >= 70 && isScore <= 79){
	System.out.println("Your grade is B");
	}else
	
	if(isScore >= 60  && isScore <= 69){
	System.out.println("Your grade is C");
	}else

	if(isScore >= 50  && isScore <= 59){
	System.out.println("Your grade is D");
	}else

	if(isScore >= 0  && isScore <= 49){
	System.out.println("Your grade is E");
	}



   }

}


