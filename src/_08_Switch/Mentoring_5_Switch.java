package _08_Switch;

import java.util.Scanner;

public class Mentoring_5_Switch {

	public static void main(String[] args) {

		/* Soru 5:
		 * Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir ay giriniz");
		String str = scan.nextLine();
		
		switch(str) {
		 case "Ocak":
		 case "Mart":
		 case "Mayis":
		 case "Temmuz":
		 case "Agustos":
		 case "Ekim":
		 case "Aralik" :
			 System.out.println("31 gun");
			 break;
		 case "Nisan" :
		 case "Haziran" :
		 case "Eylul" :
		 case "Kasim":
			 System.out.println("30 gun");
			 break;
		 case "Subat":
			 System.out.println("28 gun");
			 break;
		 default:
			 System.out.println("Tanimlanamadi");
				 
		   
		}
		
		scan.close();

	}

}
