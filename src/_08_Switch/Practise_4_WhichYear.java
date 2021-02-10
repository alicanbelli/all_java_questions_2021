package _08_Switch;

import java.util.Scanner;

public class Practise_4_WhichYear {

    public static void main(String[] args) {
		/*
		 * Switch, IfElse

        Write a Java program to find the number of days in a month.

        ORNEK:

          INPUT:
        Input a month number: 2
        Input a year: 2016

          OUTPUT  :
        February 2016 has 29 days
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input month number");
        int i = scan.nextInt();
        System.out.println("Please input a year");
        int y = scan.nextInt();

        switch(i) {
            case 1:
                System.out.println("January "+y+ " has 31 days");
                break;
            case 2:
                if(y%100==0) {
                    if(y%400==0) {
                        System.out.println("February "+y+" has 29 days");
                    }else {
                        System.out.println("February "+y+" has 28 days");
                    }
                }else if(y%4==0) {
                    System.out.println("February "+y+" has 29 days");
                }else {
                    System.out.println("February "+y+" has 28 days");
                }

                break;
            case 3:
                System.out.println("March "+y+ " has 31 days");
                break;
            case 4:
                System.out.println("April "+y+ " has 30 days");
                break;
            case 5:
                System.out.println("May "+y+ " has 31 days");
                break;
            case 6:
                System.out.println("June "+y+ " has 30 days");
                break;
            case 7:
                System.out.println("July "+y+ " has 31 days");
                break;
            case 8:
                System.out.println("August "+y+ " has 31 days");
                break;
            case 9:
                System.out.println("September "+y+ " has 30 days");
                break;
            case 10:
                System.out.println("October "+y+ " has 31 days");
                break;
            case 11:
                System.out.println("November "+y+ " has 30 days");
                break;
            case 12:
                System.out.println("December "+y+ " has 31 days");
                break;
            default:
                System.out.println("Invalid entry, please try again!");
        }

        scan.close();



    }


}
