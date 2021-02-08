package _02_Scanner;

import java.util.Scanner;

public class Mentoring_3_Scanner {
    public static void main(String[] args) {

        //Kullanicidan dikdortgenin kenar uzunluklarini alin
        // ve dikdortgenin alan ve cevresini konsola yazdiran programi yaziniz.
        //shortEdge=5
        //longEdge=6

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin uzun kenar uzunlugunu giriniz");
        int longEdge=scan.nextInt();
        System.out.println("Lutfen dikdortgenin kisa kenar uzunlugunu giriniz");
        int shortEdge=scan.nextInt();
        System.out.println("Alan: "+ longEdge*shortEdge);
        System.out.println("Cevre: "+2*(longEdge+shortEdge));
    }
}
