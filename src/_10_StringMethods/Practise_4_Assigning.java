package _10_StringMethods;

import java.util.Scanner;

public class Practise_4_Assigning {

    public static void main(String[] args) {

		/*
		 * StringMethods
           Write a Java program to read a string and return the string
            without the first two characters.
           Except keep the first char if it is 'g' and keep the second char if it is 'h'.

          ORNEK:

           INPUT      : The given strings is: goat
                        The given strings is: photo
                        The given strings is: ghost


           OUTPUT :     The new string is: gat
                        The new string is: hoto
                        The new string is: ghost
		 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a string");
        String str = scan.nextLine().toLowerCase();

        if(str.startsWith("gh")){
            System.out.println(str);
        }else if(str.startsWith("g")) {
            System.out.println((str.charAt(0)) + (str.substring(2)));
        }else if(str.charAt(1)=='h'){
            System.out.println(str.substring(1));
        }else {
            System.out.println(str.substring(2));
        }

        scan.close();
    }
}
