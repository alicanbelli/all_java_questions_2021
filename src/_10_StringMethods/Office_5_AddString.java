package _10_StringMethods;

public class Office_5_AddString {

    public static void main(String[] args) {

		/*StringMethods:
        Write a Java program to take the last three characters from a given string and add the three characters at
        both the front and back of the string.
         String length must be greater than three and more.

        ORNEK:

         INPUT      : Ankara

         OUTPUT  : araAnkaraara
		 *
		 */

        String str1 = "Ankara";
        String str2 = str1.substring(3);
        String str3 = str2+str1+str2;
        System.out.println(str3);


    }

}
