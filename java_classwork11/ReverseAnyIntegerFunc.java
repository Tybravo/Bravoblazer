
public class ReverseAnyIntegerFunc {

	public static int reverse(int entryNum){

		int reverseNum= 0;
	
		while(entryNum > 0){
	 
		reverseNum = (reverseNum * 10) + (entryNum % 10);
		
		entryNum = entryNum / 10;
	}
	return reverseNum;

	
	}

}