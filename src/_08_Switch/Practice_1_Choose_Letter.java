package _08_Switch;

import java.util.Scanner;

public class Practice_1_Choose_Letter {
	

		public static void main(String[] args) {
			/*
			 Kullanicidan 3 harften birisini girmesini soyle ve girilen harfe gore cumleyi consolda yazdir.

	ORNEK:

	     INPUT      : A
	     OUTPUT  : Sakla samani gelir zamani.
	     INPUT      : B
	     OUTPUT  : Oluler, dirilerin hergun helva yedigini sanirmis.
			 */
			/*
			 Ask user to choose one of these letters : A , B , C
			 If they choose A, print: Java is easy
			 If they choose B, print: Java is fun
			 If they choose C, print: I need to study :) 
			 
			 EXAMPLE: 
			 INPUT      : A
	         OUTPUT  :Java is easy
	      
			 */
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter one of these letters :\nA  \nB  \nC ");
			char option = scan.next().charAt(0);
//			if(option=='A') {
//				System.out.println("Java is easy");
//			}else if(option == 'B') {
//				System.out.println("Java is fun");
//			}else if(option == 'C') {
//				System.out.println("I need to study");
//			}else {
//				System.out.println("Enter a valid option");
//			}
			
			switch(option) {
			case 'A' :
				System.out.println("Java is easy");
				break;
			case 'B' :
				System.out.println("Java is fun");
				break;
			case 'C' :
				System.out.println("I need to study");
				break;
				default :
					System.out.println("Enter a valid option");
			}
			scan.close();
			

		}

	}


