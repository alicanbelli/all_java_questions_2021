package _12_While_DoWhile;

import java.util.Scanner;

public class Practise_01_BinarytoDecimal {
    public static void main(String[] args) {
        /*
         * Binary to decimal
         * Ask user to enter a binary number and convert it to decimal
         */

        // 1- get from user a binary number

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a binary number");
        int binaryNum = scan.nextInt();


        // 2- get every digit from binary number and calculate its value

        int digitValue = 0 ;
        int placeValue =1 ;
        int sum = 0;
        int flag = 0;

        while(binaryNum>0) {
            digitValue=binaryNum%10;
            if (digitValue != 1 && digitValue !=0) {
                System.out.println("Your number is not a binary number");
                flag++;
                break;
            }
            sum=sum+ digitValue*placeValue;
            placeValue*=2 ;
            binaryNum=binaryNum/10;
        }

        // 3- add all value and print it on the console

        if (flag==0) {
            System.out.println("Decimal value of your Binary number is  = " + sum);
        }

        scan.close();


    }
}
