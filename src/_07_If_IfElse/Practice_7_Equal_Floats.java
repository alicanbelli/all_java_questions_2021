package _07_If_IfElse;

public class Practice_7_Equal_Floats {
	public static void main(String[] args) {
		/*
		 Write a Java program that accepts two float numbers and checks if they are equal.
EXAMPLE:
       INPUT      : 
first float number: 1235
second float number: 2534 
 
       OUTPUT : 
These numbers are different.
 */

		float n1 = 1234f;
		float n2 = 3456f;
		
		if(n1==n2) {
			System.out.println("These numbers are equal");
		}else {
			System.out.println("These numbers are different.");
		}
		
	}
}
