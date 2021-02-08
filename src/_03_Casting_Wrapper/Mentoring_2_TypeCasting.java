package _03_Casting_Wrapper;

import java.util.Scanner;

public class Mentoring_2_TypeCasting {

	public static void main(String[] args) {
		
		/* Soru 2:
		 * Kullanicidan bir float bir deger girmesini isteyip, o sayiyi short degisken tipine cevirin ve konsolda yazdirin.
           Input: -20.6
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir float deger giriniz");
		float f = scan.nextFloat();
		
		short s = (short) f;
		System.out.println(s);
		
		scan.close();

	}

}
