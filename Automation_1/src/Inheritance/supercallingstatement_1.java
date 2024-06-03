//super keyword is only using in the concept of inheritance
//how to find inheritance program-with the help of extends


//method overriden

package Inheritance;

class parent
{
	void add()
	{
		System.out.println("addition");
	}
	


public class supercallingstatement_1 extends parent
{
    void add()
	{
    	 super.add();
		System.out.println("papa");
	}
}

	

	public static void main(String[] args) {
supercallingstatement_1 o=new supercallingstatement_1();
o.add();
		
	}
}


