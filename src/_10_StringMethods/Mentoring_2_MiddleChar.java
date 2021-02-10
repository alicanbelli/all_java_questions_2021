package _10_StringMethods;

import java.util.Scanner;

public class Mentoring_2_MiddleChar {

    public static void main(String[] args) {
        //1.Ask user to enter a word. If the word has odd number of characters //lenth() of characters
        //and has 3 or more characters, print the character in the middle of the word.

        Scanner scan = new Scanner(System.in);

        String word = scan.next();


        if(word.length()%2==1 && word.length()>=3) {
            System.out.println("The word has odd number od characters");

            System.out.println(word.substring(word.length()/2, word.length()/2+1));


        }else {
            System.out.println("It has not odd number of characters");
        }






    }

}
