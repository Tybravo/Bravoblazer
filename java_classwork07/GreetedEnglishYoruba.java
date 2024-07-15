import java.util.Scanner;

public class GreetedEnglishYoruba {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);


	System.out.print(" Enter 1 to be greeted in English or 0 to be greeted in Yoruba: ");
	int isGreetInLang = input.nextInt();

/*
	if(isGreetInLang == 1){
	System.out.println(" Good morning to you");
	}else
	if(isGreetInLang == 0){
	System.out.print(" E kaa ro oo");
	}
*/

	System.out.println(isGreetInLang == 1 ? "Good morning to you" : "E kaa ro oo");


  }

}

