package Methodoverloading_staticnonstatic1;

public class staticnonstatic 
{
	static void add()
	{
		System.out.println("addition");
	}
	static void add(int a)
	{
		System.out.println("substraction");
	}
	void mult()
	{
		System.out.println("multiplication");
	}
	void mult(boolean a)
	{
		System.out.println("function");
	}
	
	

	public static void main(String[] args) 
	{
 add();
 add(10);
 staticnonstatic e1=new staticnonstatic();
 e1.mult();
 e1.mult(true);
 
	}

}
