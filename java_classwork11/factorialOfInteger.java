import java.util.Scanner;

public class factorialOfInteger{

	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter a number to get its's factorial: ");
	int collectnum = scanner.nextInt();

int factorial = 1;
int count = 1;

	for(count=1; count <= collectnum; count++){
	factorial = factorial * count;
	}
	System.out.print("factorial is: " +factorial);


    }

}