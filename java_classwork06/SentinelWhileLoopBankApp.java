import java.util.Scanner;

public class SentinelWhileLoopBankApp {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);

   String isStopper = "Yes";
	
	System.out.println(" Press 1 to continue: ");
	String isBeginApp = input.nextLine();
	
		String selectOption = """
		 Press 1 to transfer
		 Press 2 to Buy airtime
		 Press 3 to Buy data
		 Press 4 to share data
		 Press 99 to go back""";
	
	switch(isBeginApp){
	case "1":
	System.out.printf(" %s%n", selectOption);
	
	System.out.println(" Press any number among options to get started or enter Yes to end application");
	String isNumber = input.nextLine();



     while(!isNumber.equalsIgnoreCase(isStopper)){

	switch(isNumber){
	case "1":
	System.out.println(" Transfer");
	break;

	case "2":
	System.out.println(" Buy Airtime");
	break;

	case "3":
	System.out.println(" Buy Data");
	break;

	case "4":
	System.out.println(" Share Data");
	break;

	case "99":
	System.out.println(" Go Back");
	break;
	
	default:
	System.out.println(" Invalid input");
	}
	
   	

	System.out.println(" Press 1 to continue: ");
	isBeginApp = input.nextLine();
	
		selectOption = """
		 Press 1 to transfer
		 Press 2 to Buy airtime
		 Press 3 to Buy data
		 Press 4 to share data
		 Press 99 to go back""";
	
	switch(isBeginApp){
	case "1":
	System.out.printf(" %s%n", selectOption);
	
	System.out.println(" Press any number among options to get started or enter Yes to end application");
	isNumber = input.nextLine();
	}
	

    if(isNumber.equalsIgnoreCase(isStopper)){
    System.out.print(" APPLICATION ENDED");
    }
    }



    }		
  
  }

}

