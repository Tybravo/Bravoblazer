import java.util.Scanner;

public class LetterGradeWithSwitchStatement {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	
	
	System.out.print("Enter your Score to know your grade: ");
	int isScore = input.nextInt();
	
	switch(isScore){
		case 80:
		System.out.printf("Your score is %d%n", isScore, "with grade A");
		break;

		case 70:
		System.out.printf("Your score is %d%n", isScore, "with grade B");
		break;
		
		case 60:
		System.out.printf("Your score is %d%n", isScore, "with grade C");
		break;

		default:
		System.out.print("Sorry, you have entered a wrong score");
				
		}



/*

	String isResult = "";

	System.out.print("Enter your Score to know your grade");
	int isScore = input.nextInt();
	
	if(isResult.equals("yes")){
	System.out.print("Enter your Score to know your grade: ");
	isResult = input.nextInt();

	System.out.print("You have gotten to the end of grade checking");
	break;
	}

	
	switch(isScore){
		case 80:
		System.out.printf("Your score is %d%n", "with grade A");
		break;

		case 80:
		System.out.printf("Your score is %d%n", "with grade B");
		break;

		case 60:
		System.out.print("Enter Yes to end grade checking: ");
		String isResult = input.nextLine();

		}

*/



   }

}


