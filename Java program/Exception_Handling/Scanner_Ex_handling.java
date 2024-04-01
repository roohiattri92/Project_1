package Exception_Handling;

import java.util.Scanner;

public class Scanner_Ex_handling {

	public static void main(String[] args) {
		try {
     Scanner D1= new Scanner (System.in);
       byte two=     D1.nextByte();
       double man=     D1.nextDouble();
       double woman= two/man;
       System.out.println(woman);
		}
		catch (java.lang.ArithmeticException y1)
		{
			System.out.println("Fake");
		}
		finally {
			System.out.println("I will execute in any case");
		}
       

	}

}
