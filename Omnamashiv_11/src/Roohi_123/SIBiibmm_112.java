package Roohi_123;


public class SIBiibmm_112 {

	static {
		System.out.println("Main SIB Block");
	}
	{
		System.out.println("Main IIB Block");
		
	}
	void string()
	{
		System.out.println("Main non static");
	}
	SIBiibmm_112(){
		System.out.println("My name is constuctor");
	}

	
	public static void main(String[] args) {
		
		SIBiibmm_112 s1=new SIBiibmm_112();
		s1.string();
		new SIBiibmm_112();


	}

}
