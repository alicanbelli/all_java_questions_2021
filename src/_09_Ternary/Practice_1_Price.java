package _09_Ternary;

import java.util.Scanner;

public class Practice_1_Price {
	public static void main(String[] args) {
		/*
		 Write a code using ternary:
  Create int variable : price
  Create string variable : decision
  If the price = $10 Print �it's cheap�
  If price is 10-$20 print �it's ok� 
  Otherwise �it's expensive�.

ORNEK:

     INPUT      : price= 12                
     OUTPUT  : it's ok
     INPUT      : price= 10                
     OUTPUT  : it's cheap
     INPUT      : price= 23                
     OUTPUT  : it's expensive
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the price ?");
		int price = scan.nextInt();
		
		System.out.println(price<10 ? "it's cheap" : price>10 && price <20 ? "it's ok" : "it's expensive");
		
		scan.close();
		
		
	

	}
}