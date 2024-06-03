package Inheritance;
class yenky
{
	yenky()
	{
		System.out.println("love");
	}
	yenky(int a)
	{
		System.out.println("udamy");
	}
}

public class Supercalling___statement extends yenky
{
	
	
	Supercalling___statement()
	
	{
		//super(10);//explicitly called because constructor have paramerter if we want to call parameter constructor need to write explicitly super calling statement
		System.out.println("house");
	}

	Supercalling___statement(int a)
	
	{
		super();
		System.out.println("another");
	}
	public static void main(String[] args)
	{
		
		Supercalling___statement h=new Supercalling___statement(12);

	}

}
