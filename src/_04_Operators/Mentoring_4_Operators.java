package _04_Operators;

import java.util.Scanner;

public class Mentoring_4_Operators {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int i = scan.nextInt();
		
		int ilk = i/100;
		int son = i%10;
		
		System.out.println(ilk+son);
		
		scan.close();
		
	}

}
