package _02_Scanner;

import java.util.Scanner;

public class Mentoring_4_Scanner {
    public static void main(String[] args) {
        //Kullanicidan eskenar bir ucgenin kenar uzunluklarindan biri ile yuksekligini alin
        // ve ucgenin alan ve cevresini konsola yazdiran programi yaziniz.
        //height= 6
        //edge= 4

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunlugunu giriniz");
        int edge=scan.nextInt();
        System.out.println("Lutfen ucgenin yuksekligini giriniz");
        int height=scan.nextInt();
        System.out.println("Alan: "+ edge*height/2);
        System.out.println("Cevre: "+3*edge);

    }
}
