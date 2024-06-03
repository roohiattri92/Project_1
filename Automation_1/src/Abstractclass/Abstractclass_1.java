//will always called in main method as non static
// can write two type of methods concrete and abstract methods


package Abstractclass;

abstract class mummy
{
	abstract void add();
	abstract void sub();
	abstract void mul();
	static void house()//can write concrete method also
	{
		System.out.println("papa");
	}
	void roohi()
	{
		System.out.println("asaf");
	}
	
}


public class Abstractclass_1 extends mummy
{
	

	public static void main(String[] args) {
		Abstractclass_1 j=new Abstractclass_1();
		j.add();
		j.sub();
		j.mul();
		house();
		Abstractclass_1 p=new Abstractclass_1();
p.roohi();
	}

	@Override
	void add() {
System.out.println("addition");		
	}

	@Override
	void sub() {
System.out.println("substraction");		
	}

	@Override
	void mul() {
System.out.println("multiplication");		
	}

}
