package _15_Arrays;

import java.util.Scanner;

public class Office_6_SplitArray {

    public static void main(String[] args) {


		/*
		Ask user to enter 5 names then assign them to an array
		eg:
		String names = "john Marry william Brian Richard";
		Then print the names 1 by 1 on the console
		String [] arrayNames = names.split(" ");
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 names leaving space in between");
        //             first  2      3      4     5
        String names ="john Marry william Brian Richard";

        String [] arrayNames = names.split(" ");

        for (int i = 0; i < arrayNames.length; i++) {
            System.out.println(arrayNames[i].length());
        }




    }


}
