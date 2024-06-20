//Question 2.35


import java.util.Scanner;

public class GreatPyramidOfGiza {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);


	System.out.print("Estimated number of stones used: ");
	int numberOfStones = input.nextInt();
	
	System.out.print("Average weight of each stone: ");
	int weightOfEachStone = input.nextInt();
	
	System.out.print("Number of years taken to build the pyramid: ");
	int NnumberOfYears = input.nextInt();
	
	
	int weightPerQuantityOfStones = numberOfStones * weightOfEachStone;
	
	int forEachYear = weightPerQuantityOfStones * 1 / NnumberOfYears;
	int forOneHour = forEachYear / 8760;
	int forOneMin =  forEachYear / 525600;

	System.out.printf("The estimate of how much weight the pyramid was built each year is %dkg %n", forEachYear);
	System.out.printf("The estimate of how much weight the pyramid was built each hour is %dkg %n", forOneHour);
	System.out.printf("The estimate of how much weight the pyramid was built each minute is %dkg %n", forOneMin);









     }

}




