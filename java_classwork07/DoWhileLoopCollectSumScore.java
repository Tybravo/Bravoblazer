import java.util.Scanner;

public class DoWhileLoopCollectSumScore {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

	int isStopper = -99;
   	int sumScores = 0;
	int isScores = 0;
    	    
     do{
	System.out.print(" Collect ten scores and print the sum: ");
	isScores = input.nextInt();

	sumScores += isScores;

	}
     while(isScores == isStopper);
	
	System.out.printf("The Sum Score is %d%n", sumScores);
	
    
	
  }

}
