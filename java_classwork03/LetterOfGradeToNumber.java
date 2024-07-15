
import java.util.Scanner;

public class LetterOfGradeToNumber {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	
	char letterOfGradeA = 'A';
	char letterOfGradeB = 'B';
	char letterOfGradeC = 'C';
	char letterOfGradeD = 'D';
	char letterOfGradeF = 'F';


	System.out.print("Enter a letter grade: ");
	char getGrade = input.next().charAt(0);
	
	if(getGrade == letterOfGradeA){
	System.out.println("The numeric value for grade A is 4");
	}else
	if(getGrade == letterOfGradeB){
	System.out.println("The numeric value for grade B is 3");
       }else
	if(getGrade == letterOfGradeC){
	System.out.println("The numeric value for grade C is 2");
       }else
	if(getGrade == letterOfGradeD){
	System.out.println("The numeric value for grade D is 1");
       }else
	if(getGrade == letterOfGradeF){
	System.out.println("The numeric value for grade F is 0");
       }else

	if(getGrade != letterOfGradeA || getGrade != letterOfGradeB || getGrade != letterOfGradeC || getGrade != letterOfGradeD || getGrade != letterOfGradeF){

	System.out.printf("You Entered an invalid grade %c", getGrade);
       }

    }

}




