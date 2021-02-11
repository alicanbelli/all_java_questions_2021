package _01_Variables;

public class Mentoring_6_CharExample {

    public static void main(String[] args) {
        /*
         * create 3 char variables then print A L I on the console using
         *  String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */              //0123456789
        String pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char ch1 = pickName.charAt(0);
        char ch2 = pickName.charAt(11);
        char ch3 = pickName.charAt(8);
        System.out.print(ch1+" ");
        System.out.print(ch2+" ");
        System.out.println(ch3+" ");



    }

}
