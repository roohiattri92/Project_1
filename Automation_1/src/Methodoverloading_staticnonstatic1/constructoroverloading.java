package Methodoverloading_staticnonstatic1;

public class constructoroverloading 

{
	constructoroverloading()
	{
		System.out.println("p");
	}
	constructoroverloading(int a)
	{
		System.out.println("t");
	}
	constructoroverloading(boolean a)
	{
		System.out.println("k");
	}
	constructoroverloading(float q)
	{
		System.out.println("l");
	}
	constructoroverloading(long r)
	{
		System.out.println("m");
	}
	public static void main(String[] args) {
new constructoroverloading();
new constructoroverloading(10);

	}

}
