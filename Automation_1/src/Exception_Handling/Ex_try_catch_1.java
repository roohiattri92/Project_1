package Exception_Handling;

public class Ex_try_catch_1 {

	public static void main(String[] args) {


	try {

		int r1= 1/0;
		System.out.println(r1);
	}


		catch(java.lang.ArithmeticException y1)
		{
		System.out.println("love");
		}
		
	finally {
		System.out.println("I will execute in any case");
		
	}
	}
}





