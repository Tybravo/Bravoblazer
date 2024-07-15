import java.util.Scanner;

public class WhileLoopCollectTenScore {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

    int sumScores = 0;
    int counter = 1;
    
	while(counter <= 10){

	System.out.print(" Collect ten scores and print the sum: ");
	int isScores = input.nextInt();

   sumScores = sumScores + isScores;
   counter++;
	}

	System.out.printf("The Sum is %d%n", sumScores);


   }

}
