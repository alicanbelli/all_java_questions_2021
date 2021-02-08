package _08_Switch;

import java.util.Scanner;

public class Mentoring_1_HaftaGunleri {

	public static void main(String[] args) {

		/* Soru 1:
		 * Kullanıcını 1 ile 7 arasında bir sayı girdiğinde haftanın hangi günü olduğunu yazdıran 
		 * switch case java kodunu yaznız.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1 ile 7 arasinda bir sayi giriniz");
		int i = scan.nextInt();
		
		switch(i) {
		   case 1:
			   System.out.println("Pazartesi");
			   break;
		   case 2:
			   System.out.println("Sali");
			   break;	   
		   case 3:
			   System.out.println("Carsamba");
			   break;
		   case 4:
			   System.out.println("Persembe");
			   break;
		   case 5:
			   System.out.println("Cuma");
			   break;
		   case 6:
			   System.out.println("Cumartesi");
			   break;
		   case 7:
			   System.out.println("Pazar");
			   break;
		   default:
			   System.out.println("Tanimlanamadi");
		}
		
		scan.close();
				

	}

}
