package _11_ForLoops;

import java.util.Scanner;

public class Office_2_MultiplicationTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int carpim=scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(carpim+"x"+i+"= "+carpim*i);
        }
    }
}