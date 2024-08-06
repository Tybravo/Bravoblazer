import java.util.Arrays;
import java.util.Scanner;

public class FuncArrayNumSortAscending{

	public static void main(String...args){

		int[] listOfNumbers = {5, 3, 16, 12, 9};
		int[] smallestNum = ascend(listOfNumbers);

		System.out.println(Arrays.toString(smallestNum));
}



	public static int[] ascend(int[] numbers){

		int smallest = 0;

		for(int index = 0; index < numbers.length; index++){
			for(int count = index; count < numbers.length; count++){
				if(numbers[index] > numbers [count]){

				smallest = numbers[index];
				numbers[index] = numbers[count];
				numbers[count] = smallest;
		}
	    }
	}
	return numbers;
	
  }


}


