package _01_Variables;

public class Practise_3_DegiskenAtamalar {


	/* Primitive tipler nelerdir ?
	 * 	boolean, char, byte , short, int, long, float, double
	 *
	 * Degisken isimlendirme nasýl olmali ?
	 *
	 * String nedir ?
	 *
	 * Nasil yazi birlestiriyoruz ?
	 *
	 *
	 *
	 *
	 * */

	public static void main(String[] args) {

		boolean booleanDegiskeni = false;
		char charDegiskeni = 'A';
		byte byteDegiskeni = 127;
		short shortDegiskeni = 32000;
		int intDegiskeni = 900875;
		long longDegiskeni = 9223372036854775807l;
		float floatDegiskeni = 100.0f;
		double doubleDegiskeni = 1200.5d;


		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

		String yazi = "Deneme";
		System.out.println(yazi);

		String uzunYazi = "Deneme " + 20 + " Java " + 'Z' + 129;
		System.out.println(uzunYazi);


	}


}
