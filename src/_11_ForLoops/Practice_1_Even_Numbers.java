package _11_ForLoops;

public class Practice_1_Even_Numbers {
	/*
	 print even numbers from 100 to 0 but do not use decrement(i--).

	EXAMPLE:
	     INPUT      : 
	     OUTPUT  : 100 98 96 94 92 …….2 0
	 */
	public static void main(String[] args) {

		System.out.print("Even Numbers from 100 to 0 are: ");
		for (int i = 100; i >=0; i--) {
		   //if number%2 == 0 it means its an even number
		   if (i % 2 == 0) {
			System.out.print(i + " ");
		   }
		}
	}
}
