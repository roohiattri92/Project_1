package String_12;

public class Paladrom_2 
{

	public static void main(String[] args) 
	{
		String name="radar";
		StringBuffer j= new StringBuffer(name);
		StringBuffer m=j.reverse();
		System.out.println(m);
		
		if(name.equals(m.toString()))
		{
			System.out.println("it is palindrom");
		}
		else
		{
			System.out.println("it is not palindrom");
		}
	}
}




