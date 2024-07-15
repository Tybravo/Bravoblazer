import java.util.Scanner;

public class SentinelWhileLoopCollectSumScore {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

	int isStopper = -99;
   	int sumScores = 0;
    	    
	System.out.print(" Collect ten scores and print the sum: ");
	int isScores = input.nextInt();

    while(isScores != isStopper){

  	//sumScores = sumScores + isScores;
   	sumScores += isScores;

	System.out.print(" Collect ten scores and print the sum: ");
	isScores = input.nextInt();

    }
	 System.out.printf("The Sum Score is %d%n", sumScores);
   
  }

}
