package _08_Switch;

import java.util.Scanner;

public class Office_3_YesorNo {

	public static void main(String[] args) {

		/* Soru 3:
		 * Kullanicidan  Y/N  ikilisinden birisini girdiginde girdigi degeri ekrana yazdiran java kodunu yaziniz.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Y/N ikilisinden birini giriniz");
	    char c = scan.next().charAt(0);
	    
	    switch(c) {
		   case 'Y':
			   System.out.println("Yes");
			   break;
		   case 'N':
			   System.out.println("No");
			   break;
		   default:
			   System.out.println("Wrong input");
	    }
	    
	    scan.close();

	}

}
