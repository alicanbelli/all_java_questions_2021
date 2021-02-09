package _04_Operators;

import java.util.Scanner;

public class Practise_4_AyakSayilari {


    /* Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     * Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.
     *
     * 1. Adım : Scanner sınıfından nesne üretelim.
     * 2. Adım : Kullanıcıdan çiftlikteki inek sayısını girmesini isteyelim.
     * 3. Adım : Kullanıcıdan çiftlikteki koyun sayısını girmesini isteyelim.
     * 4. Adım : Kullanıcıdan çiftlikteki tavuk sayısını girmesini isteyelim.
     * 5. Adım : Ayak sayısı ile hayvan sayısını çarparak ekrana yazdıralım.
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen inek sayısını giriniz : ");
        int inekSayisi = scan.nextInt();

        System.out.println("Lütfen koyun sayısını giriniz : ");
        int koyunSayisi = scan.nextInt();

        System.out.println("Lütfen tavuk sayısını giriniz : ");
        int tavukSayisi = scan.nextInt();

        int toplamAyak = inekSayisi * 4 + koyunSayisi*4 + tavukSayisi * 2;

        System.out.println("Toplam Ayak : " + toplamAyak);


    }

}
