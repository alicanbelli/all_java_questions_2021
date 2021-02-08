package _04_Operators;

import java.util.Scanner;

public class Practice_2_Math_Operations_withElseIf {
	public static void main(String[] args) {
		/*
		 Ask user to enter two numbers
		 Show them e menu of operation signs and ask them to choose one.
		 "Addition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4
		 Print the result on the console
		 
		 EXAMPLE:
		 	INPUT:    Num1 : 23
		 		      Num2 : 55
		 	OUTPUT :  Result : 78
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first number please");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number please");
		double num2 = scan.nextDouble();
		System.out.println();
		
		System.out.println("Which operation do you prefer?\n1 for Sum\n2 for Subtract"
				+"\n3 for Multiplication\n4 for Division" );
		
		int option = scan.nextInt();
		if (option==1) {
			System.out.println("Result= "+(num1+num2));
		}else if(option==2) {
			System.out.println("Result= "+(num1-num2));
		}else if(option==3) {
			System.out.println("Result= "+(num1*num2));
		}else if(option==4) {
			System.out.println("Result= "+(num1/num2));
		}else {
			System.out.println("Enter a valid operation");
		}
		
		scan.close();
		
		

	}
}
