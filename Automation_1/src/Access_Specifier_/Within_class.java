package Access_Specifier_;





public class Within_class {
private	void add() 
{
		System.out.println("Flower");
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
	

	public static void main(String[] args) {
		
		Within_class h1=new Within_class();
		h1.add();// all access specifier called within the class
		h1.sum();
		h1.rab();
		h1.hum();
		
			
		
	}

}
