package Access_Specifier_;
class Flower
{
	private	void add() 
	{
			System.out.println("rumer");
		}
	public void sum()
	{
		System.out.println("hello");
	}
	protected void rab()
	{
		System.out.println("ram");
		
	}
	void hum()
	{
		System.out.println("roohi");
	}


public class Becoming_subclass extends Flower
{
	void uuu()
	{
		System.out.println("y");
	}

	public static void main(String[] args) {
		
		Flower n1=new Becoming_subclass();
		n1.sum();
		
		
	}

}
}
