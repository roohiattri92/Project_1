package String_12;

public class String_all_functions_1 {

	public static void main(String[] args) 
	{
		
		String name = "Ramanpreet kaur747948`4&&#%#^(#)!_($ljfhfhw";
		String alpha="";
		String Count="";
		int Alpha=0;
		int count=0;
		
		for(int i=0;i<name.length();i++)
		{
			char k=name.charAt(i);
			
			if(Character.isDigit(k)==true)
			{
				Alpha++;
				alpha=alpha+k;
			}
			if(Character.isAlphabetic(k)==true)
			{
				count++;
				Count=Count+k;
			}
			
		}
		System.out.println(alpha);
		//System.out.println(Count);
		System.out.println(Alpha);
		//System.out.println(count);
	//	String k=name.replaceAll("[a-zA-Z0-9]", "");
		//System.out.println(k);
		

	}

}
