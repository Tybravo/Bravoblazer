import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args) {

	Scanner input  = new Scanner(System.in);
	
	int gallon = 0;
	int miles = 0;
	double milesPerGallon = 0;
	double sum = 0;
	String stopper = "no";

	System.out.print("Enter miles driven: ");
	miles = input.nextInt();	

	System.out.print("Enter gallon used: ");
	gallon = input.nextInt();
	

	while(stopper.equals("no")){
	
	milesPerGallon = miles / gallon;
	sum = sum + milesPerGallon;	

	System.out.printf("Total number of miles per gallon is %.2f%n", sum);
	}


	System.out.println("Press Yes to continue or No to stop ");
	String isStopper = input.nextLine().toLowerCase();	
	
	//System.out.print("Enter Yes or No to start: ");
	//stopper = input.nextLine().toLowerCase();

	
	
	

     }
 
}

