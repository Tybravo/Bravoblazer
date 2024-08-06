
public class Task6Print5MultiplesOfResultFromTask4 {

	public static void main(String[] args){


	int index = 0;
	int isMultiple1 = 1;
	int isMultiple2 = 1;
	int isCounter = 0;
	int sumMultiple = 0;

	for(isCounter = 1; isCounter <= 10; isCounter++){
	if(isCounter % 4 == 0){
	isMultiple1 = isCounter;
	isMultiple2 = isCounter;

	if(isCounter <= 4){
	System.out.print(" "  +isCounter);
	}
	if(isCounter > 4){
	System.out.print(" "  +isCounter);
	}
	
	for(index = 1; index <= 4; index++){
	
	if(isCounter <= 4){
	isMultiple1 = isMultiple1 * isCounter;
	System.out.print(" "  +isMultiple1);
	}
	if(isCounter > 4){
	isMultiple2 = isMultiple2 * isCounter;
	System.out.print(" "  +isMultiple2);
	}
	
	}
	
	}
	}
	

    }

}