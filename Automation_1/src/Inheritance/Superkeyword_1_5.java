package Inheritance;
class divide

{
	divide()
	{
		//this(10);
		System.out.println("yes");
	}
	divide(int a)
	{   
		this(true);
		System.out.println("no");
	}
	divide(boolean n)
	{ 
		this();
		System.out.println(" man");
	}
	divide(String b)
	{
		this(123);
		System.out.println("woman");
	}
	divide( long d)
	{
		System.out.println("p");
	}
}

public class Superkeyword_1_5 {

	public static void main(String[] args) 
	{
		divide mike=new divide("roohi");
		
	}

}
