package _01_Variables;

import java.util.Scanner;

public class Office_1_AskiValue {
	//ASCII acronym for American Standard Code for Information Interchange.

		public static void main(String[] args) {
			
			/*
			 Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin

	ORNEK:
	             INPUT : #
	 			 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
			 */
			
			/*
			 Ask user to enter a character and print the ASCII value of that character
			 */
			
			Scanner scan = new 	Scanner(System.in);
			System.out.println("Enter a character to find its ASKII value");
			

			// character whose ASCII value to be found  
			char ch1 = scan.next().charAt(0);
			// variable that stores the integer value of the character  
			int asciivalue1 = ch1;  
			System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1); 
			
			
			//2.Way:
			//characters whose ASCII value to be found  
			char ch3 = scan.next().charAt(0);  
			
			//casting or converting a charter into int type  
			int ascii1 = (int) ch3;  
			System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);  
			scan.close();
		}

}
