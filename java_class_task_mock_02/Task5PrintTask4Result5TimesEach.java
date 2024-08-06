
import java.util.Scanner;

public class Task5PrintTask4Result5TimesEach {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int index = 0;
	int isMultiple = 0;
	int isCounter = 0;
	for(isCounter = 4; isCounter <= 10; isCounter++){
	
	if(isCounter % 4 == 0){
	for(index = 1; index <= 5; index++){

	System.out.print(" "+isCounter);
	}

	}
	}
	
    }

}