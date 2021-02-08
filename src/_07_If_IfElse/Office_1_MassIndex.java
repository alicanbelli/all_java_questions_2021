package _07_If_IfElse;
import java.util.Scanner;

public class Office_1_MassIndex {

		public static void main(String[] args) {
			/*
			 Kullanicidan kilosunu ve boyunu alip
	V�cut kitle indeksini hesaplayan bir program yaz�n�z.
	�pucu : V�cut 
	Kitle �ndeksi (VK�) = V�cut A��rl��� (kg.) / Boy uzunlu�unun karesi (m.)

	ORNEK:

	     INPUT      : Kilo: 71
	                       Boy: 1,72
	     OUTPUT  : Vucut Kitle Indeksiniz : 24

			 */
			
			/*
			 Ask user to their weight and height and type a program with calculates mass index
			 HINT : Body Mass Index = Weight (kg) / Square of height (m)
			 Then give a message to user as following:
			 If BMI is less than 18.5 , you re weak
			 If BMI is between 18.5 and 25 , your weight is ideal
			 If BMI is between 25 and 30, you re fat
			 If BMI is more than or equal to 30, obese 
			 
			 EXAMPLE : 
			 
			 INPUT: Weight : 71
			 		Height : 1,72
			 		
			 OUTPUT : Your BMI is  : 23.99945916711736
			 */

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your weight as kilograms");
			double weight = scan.nextDouble();
			System.out.println("Enter your height as meters");
			double height = scan.nextDouble();
			double bmi = weight/(height*height);
			System.out.println("Your BMI is : "+ bmi);
			
			if(bmi<18.5) {
				System.out.println("You re weak :)");
			}else if(bmi>=18.5 && bmi<25) {
				System.out.println("Your weight is ideal");
			}else if(bmi<=25 && bmi < 30) {
				System.out.println("You re fat , you need to eat less and have exercise ");
			}else {
				System.out.println("OBESE :( ");
			}
			scan.close();
			
		}

	}


