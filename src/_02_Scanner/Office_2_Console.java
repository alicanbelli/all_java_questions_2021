package _02_Scanner;

import java.util.Scanner;

public class Office_2_Console {

    public static void main(String[] args) {

        /*
         * Kullanicidan bir tamsayi girmesini isteyin ve sayiyi kendisinden bir kucuk
         * sayi ve bir buyuk sayi ile carpip sonucu yazdirin
         *
         * Ornek Input  : 10
         *       Output : 990 (9*10*11)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz... ");

        int sayi = scan.nextInt();


        System.out.println((sayi+1)*(sayi)*(sayi-1)+" ("+ (sayi-1)+ "*"+sayi+"*"+(sayi+1)+")");






        scan.close();

    }

}
