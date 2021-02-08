package _04_Operators;

import java.util.Scanner;

public class Mentoring_9_Operators {

	public static void main(String[] args) {
		
		/* Soru 9:
		 * Kullanicinin girdigi 4 basamakli sayinin rakamlari toplamini veren programi yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int i = scan.nextInt();
		
		int binlerBasamagi = i/1000;
		int yuzlerBasamagi = (i/100)%10;
		int onlarBasamagi = (i%100)/10;
		int birlerBasamagi = i%10;
		
		System.out.println(binlerBasamagi+yuzlerBasamagi+onlarBasamagi+birlerBasamagi);
		
		scan.close();
		
	}
}
