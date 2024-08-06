
import java.util.Scanner;

public class Task4PrintMultiplesFourBtwOneToTen {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int isMultiple = 0;
	int isCounter = 0;
	for(isCounter = 4; isCounter <= 10; isCounter++){

	if(isCounter % 4 == 0){
	System.out.print(" "+isCounter);
	}
	}
	
    }

}