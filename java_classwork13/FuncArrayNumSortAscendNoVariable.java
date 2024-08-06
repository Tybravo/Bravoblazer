import java.util.Arrays;
import java.util.Scanner;

public class FuncArrayNumSortAscendNoVariable{

	public static void main(String...args){

		int[] listOfNumbers = {7, 4, 1, 15, 9};
		int[] smallestNum = ascend(listOfNumbers);

		System.out.println(Arrays.toString(smallestNum));
}



	public static int[] ascend(int[] numbers){

		for(int index = 0; index < numbers.length-1; index++){
			for(int count = index + 1; count < numbers.length; count++){
				if(numbers[count] < numbers[index]){

				numbers[index] = numbers[index] ^ numbers[count];
				numbers[count] = numbers[index] ^ numbers[count];
				numbers[index] = numbers[index] ^ numbers[count];
			}
		}
	}
	
	return numbers;
	
  }


}


