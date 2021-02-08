package _08_Switch;

import java.util.Scanner;

public class Mentoring_2_Switch {

	public static void main(String[] args) {
		
		/* Soru 2:
		 *					
           Kullanıcının girmiş olduğu A,B,C,D,F notlarının karşılığını yazdıran Switch Case java kodunu yazınız.					
           A	Excellent				
           B	Good				
           C	Average				
           D	Deficient				
           F	Failing				
					
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir not degeri giriniz");
	    char c = scan.next().charAt(0);
		
		switch(c) {
		   case 'A':
			   System.out.println("Excellent");
			   break;
		   case 'B':
			   System.out.println("Good");
			   break;
		   case 'C':
			   System.out.println("Average");
			   break;
		   case 'D':
			   System.out.println("Deficient");
			   break;
		   case 'E':
			   System.out.println("Failing");
			   break;
			default:
				System.out.println("Wrong input");
			   
		}	   
		
		scan.close();

	}

}
