package Interface_1;
interface Black
{
	void silver();
}
interface Brown extends Black 
{
	void golden();
   
} 
abstract class Grey implements Brown
 {
	abstract void green();
	static void red()
	{
		System.out.println("I am Red");
	}
	void orange()
	{
		System.out.println("i am orange");
	}
	
	
}
public class Interface_viva extends Grey
{

	public static void main(String[] args) {
		Interface_viva g=new Interface_viva();
		g.golden();
		g.silver();
		g.green();
		g.orange();
}
    @Override
	public void golden() 
	{
		System.out.println("i am golden");
	}

	@Override
	public void silver() 
	{
		System.out.println ("i am silver");
	}

	@Override
	void green() 
	{
		System.out.println("iam green");
	}
}

