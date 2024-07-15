
import java.util.Scanner;

public class SwitchCaseEBankingApp {

	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

	System.out.print(" Press 1 to continue or any number to end App: ");
	int isBeginApp = input.nextInt();
	
	
		String selectOption = """
		Press 1 to transfer
		Press 2 to Buy airtime
		Press 3 to Buy data
		Press 4 to share data
		Press 99 to go back""";
	
	switch(isBeginApp){
	case 1:
	System.out.printf(" %s%n", selectOption);
	
	
	System.out.print(" Press any number among options to get started ");
	int isNumber = input.nextInt();


	switch(isNumber){
	case 1:
	System.out.print(" Transfer");
	break;

	case 2:
	System.out.print(" Buy Airtime");
	break;

	case 3:
	System.out.print(" Buy Data");
	break;

	case 4:
	System.out.print(" Share Data");
	break;

	case 99:
	System.out.print(" Go Back");
	break;
	
	default:
	System.out.print(" Invalid input");
	}
	break;

	default:
	System.out.print(" You have Ended the App");
		
	
   	}
	
	
   }

}