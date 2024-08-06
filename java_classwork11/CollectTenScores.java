import java.util.Arrays;
import java.util.Scanner;

public class CollectTenScores{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	

	int entryScore = 0;
	String isEntryScore = "";
	
	for(int count = 1; count <= 10; count++){
	
	System.out.print("Enter score " +count+ ": ");
	entryScore = scanner.nextInt();
	isEntryScore += entryScore + " ";
	}
	
	System.out.printf("All Scores are %s", isEntryScore);
		
	

   }

}		





	//System.out.println("when number =" +number+ " Sum is" +sum);

