
import java.util.Scanner;

public class WhileCounterControl{

	public static void main(String...args){

	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a numer: ");
	int number = scanner.nextInt();
	int counter = 1;

	while(counter <= 12){
	counter++;
	int product = number * counter;

		System.out.printf("%d * %d = %d\n", number, counter, product);
			
	}
     
     }

}