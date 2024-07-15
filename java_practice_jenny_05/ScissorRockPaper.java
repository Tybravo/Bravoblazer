
import java.util.Scanner;

public class ScissorRockPaper {

	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	int isScissor = 0;
	int isRock = 1;
	int isPaper = 2;
	
	int randomNumber = (int) (Math.random() * 3);
	//int randomNumber = (int) (Math.random() * (isPaper - isScissor) + 1) + isScissor;


	System.out.print("Enter a number:");
	int getNumber = input.nextInt();


	
	if(randomNumber == 0 && getNumber == 0){
	System.out.print("The computer is Scissor You are Scissor It is a draw");
	}else
	if(randomNumber == 0 && getNumber == 1){
	System.out.print("The computer is Scissor You are Rock You Won");
	}else
	if(randomNumber == 0 && getNumber == 2){
	System.out.print("The computer is Scissor, You are Paper You Won");
	}else


	if(randomNumber == 1 && getNumber == 0){
	System.out.print("The computer is Rock You are Scissor You Loose");
 	}else
	if(randomNumber == 1 && getNumber == 1){
	System.out.print("The computer is Rock You are Rock It is a draw");
	}else
	if(randomNumber == 1 && getNumber == 2){
	System.out.print("The computer is Rock You are Paper You Won");
	}else


	if(randomNumber == 2 && getNumber == 0){
	System.out.print("The computer is Paper You are Scissor too You Loose");
	}else
	if(randomNumber == 2 && getNumber == 1){
	System.out.print("The computer is Paper You are Rock too You Loose");
	}else
	if(randomNumber == 2 && getNumber == 2){
	System.out.print("The computer is Paper You are Paper too It is a draw");
	}


    }

}



