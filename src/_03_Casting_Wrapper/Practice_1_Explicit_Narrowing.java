package _03_Casting_Wrapper;

public class Practice_1_Explicit_Narrowing {
	public static void main(String[] args) {
		/*
		 create int type variable, convert into double type.
create double type variable, convert into int type.
ORNEK:

     INPUT      : int a=25
                  double b=35
     
     OUTPUT :    
		 */
		int a = 34;
		double b = a ; //Auto widening
		
		double c=45.6;
		int d = (int) c; //Explicit narrowing
		
		System.out.println(d);
		System.out.println(c);
		
		//Numbers are treated as int unless you specifically cast them otherwise
        //So in the second statement when you use a literal number (used only for representing the number) instead of a variable ,
        //it doesn't automatically cast it to the appropriate type
		short s = 10;
		s = (short) (s + 10) ;
		s += 10; //increment
		short num5 = 10;
		num5 =(short) (num5 + 10);
		
		short num6 = 5;
		short sum =(short)(num5+num6);
		short difference = (short) (num5-num6);
		short product = (short) (num5*num6);
		short quotient = (short) (num5/num6);
		short mod = (short) (num6%6);
		
		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(mod);
		
	}
}
