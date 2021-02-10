package _13_MethodCreation;

import java.util.Scanner;

public class Advance_5_Findsumofdigits_ofnumber {

    /* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları toplamını bulan method yazınız.
     *
     * 1. Adım : Kullanıcıdan sayı al.
     * 2. Adım : Sayıyı String'e çevirin.
     * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
     *
     * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
     * Method ismi : public static int getRakamlarToplami(int sayi)
     *
     */


    /* 2. Kullanıcının girdiği sayının, while döngüsü kullanarak rakamları toplamını bulan method yazınız.
     *
     * 1. Adım : Kullanıcıdan sayı al.
     * 2. Adım : Sayının %10'unu alarak son hanesini al ve toplama ekle.
     * 3. Adım : Daha sonra sayıyı son haneden kurtarmak için 10'a böl.
     * 4. Adım : Sayı 0 olarak kadar bu işlemi while döngüsü ile tekrarla.
     *
     * Bunu da method kullanarak yapalım, toplamı return etsin.
     * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        int sayi = scan.nextInt();

        System.out.println("Rakamları toplamı : " + getRakamlarToplami(sayi));
    }


    public static int getRakamlarToplami(int sayi) {
        int toplam = 0;
        String sayiString = String.valueOf(sayi);


        for(int i = 0 ; i < sayiString.length() ; i++) {
            int sayiyaCevir = Integer.parseInt(sayiString.substring(i,i+1));
            toplam = toplam + sayiyaCevir;

        }

        return toplam;

    }


    public static int getRakamlarToplamiWhileDongusu(int sayi) {

        int sonHane = 0 ;
        int toplam = 0;
        //// 987
        while (sayi > 0 ) {
            sonHane = sayi % 10;   		/// 987 % 10 = 7       98 % 10 = 8 	 	 9 % 10 = 9
            toplam = sonHane + toplam;  /// 7 + 8 = 15  + 9 = 24
            sayi = sayi / 10;        	/// 98  			   9				 0
        }

        return toplam;

    }

}
