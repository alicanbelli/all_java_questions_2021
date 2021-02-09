package _03_Casting_Wrapper;

import java.util.Scanner;

public class Office_3_AsciiSorgulama {

    /* Kullanıcının ekrana yazdığı karakterin ASCII tablosuna göre numarasını bulun.
     *
     * 1. Adım : Scanner ile nesne üretelim.
     * 2. Adım : Kullanıcıdan sorgulamak istediği karakteri yazmasını isteyelim.
     * 3. Adım : Ekrana yazdıralım.
     *
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ASCII tablosunda sorgulamak istediğiniz karakteri yazınız : ");
        char ch = scan.next().charAt(0);
        int ascii = (int)ch;
        System.out.println("ASCII : " + ascii);

        char chTanimlama = (char) 97;
        System.out.println(chTanimlama);

    }


}
