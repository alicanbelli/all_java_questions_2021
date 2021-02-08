package _08_Switch;

import java.util.Scanner;

public class Practice_2_Math_Operations {
public static void main(String[] args) {
	/*
	 Kullanicidan bir sayi iste.
Kullaniciya sececegi sembollerin menusunu goster ve birisini secmesini iste.
 Toplama : 1 Cikarma : 2 Carpma : 3 Bolme :4
Kullanicidan bir sayi daha iste.
Sonucu ekranda yazdir.
ORNEK:

INPUT      : Num1: 23
                         +
                  Num2: 55 
                 
OUTPUT  : Islemin Sonucu : 78
	 */
	
	/*
	 Ask user to enter two numbers
	 Show them e menu of operation signs and ask them to choose one.
	 "Addition: 1 , Subtraction : 2 , Multiplication : 3, Division : 4
	 Print the result on the console
	 
	 EXAMPLE:
	 	INPUT:    Num1 : 23
	 		      Num2 : 55
	 	OUTPUT :  Result : 78
	 */
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter first number please");
	double num1 = input.nextDouble();
	System.out.println("Enter second number please");
	double num2 = input.nextDouble();
	System.out.println();
	
	System.out.println("Which operation do you prefer?\n1 for Sum\n2 for Subtract"
			+"\n3 for Multiplication\n4 for Division" );
	
	int operation = input.nextInt();
	
	switch(operation) {
	case 1:
		System.out.println("The result of Addition Operation is"+" "+ (num1+num2));
		break;
		
	case 2:
		System.out.println("The result of Subtraction Operation in"+ " "+ (num1-num2));
		break;

	case 3:
		System.out.println("The result of Multiplication Operation in"+ " "+ (num1*num2));
		break;
		
	case 4:
		System.out.println("The result of Division Operation is"+" "+ (num1/num2));
		break;
		default:
			System.out.println("Wrong choice");
}
	input.close();


	
	
}
}

