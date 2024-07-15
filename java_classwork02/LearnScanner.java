import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {

	Scanner jenny;
		
	//declared a scanner object
	jenny = new Scanner(System.in);

	//we prompted the user
	System.out.print("What is your name: ");

	//we declared a variable called name
	String name;

	//collected input from the user using the scanner method
	name = jenny.nextLine();

    }

}
