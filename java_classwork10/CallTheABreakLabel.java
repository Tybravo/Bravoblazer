public class CallTheABreakLabel{

	public static void main(String...args){



	a : for(int counter = 0; counter < 10; counter = counter +1){


	for(int count = 0; count < 5; count = count + 1){
	if(count < 3){
		System.out.println("inner loop "+counter);
	}else break a;

	}

		System.out.println();
		System.out.println("outer loop " +counter);
	}


    }

}

