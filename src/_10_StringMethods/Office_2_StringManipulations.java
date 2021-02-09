package _10_StringMethods;

import java.util.Scanner;

public class Office_2_StringManipulations {

    public static void main(String[] args) {
        // ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter hotmail address");
        String hotmail = scan.nextLine();

        // hotmail1234@hotmail.com
        if (hotmail.contains("@hotmail")) {// to make sure user enters a hotmail
            // hotmail =>>> gmail: replace g for hot
            String gmail = hotmail.replace("@hotmail.com", "@gmail.com");// order is important
            System.out.println(gmail);
        } else {
            System.out.println("You didn't enter a hotmail");
        }
        scan.close();
    }


}
