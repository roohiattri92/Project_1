package purepackage_1;


public class Localveriable1 {
	
	static void add()
	{
		int a=10;
		float b=3.412f;
		float sum=a+b;
		System.out.println(sum);
		
	
	}
	void sub() {
		int a=34;
		double b=7.2345;
		double substract=a-b;
		System.out.println(substract);
		
	}
	Localveriable1(){
		int a=76;
		int b=12;
		int mul=a*b;
		System.out.println(mul);
	}

	public static void main(String[] args) {
		add();
		
		Localveriable1 a1=new Localveriable1();
		a1.sub();
		
		Localveriable1 n1=new Localveriable1();
	}

}
