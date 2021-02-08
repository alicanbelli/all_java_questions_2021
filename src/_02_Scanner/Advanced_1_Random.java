package _02_Scanner;

import java.util.Random;
import java.util.Scanner;

public class Advanced_1_Random {
	public static void main(String[] args) {
		/*
		 Write a program that accepts an integer as input 
and creates a random integer which
less than input and prints the sum of it's digits
    
ORNEK:

     INPUT      : 2548                  
     
     OUTPUT :    Random Integer = 1324
                 I created 1324 and sum of it's digits is =10 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = scan.nextInt();
		Random random = new Random();
		int randomNumber = random.nextInt(number);
		System.out.println(number);
		System.out.println(randomNumber);
        int a = 0;
        int sum = 0;
		while(randomNumber>0) {
			a=randomNumber%10;
			sum = sum + a;
			randomNumber=randomNumber/10;
		}
		System.out.println("The sum of digits of given integer is: "+sum);
		scan.close();
		
		
	}
}
