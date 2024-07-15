//Question 2.34


import java.util.Scanner;

public class WorldPopulationGrowth {

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	
	int Percentage = 100;

	System.out.print("Enter initial population size: ");
	long initialPopulation = input.nextLong();

	System.out.print("Enter final population size: ");
	long finalPopulation = input.nextLong();

	long changeInPopulationSize = finalPopulation - initialPopulation;

	long pgrForOneYear = changeInPopulationSize / 1 * Percentage;

	long pgrForTwoYear = changeInPopulationSize / 2 * Percentage;

	long pgrForThreeYear = changeInPopulationSize / 3 * Percentage;

	long pgrForFourYear = changeInPopulationSize / 4 * Percentage;
	
	long pgrForFiveYear = changeInPopulationSize / 5 * Percentage;

	
	System.out.printf("The estimated world population after 1year, 2years, 3years, 4years, and 5years are %d %d %d %d %d %n", pgrForOneYear, pgrForTwoYear, pgrForThreeYear, pgrForFourYear, pgrForFiveYear);
	

    }

}
