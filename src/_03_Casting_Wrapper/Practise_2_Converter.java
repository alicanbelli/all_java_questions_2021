package _03_Casting_Wrapper;

import java.util.Scanner;

public class Practise_2_Converter {

    /* Kullanıcının girdiği short sayıyı integere çeviren bir program yazınız.
     * Kullanıcının girdiği integerı shorta çeviren bir program yazınız.
     *
     * 	1. Adım : Scanner sınıfından nesne üretelim.
     * 	2. Adım : Aldığımız sayıyı long a çevirelim.
     *
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayıyı giriniz..");
        System.out.println(Short.MAX_VALUE);
		/*short sayi = scan.nextShort();

		short uzunSayi = sayi;

		System.out.println(uzunSayi);*/

        int sayi = scan.nextInt();
        short kisaSayi = (short)sayi;

        System.out.println(kisaSayi);




    }

}
