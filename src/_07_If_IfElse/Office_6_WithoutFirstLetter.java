package _07_If_IfElse;

import java.util.Scanner;

public class Office_6_WithoutFirstLetter {


    public static void main(String[] args) {
		/*
		 * StringMethods
       Write a Java program to read a string and if the first or last characters are 't',
        return the string without those 't' otherwise return the string unchanged.

        ORNEK:

        INPUT      : The given strings is: testcricket

         OUTPUT :  The new string is: estcricke
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a string");
        String a = scan.nextLine();

        System.out.println(without_t(a));

        scan.close();

    }

    public static String without_t (String s){
        String str = s.toLowerCase();
        if(str.charAt(0)=='t' && str.charAt(s.length()-1)== 't'){
            return str.substring(1,s.length()-1);
        }else if (str.charAt(0)=='t'){
            return str.substring(1);
        }else if (str.charAt(s.length()-1)== 't'){
            return str.substring(0,str.length()-1);
        }else
            return s;
    }

}
