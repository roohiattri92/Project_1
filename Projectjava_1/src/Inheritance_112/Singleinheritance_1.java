package Inheritance_112;

class parentname_1{
	static	int a=13;
	static int b=43;
	static int sum=a+b;
	static int sub=a-b;
	
	void add() {
		System.out.println(sum);
	}

void num() {
	System.out.println(sub);
}
}

public class Singleinheritance_1 extends parentname_1
{
	static	int a=17;
	static int b=47;
	static int sum=a+b;
	static int sub=a-b;
	
	static void mul() {
		System.out.println(sub);
	}

	public static void main(String[] args) {
	
mul();
Singleinheritance_1 n1=new Singleinheritance_1();
n1.add();
n1.num();
	}

}
