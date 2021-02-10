package _11_ForLoops;

import java.util.Scanner;

public class Practise_6_PerfectNumber {

    public static void main(String[] args) {
		/*
		 * Perfect Number (Mükemmel sayı)
         Bir sayının mükemmel olup olmadığını bulan method yazınız.
         Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı,
         kendisine eşitse o sayı mükemmeldir.
        örnek :   ->


         ORNEK:

     INPUT      : 6

     OUTPUT :  1,2,3
                        1+2+3 = 6 = 6 (Mükemmel)
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a digit");
        int n = scan.nextInt();
        int sum = 0;

        for(int i = 1; i < n ; i++){
            if(n%i==0){
                sum = sum+i;
            }
        }

        System.out.println(sum);

        if(sum==n){
            System.out.println(n + " mukemmel sayidir");
        }else{
            System.out.println(n + " mukemmel sayi degildir");
        }

        scan.close();
    }

}
