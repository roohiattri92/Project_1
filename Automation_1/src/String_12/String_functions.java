package String_12;

public class String_functions {

	public static void main(String[] args) 
	{
		String name="Ramanpreet 781819--$%@#*(#&*#^Q!)!_kaur";
		String count="";
		String r="";
		
		for(int i=0;i>name.length();i++)
		{
		char t=name.charAt(i);
		System.out.print(t);
		if(Character.isDigit(t)==true)
		{
			count=count+t;
			
		}
		else
		{
			r=r+t;
		}
		
		}
		System.out.println(count);
		System.out.println(r);
	}

}
