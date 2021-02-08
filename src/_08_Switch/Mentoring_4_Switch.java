package _08_Switch;

import java.util.Scanner;

public class Mentoring_4_Switch {

	public static void main(String[] args) {
		
		/* Soru 8:
		 * Write a program that will print a week day according to the day number. Use switch statement.					
           Example					
           Display message: "Enter number:"					
	       5				
           Display message: "Friday"					
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input number between 1 to 7");
		int i = scan.nextInt();
		
		switch(i) {
		   case 1:
			   System.out.println("Monday");
			   break;
		   case 2:
			   System.out.println("Tuesday");
			   break;	   
		   case 3:
			   System.out.println("Wednesday");
			   break;
		   case 4:
			   System.out.println("Thursday");
			   break;
		   case 5:
			   System.out.println("Friday");
			   break;
		   case 6:
			   System.out.println("Saturday");
			   break;
		   case 7:
			   System.out.println("Sunday");
			   break;
		   default:
			   System.out.println("Invalid entry, please try again!");
		}
		
		scan.close();


	}

}
