package String_12;

public class Vowels_1 
{
  public static void main(String[] args)
	{
		String name="Ramanpreet kaur";
		
		for(int i=0;i<name.length();i++)
		{
		char j=	name.charAt(i);
		System.out.println(j);
		//vowels= a ,i,o,u,e
		if(j=='a'||j=='i'||j=='o'||j=='u'||j=='e')
		{
			System.out.println("it is vowel");
		}

	
		else
		{
			System.out.println("it is not vowel");
		}
	}
}
}
