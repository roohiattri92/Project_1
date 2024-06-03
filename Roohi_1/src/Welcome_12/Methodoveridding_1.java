package Welcome_12;
class parent_11
{
void add() {
	System.out.println("i am grand parent");

	}
}
class parent_112 extends parent_11
{
	void add() {
		System.out.println("i am parent");
super.add();
		}
}
public class Methodoveridding_1 extends parent_112
{

	public static void main(String[] args) {
	System.out.println("i am  child");// cannot write super keyward in static 
	
	Methodoveridding_1 j1=new Methodoveridding_1();
	j1.add();
	}

}
