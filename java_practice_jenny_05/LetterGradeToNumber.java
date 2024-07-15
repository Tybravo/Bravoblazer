
import java.util.Scanner;

public class LetterGradeToNumber {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	
	char letterGradeA = 'A';
	char letterGradeB = 'B';
	char letterGradeC = 'C';
	char letterGradeD = 'D';
	char letterGradeF = 'F';


	System.out.print("Enter a letter grade: ");
	char getGrade = input.next().charAt(0);
	
	if(getGrade == letterGradeA){
	System.out.println("The numeric value for grade A is 4");
	}else
	if(getGrade == letterGradeB){
	System.out.println("The numeric value for grade B is 3");
       }else
	if(getGrade == letterGradeC){
	System.out.println("The numeric value for grade C is 2");
       }else
	if(getGrade == letterGradeD){
	System.out.println("The numeric value for grade D is 1");
       }else
	if(getGrade == letterGradeF){
	System.out.println("The numeric value for grade F is 0");
       }else

	if(getGrade != letterGradeA || getGrade != letterGradeB || getGrade != letterGradeC || getGrade != letterGradeD || getGrade != letterGradeF){

	//System.out.printf("%c%n", getGrade, "is an invalid grade");
       System.out.printf("You Entered an invalid grade %c", getGrade);
       }

    }

}




