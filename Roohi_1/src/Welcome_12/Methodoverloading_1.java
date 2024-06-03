package Welcome_12;

public class Methodoverloading_1 {
	
	void add(double d) {
		System.out.println("a");
	}
static void sub(int g)
{
	System.out.println("b");
	
}

void house(int w)
{
	System.out.println("n");
}
void tom(boolean j)
{
	System.out.println("v");
}
Methodoverloading_1(double d){
	System.out.println("j");
}
	public static void main(String[] args) {
		sub(10);
		Methodoverloading_1 S1= new Methodoverloading_1(23.321);
		S1.add(23.321);
		S1.house(45);
		S1.tom(true);
		Methodoverloading_1 o1= new Methodoverloading_1(23.321);
		

		
		
		

	}

}
