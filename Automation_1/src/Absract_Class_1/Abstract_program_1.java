package Absract_Class_1;
abstract class Roohi {

	abstract void login();
	abstract void Input();
}

public class Abstract_program_1 extends Roohi
{
	void registeration()
	{
		System.out.println("mummy");
	}
 
	public static void main(String[] args) {
		
		Abstract_program_1 a1=new Abstract_program_1();
		a1.login();
a1.registeration();
a1.Input();
	}

	
	void login() {
		System.out.println("Ramanpreet kaur");
		
	}


	void Input() {
System.out.println("Dua Hai");		
	}

}
