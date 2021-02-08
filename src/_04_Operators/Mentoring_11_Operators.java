package _04_Operators;

import java.util.Scanner;

public class Mentoring_11_Operators {

	public static void main(String[] args) {
	
		/* Soru 11:
		 * Kullanicinin girdigi 3 basamakli sayinin rakamlari toplamini veren programi yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int i = scan.nextInt();
		
		int yuzler = i/100;
		int onlar = (i/10)%10;
		int birler = i%10;
		
		System.out.println(yuzler+onlar+birler);
		
		scan.close();

	}

}
