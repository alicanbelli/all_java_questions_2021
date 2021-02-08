package _01_Variables;

import java.util.Scanner;

public class Office_2_Swap {
	public static void main(String[] args) {
		/*
		 0)Ask user to enter two integers 
		 1)Swap the integers
		 2)EXAMPLE:
		   INPUT: a= 3
		          b= 5
		   OUTPUT: a= 5
		           b= 3
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first ineger");
		int s1 = scan.nextInt();
		System.out.println("Enter second integer");
		int s2 = scan.nextInt();		
		System.out.println(s1 + " " + s2);
		
		//1st way: 
		s1 = s1 + s2;		
		s2 = s1 - s2;		
		s1 = s1 - s2;		
		System.out.println(s1 + " " + s2);
		
		//2nd way: (by using temporary value)
		int temp = 0;
		temp = s1;		
		System.out.println(s1 + " " + temp + " " + s2);
		
		s1 = s2;	
		System.out.println(s1 + " " + temp + " " + s2);
		
		s2 = temp;
		System.out.println(s1 + " " + temp + " " + s2);
		
		scan.close();
	}

}
