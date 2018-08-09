/* This program is ask user input for two numbers and learn trychase Exceptions.
 * Add, Subtract, Divide and Multiply of the two number asked and calculate num1 and num2
 * Switch statement is used 
 * Author: Reeta 
 * Date: 8/8/18
 */

import java.util.Scanner;

public class Java {
	
	static char selection;
	public static void main(String args[]) {
		
		int num1, num2;
		String result = "Your result is: ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Hi! What do you want to do? A. Add B. Subtrat C. Divide D. Multiply");
		selection = keyboard.next().charAt(0);
			
			System.out.println("Enter First number: ");
				num1 = keyboard.nextInt();
			System.out.println("Enter Second number: ");
				num2 = keyboard.nextInt();
		
		calculate(num1,num2);
		
				
	}
		static void calculate(int num1, int num2){

			
		
				switch(selection) {
					
				case 'A': {
			
						System.out.println(add(num1,num2));
						break;
						}
				
				case 'B': {
						System.out.println(sub(num1,num2));
						break;
					}
				case 'C': {
					try{
						System.out.println(divide(num1,num2));
						
					}catch(ArithmeticException e) {
						System.out.println("Cant divide a number by 0");
						break;
					}
					}
				case 'D': {
						System.out.println(multiply(num1,num2));
						break;
					}
		
				
				}
		}
		
	private static int add(int a , int b){
		return a + b;
	}
	
	
	private static int sub(int a , int b){
		return a - b;
	}
	
	
	private static int divide(int a , int b){
		return a/b;
	}
		
	
	private static int multiply(int a , int b){
		return a * b;
	}
	
	
}