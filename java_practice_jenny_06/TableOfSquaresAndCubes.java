//Qeuation 2.31


public class TableOfSquaresAndCubes {

	public static void main(String[] args){

	String isNumber = "number";
	String isSquare = "sqaure";
	String isCube = "cube";
	String isEmptyFew = "  ";
	String isEmptyMore = "        ";
	String isEmptyMorex = "       ";
	String isEmptyMorexx = "      ";


	int isZero = 0;
	int isOne = 1;
	int isTwo = 2;
	int isThree = 3;
	int isFour = 4;
	int isFive = 5;
	int isSix = 6;
	int isSeven = 7;
	int isEight = 8;
	int isNine = 9;
	int isTen = 10;

	int isZeroSquare = isZero * isZero;
	int isZeroCube = isZero * isZero * isZero;
	
	int isOneSquare = isOne * isOne;
	int isOneCube = isOne * isOne * isOne;
	
	int isTwoSquare = isTwo * isTwo;
	int isTwoCube = isTwo * isTwo * isTwo;
	
	int isThreeSquare = isThree * isThree;
	int isThreeCube = isThree * isThree * isThree;
	
	int isFourSquare = isFour * isFour;
	int isFourCube = isFour * isFour * isFour;

	int isFiveSquare = isFive * isFive;
	int isFiveCube = isFive * isFive * isFive;

	int isSixSquare = isSix * isSix;
	int isSixCube = isSix * isSix * isSix;

	int isSevenSquare = isSeven * isSeven;
	int isSevenCube = isSeven * isSeven * isSeven;

	int isEightSquare = isEight * isEight;
	int isEightCube = isEight * isEight * isEight;

	int isNineSquare = isNine * isNine;
	int isNineCube = isNine * isNine * isNine;

	int isTenSquare = isTen * isTen;
	int isTenCube = isTen * isTen * isTen;

	
	System.out.printf(" %s%s%s%s%s%n", isNumber, isEmptyFew, isSquare, isEmptyFew, isCube);
	System.out.printf(" %s%s%s%s%s%n", isZero, isEmptyMore, isZeroSquare, isEmptyMore, isZeroCube);
	System.out.printf(" %s%s%s%s%s%n", isOne, isEmptyMore, isOneSquare, isEmptyMore, isOneCube);
	System.out.printf(" %s%s%s%s%s%n", isTwo, isEmptyMore, isTwoSquare, isEmptyMore, isTwoCube);
	System.out.printf(" %s%s%s%s%s%n", isThree, isEmptyMore, isThreeSquare, isEmptyMore, isThreeCube);
	System.out.printf(" %s%s%s%s%s%n", isFour, isEmptyMore, isFourSquare, isEmptyMorex, isFourCube);
	System.out.printf(" %s%s%s%s%s%n", isFive, isEmptyMore, isFiveSquare, isEmptyMorex, isFiveCube);
	System.out.printf(" %s%s%s%s%s%n", isSix, isEmptyMore, isSixSquare, isEmptyMorex, isSixCube);
	System.out.printf(" %s%s%s%s%s%n", isSeven, isEmptyMore, isSevenSquare, isEmptyMorex, isSevenCube);
	System.out.printf(" %s%s%s%s%s%n", isEight, isEmptyMore, isEightSquare, isEmptyMorex, isEightCube);
	System.out.printf(" %s%s%s%s%s%n", isNine, isEmptyMore, isNineSquare, isEmptyMorex, isNineCube);
	System.out.printf(" %s%s%s%s%s%n", isTen, isEmptyMorex, isTenSquare, isEmptyMorexx, isTenCube);


    }

}
