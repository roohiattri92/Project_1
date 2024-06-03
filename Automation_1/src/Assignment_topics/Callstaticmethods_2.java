package Assignment_topics;

public class Callstaticmethods_2 
{
	static void add()
	{
		System.out.println("addition");
	}
	static void sub()
	{
		System.out.println(" substract");
	}
	void mu()
	{
		System.out.println("multiplication");
	}

	public static void main(String[] args) {

		add();
		sub();
		Callstaticmethods_2 l1=new Callstaticmethods_2();
		l1.mu();
	}

}
