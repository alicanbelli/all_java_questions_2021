package _12_While_DoWhile;

import java.util.Scanner;

public class Practise_03_MukemmelSayi {

    public static void main(String[] args) {
        /*
         * Bir sayının mükemmel olup olmadığını bulan bir program yazınız.
         *
         *
         * Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine
         * eşitse o sayı mükemmeldir.
         *
         * ORNEK:
         *
         * INPUT : 6
         *
         * OUTPUT : 1,2,3 1+2+3 = 6 = 6 (Mükemmel)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();

        int bolenlerinToplami=0;
        int i=1;

        do {
            if (number%i==0) {
                bolenlerinToplami+=i;
            }
            i++;
        }

        while(i<number);


        if (bolenlerinToplami==number) {
            System.out.println(number + " mukemmel sayi");
        } else {
            System.out.println(number + " mukemmel sayi degil");
        }
        scan.close();
    }



}
