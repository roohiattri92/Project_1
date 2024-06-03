package Typecasting;

class parents2
{
	void add()
	{
		System.out.println("addition");
	}
	
}
class parent_4 extends parents2
{
	public static void two()
	{
		System.out.println("mul");
	}
	
}
public class CTc_1_upcasting extends parent_4

{
void go()
{
	System.out.println("roohi");
}


	public static void main(String[] args) {
		
		parent_4 h1= new CTc_1_upcasting();//upcasting
		h1.two();
		
		h1.add();
		
		//CTc_1_upcasting y1= new parent_4();
	
		
		
	}

}
