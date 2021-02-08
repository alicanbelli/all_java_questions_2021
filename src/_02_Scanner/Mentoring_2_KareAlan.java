package _02_Scanner;

import java.util.Scanner;

public class Mentoring_2_KareAlan {
    public static void main(String[] args) {
        //Kullanicidan karenin bir kenar uzunlugunu alin ve
        // karenin alan ve cevresini konsola yazdiran programi yaziniz.
        //edge=5

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen karenin kenar uzunlugunu giriniz");
        int kenar=scan.nextInt();

        System.out.println("Alan: "+ kenar*kenar);
        System.out.println("Cevre: "+4*kenar);

    }
}
