package _01_Variables;

import java.util.Scanner;

public class Office_3_All_Variables {

	public static void main(String[] args) {
	
		/*Soru 7:
		 * Kullanicidan 8 primitive veri tipinde de deger alalim ve ekrana yazdiralim.				
         * 1. Adim : Scanner class'i ile kullanicidan veri alalim				
         * 2. Adim : Aldigimiz her bir veriyi degiskenlere atayalim				
         * 3. Adim : Ekrana yazdiralim.				
           	INPUT      : int num1=41			
	        OUTPUT  : Kullanicidan Aldigimiz Sayi : 78			
				
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen byte tipide bir deger giriniz");
		byte b = scan.nextByte();
		System.out.println("Kullanicidan aldigimiz deger: "+b);
		System.out.println("================================================");
		
		System.out.println("Lutfen short tipide bir deger giriniz");
		short s = scan.nextShort();
		System.out.println("Kullanicidan aldigimiz deger: "+s);
		System.out.println("================================================");
		
		System.out.println("Lutfen integer tipide bir deger giriniz");
		int i = scan.nextInt();
		System.out.println("Kullanicidan aldigimiz deger: "+i);
		System.out.println("================================================");
		
		System.out.println("Lutfen long tipide bir deger giriniz");
		long l = scan.nextLong();
		System.out.println("Kullanicidan aldigimiz deger: "+l);
		System.out.println("================================================");
		
		System.out.println("Lutfen float tipide bir deger giriniz");
		float f = scan.nextFloat();
		System.out.println("Kullanicidan aldigimiz deger: "+f);
		System.out.println("================================================");
		
		System.out.println("Lutfen double tipide bir deger giriniz");
		double d = scan.nextDouble();
		System.out.println("Kullanicidan aldigimiz deger: "+d);
		System.out.println("================================================");
		
		System.out.println("Lutfen char tipide bir deger giriniz");
		char c = scan.next().charAt(0);
		System.out.println("Kullanicidan aldigimiz deger: "+c);
		System.out.println("================================================");
		
		System.out.println("Lutfen boolean tipide bir deger giriniz");
		boolean bl = scan.hasNext();
		System.out.println("Kullanicidan aldigimiz deger: "+bl);
		System.out.println("================================================");
		
		scan.close();
	}

}
