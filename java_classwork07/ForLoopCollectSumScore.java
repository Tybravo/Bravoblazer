import java.util.Scanner;

public class ForLoopCollectSumScore {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

    int sumScores = 0;
    
	for(int counter = 1; counter <= 10; counter++){

	System.out.print(" Collect ten scores and print the sum: ");
	int isScores = input.nextInt();

   sumScores = sumScores + isScores;
	}

	System.out.printf("The Sum is %d%n", sumScores);


   }

}
