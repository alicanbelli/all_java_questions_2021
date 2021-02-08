package _03_Casting_Wrapper;

public class Mentoring_1_DoubletoByte {

	public static void main(String[] args) {
		
		/* Soru 1:
		 * Double bir degisken olusturun ve onu byte degisken tipine cevirip konsolda yazdirin.
           Input: 35
		 */
		
		// Explicit(Acikca) Narrowing(Daraltma) Casting
		double d = 13.00;
		byte b = (byte) d;
		System.out.println(b);
		
	}

}
