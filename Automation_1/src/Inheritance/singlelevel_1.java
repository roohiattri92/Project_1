//Super keyword in method overriden ..............


package Inheritance;
class oracel
{
	void add()
	{
		System.out.println("function");
	}
}

public class singlelevel_1 extends oracel
{
	
	void add()
	
	{
		super.add ();//super keyword using to call same method name but veriation in  implimention
		System.out.println("addition");
	}
	

	public static void main(String[] args)
	{
		singlelevel_1 k1=new singlelevel_1();
		k1.add();
		
	}

}
