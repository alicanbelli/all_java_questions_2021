package _10_StringMethods;

public class Office_4_Compare {

    public static void main(String[] args) {

		/*
		 * StringMethods
           Write a Java program to compare a given string to another string, ignoring case considerations.

          ORNEK:

          INPUT      : Stephen Edwin King
                        Walter Winchell
          OUTPUT  : False

          INPUT      : Stephen Edwin King
                       stephen edwin king
          OUTPUT  : true
		 */



        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";

        System.out.println(str1.equalsIgnoreCase(str2));

        String str3 = "Stephen Edwin King";
        String str4 = "stephen edwin king";

        System.out.println(str3.equalsIgnoreCase(str4));


    }


}
