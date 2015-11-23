import java.util.Scanner;

public class Calc {
	private String operand;
	private static long num1;
	private static long num2;
	private static Scanner scnr;
	private static long answer;
	
	
	
	public static void addition(long num1, long num2){
		answer = num1+ num2;
		System.out.println("Answer: " +answer);
	}
	
	public static void multiplication(long num1, long num2){
		answer = num1 * num2;
		System.out.println("Answer: " +answer);
	}
	
	public static void division(long num1, long num2){
		answer = num1/num2;
		System.out.println("Answer: " +answer);
	}
	
	public static void subtraction(long num1, long num2){
		answer = num1 - num2;
		System.out.println("Answer: " +answer);
	}
	
	public static void Main(){
		scnr = new Scanner(System.in);
		
		int choice;
		System.out.println("Please select a choice: " + "1. Addition" +"/n" + "2. Subtraction"
				+"/n" + "3. Multiplication" +"/n" + "4. Division");
		choice = scnr.nextInt();
		
		System.out.println("Enter the first number");
		num1 = scnr.nextInt();
		
		System.out.println("Enter the second number");
		num2 = scnr.nextInt();
		
		switch(choice){
		case 1:
			addition(num1, num2);
			break;
			
		case 2:
			subtraction(num1, num2);
			break;
			
		case 3:
			multiplication(num1, num2);
			break;
			
		case 4:
			division(num1, num2);
			break;
		}
		
	}
	
	public static void main(String args[]){
		Main();
		
	}

}
