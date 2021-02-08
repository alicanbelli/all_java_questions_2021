package _03_Casting_Wrapper;

import java.util.Scanner;

public class Mentoring_6_TypeCasting {

	public static void main(String[] args) {
		
		/* Soru 3:
		 * Kullanicidan bir harf girmesini isteyip, o harfin ascii degerini konsolda yazdirin.
           Input: Z
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir harf giriniz");
		char h = scan.next().charAt(0);
		
		int asciiValue = h;
		System.out.println(asciiValue);
		
		scan.close();
		
		
		
	}

}
