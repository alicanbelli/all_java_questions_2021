package projects.advance_carproject;

import java.util.Arrays;

public class Advance_2_SortClass {


    public static void main(String[] args) {
        String [] names = {"Selami", "Betul","Bahadir","Akif"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        char [] firstName = names[0].toCharArray();
        Arrays.sort(firstName);
        System.out.println(Arrays.toString(firstName));

    }


}
