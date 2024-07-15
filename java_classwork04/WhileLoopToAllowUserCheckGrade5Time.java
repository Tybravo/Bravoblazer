import java.util.Scanner;

public class WhileLoopToAllowUserCheckGrade5Time {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	int numCounter  = 1;
	
	while(numCounter <= 5){
	++numCounter;
	
	System.out.print("Check grade 5 time: ");
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

}
