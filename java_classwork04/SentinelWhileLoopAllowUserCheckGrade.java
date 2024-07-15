import java.util.Scanner;

public class SentinelWhileLoopAllowUserCheckGrade {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	int theStopper = -99;
	
	System.out.print("Check grade until you enter -99 to stop checking grade: ");
	int isScore = input.nextInt();
	int theScore = isScore;

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



	while(theScore != -99){
	System.out.print("Check grade until you enter -99 to stop checking grade: ");
	isScore = input.nextInt();
		
	
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

	if(isScore == theStopper){
	System.out.println("Stop!, you have come to end of checking score grade.");
	break;
	}
	
	}
	


    }

}
