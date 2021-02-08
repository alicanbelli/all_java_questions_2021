package _01_Variables;

import java.util.Scanner;

public class Practise_2_Toplama {

	public static void main(String[] args) {
		
		/* Soru 2:
		 *  Kullanicidan iki sayi alin ve bu sayilarin toplamini konsola yazdiran programi yaziniz.
		 *  num1=10
		 *  num2=40
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1+num2);
		
		scan.close();
		
		
		
	}

}
