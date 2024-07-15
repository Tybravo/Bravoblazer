
import java.util.Scanner;

public class FinCurExchange {

 	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	double fixedDollar = 1.0;
	double fixedYuan = 6.81;

	System.out.print("Enter the exhange rate from dollar to RMB: ");
	double isDollar = input.nextDouble();
	
	System.out.print("Enter 0 to convert dollar to RMB: ");
	int isZero = input.nextInt();

	if(isZero == 0){
	double getYuanPerDollar = isDollar * fixedYuan;

	System.out.printf(" %.1f is %.1f%n", isDollar, getYuanPerDollar);
	}


	System.out.print("Enter the exhange rate from RMB to dollar: ");
	double isYuan = input.nextDouble();
	
	System.out.print("Enter 1 to convert RMB to dollar: ");
	int isOne = input.nextInt();

	if(isOne == 1){
	double getDollarPerYuan = isYuan / fixedYuan;

	System.out.printf(" %.1f is %.2f%n", isYuan, getDollarPerYuan);
	}










    }

}