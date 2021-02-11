import java.util.Scanner;
import java.util.Stack;
public class PostfixCalculator {
public static boolean firstNumFlag = true;
public static boolean secondNumFlag = true;
public static Stack num_Container = new Stack();
public static int num1 = -1;
public static int num2 = -1;


public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Welcome to my Calculator");
	System.out.println("please enter a number");
	while(true){
		String temp = input.next();
		switch(temp){
		case("+"):
			if(num_Container.size()>=2){
				int num1 = (int) (num_Container.pop());
				int num2 = (int) (num_Container.pop());
				num_Container.push(num1+num2);
				ShowStackdata();
				
			}
			else{
				System.out.println("there are enough numbers in the stack");
			}
			break;
		case("*"):
			if(num_Container.size()>=2){
				int num1 = (int) (num_Container.pop());
				int num2 = (int) (num_Container.pop());
				num_Container.push(num1*num2);
				ShowStackdata();
				
			}
			else{
				System.out.println("there are enough numbers in the stack");
			}
			break;
		case("-"):
			if(num_Container.size()>=2){
				int num1 = (int) (num_Container.pop());
				int num2 = (int) (num_Container.pop());
				num_Container.push(num2-num1);
				ShowStackdata();
			}
			else{
				System.out.println("there are enough numbers in the stack");
			}
			break;
		case("/"):
			if(num_Container.size()>=2){
				int num1 = (int) (num_Container.pop());
				int num2 = (int) (num_Container.pop());
				num_Container.push(num2/num1);
				ShowStackdata();
			}
			else{
				System.out.println("there are enough numbers in the stack");
			}
		break;
		default:
			Boolean flag = true;
			while(flag){
				try{
					int newNum = Integer.parseInt(temp);
					num_Container.push(newNum);
					flag = false;
					ShowStackdata();
				}catch (Exception e){
					System.out.println("you did not correctly enter a number or symbol");
				}
			}
		}
		
		
			
	}
	
	}
public static void ShowStackdata(){
	 Stack TempContainer = new Stack();
	 while(num_Container.isEmpty() == false){
		 int numtemp = (int) num_Container.pop();
		 System.out.format("%d, ", numtemp);
		 TempContainer.push(numtemp);
		 
	 }
	 System.out.println();
	 while(TempContainer.isEmpty() == false){
		 num_Container.push(TempContainer.pop());
		 
	 }
	
}

}