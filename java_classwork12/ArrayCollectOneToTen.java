import java.util.Arrays;
import java.util.Scanner;

public class ArrayCollectOneToTen{

	public static void main(String[] args){

	int [] isNumbers = new int [10];

	isNumbers [0] = 1;
	isNumbers [1] = 2;
	isNumbers [2] = 3;
	isNumbers [3] = 4;
	isNumbers [4] = 5;
	isNumbers [5] = 6;
	isNumbers [6] = 7;
	isNumbers [7] = 8;
	isNumbers [8] = 9;
	isNumbers [9] = 10;

	isNumbers [0] = 1;
	isNumbers [1] = 0;
	isNumbers [2] = 2;
	isNumbers [3] = 0;
	isNumbers [4] = 3;
	isNumbers [5] = 0;
	isNumbers [6] = 4;
	isNumbers [7] = 0;
	isNumbers [8] = 5;
	isNumbers [9] = 0;

	isNumbers [0] = 0;
	isNumbers [1] = 1;
	isNumbers [2] = 0;
	isNumbers [3] = 2;
	isNumbers [4] = 0;
	isNumbers [5] = 3;
	isNumbers [6] = 0;
	isNumbers [7] = 4;
	isNumbers [8] = 0;
	isNumbers [9] = 5;




	String getArrays = (Arrays.toString(isNumbers));
	System.out.println(getArrays);
	//System.out.println(Arrays.toString(isNumbers));



    }

}
