package _04_Operators;

import java.util.Scanner;

public class Mentoring_5_ZamaniCevirme {

    /*
     * Girilen saati  saniyeye çeviren program yazınız
     * 		Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     *
     * 1. Adım : Scanner sınıfından nesne üretelim.
     * 2. Adım : Kullanıcıdan saati alalım.
     * 3. Adım : Kullanıcıdan dakikayı alalım.
     * 4. Adım : Kullanıcıdan saniyeyi alalım.
     * 5. Adım : Saati 3600 ile çarparak saniyeyi bulalım.
     * 6. Adım : Dakikayı 60 ile çarparak saniyeyi bulalım.
     * 7. Adım : Saatten ve dakikadan bulduğumuz saniyeyi, diğer saniye ile toplayarak toplam saniyeyi bulalım.
     * 8. Adım : Ekrana yazdıralım.
     *
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen saati giriniz : ");
        int saat = scan.nextInt();

        System.out.println("Lütfen dakikayı giriniz : ");
        int dakika = scan.nextInt();

        System.out.println("Lütfen saniyeyi giriniz : ");
        int saniye = scan.nextInt();

        int toplamSaniye = saat * 3600 + dakika * 60 + saniye;
        System.out.println("Toplam saniye : "+ toplamSaniye);

    }

}
