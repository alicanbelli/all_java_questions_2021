package _12_While_DoWhile;

public class Office_5_FindNaturalNumbers {

    public static void main(String[] args) {
		/*WhileLoop
         write a Program to find the sum of natural numbers from 1 to 100.

     ORNEK:

     INPUT      :

     OUTPUT :   Sum of Natural Numbers =
     */

        int sum = 0;
        int i = 1;
        while(i<=100) {
            sum += i;
            i++;
        }

        System.out.println("Sum of Natural Numbers "+ sum);
    }



}
