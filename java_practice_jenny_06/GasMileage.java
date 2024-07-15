//Question 4.17


import java.util.Scanner;

public class GasMileage {

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);


	while(true){
	System.out.print("Enter miles driven (-1 to quite):");
	int milesCovered = scanner.nextInt();
	if(milesCovered == -1){
		break;
	}
		
	System.out.print("Enter gallon used: ");
	int gallonUsed = scanner.nextInt();
	
	int milesPerGallon = milesCovered / gallonUsed;
		System.out.println("Miles covered per gallon is" +milesPerGallon);
	
	int totalMiles = milesCovered;
	int totalGallons = gallonUsed;

	int overAllMilesPerGallon = totalMiles / totalGallons;
		System.out.println("Over all miles covered per gallon is" +overAllMilesPerGallon);
	}

    }

}

