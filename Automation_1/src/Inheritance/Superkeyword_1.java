package Inheritance;

class demo
{
	demo()
	{
	
		System.out.println("floor");
	}
	
	demo(int a)
	{
		//this();
		System.out.println("roof");
	}
}

public class Superkeyword_1 extends demo
{
	
	Superkeyword_1()
	{
		super();//super(12
		System.out.println("family");
	}

	public static void main(String[] args) {

		
		Superkeyword_1 j=new Superkeyword_1();
	
		
		
	}

}
