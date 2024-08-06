
public class Task7SumPairsFromTask6Together {

	public static void main(String[] args){


	int index = 0;
	int isMultiple1 = 1;
	int isMultiple2 = 1;
	int getCounter1 = 1;
	int getCounter2 = 1;
	int isCounter = 0;
	int sumMultiple1 = 0;
	int sumMultiple2 = 0;

	for(isCounter = 1; isCounter <= 10; isCounter++){
	if(isCounter % 4 == 0){
	isMultiple1 = isCounter;
	isMultiple2 = isCounter;

	if(isCounter <= 4){
	getCounter1 = isCounter;
	//System.out.print(" "  +getCounter1);
	}
	if(isCounter > 4){
	getCounter2 = isCounter;
	//System.out.print(" "  +getCounter2);
	}
	
	for(index = 1; index <= 4; index++){
	
	if(isCounter <= 4){
	isMultiple1 = isMultiple1 * isCounter;
	sumMultiple1 = sumMultiple1 + isMultiple1;
	//System.out.print(" "  +isMultiple1);
	}
	if(isCounter > 4){
	isMultiple2 = isMultiple2 * isCounter;
	sumMultiple2 = sumMultiple2 + isMultiple2;
	//System.out.print(" "  +isMultiple2);
	}
	
	}
	
	}
	}
	sumMultiple1 = sumMultiple1 + getCounter1;
	sumMultiple2 = sumMultiple2 + getCounter2;

	System.out.print(" "  +sumMultiple1);
	System.out.print(" "  +sumMultiple2);


    }

}