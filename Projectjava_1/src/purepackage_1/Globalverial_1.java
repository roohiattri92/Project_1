package purepackage_1;

public class Globalverial_1 {
static int a=23;
static int b=43;
static float c=3.124f;
static float sum=a+b+c;
void mul() {
	System.out.println(a*b);
	
}
static void division()

{
	System.out.println(a/b);
}
	public static void main(String[] args) {
		a=76;
		b=45;
		c=5.231f;
		sum=a+b+c;
		System.out.println(sum);
		division();
		Globalverial_1 d1=new Globalverial_1();
		d1.mul();

	}

}
