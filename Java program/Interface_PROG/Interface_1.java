package Interface_PROG;

interface Amazon
{
   void add();
  void substract();
  void multiplication();
  static void yes()
  {
	  System.out.println(" qwert");
  }
  
  abstract class login 
  {
abstract void gagan();
  abstract void Assaf();
  
  }

public class Interface_1 extends login implements Amazon
{
	void raman()
	{
		System.out.println("Ramanpreet");
}


public static void main(String[] args) {
		
	Interface_1 v1=new Interface_1();
	v1.add();
	v1.substract();
	}

public void add() {
	System.out.println("papa");
	
}

public void substract() {
	System.out.println("mummy");
	
}

public void multiplication() {
	
}

public void gagan() {
	
}

public void Assaf() {
	
}


}
}
