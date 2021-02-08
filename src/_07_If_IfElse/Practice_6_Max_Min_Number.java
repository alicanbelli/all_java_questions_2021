package _07_If_IfElse;

import java.util.Scanner;

public class Practice_6_Max_Min_Number {
	/*
	 3 basamakli bir sayi alip sayinin rakamlari toplamini bulun


ORNEK:
            INPUT :123
            OUTPUT : Rakamlarin toplami 6'dir.
	 */
	
	/*
	 Ask user to enter a three digits number and find the sum of digits of this number
	 
	 EXAMPLE:
	 			INPUT:123
	 			OUTPUT:The sum of digits of given integer is 6 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a three digits number");
       int num = scan.nextInt();
		
		int unit = num%10;
		num/=10;
		
		int tens = num%10;
		num/=10;
		int hundreds = num%10;
		int sum = unit+tens+hundreds;
		System.out.println("The sum of digits of given integer is "+sum);
		scan.close();
		
	}

}
