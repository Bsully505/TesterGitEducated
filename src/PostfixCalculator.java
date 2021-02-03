import java.util.Scanner;
public class PostfixCalculator {
public static boolean firstNumFlag = true;
public static int num1 = -1;


public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to my Computer");
	System.out.println("please enter your first number");
	while(firstNumFlag)
	try{
	num1 = input.nextInt();
	firstNumFlag = false;
	}catch(Exception InputMismatchException){
		System.out.println("Please enter a number");
		input.next();
	}
	System.out.println(num1);
}
}