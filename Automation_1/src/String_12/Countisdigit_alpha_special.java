package String_12;

public class Countisdigit_alpha_special 
{
	static int  Alpha=0;
	static int  Count =0;

	

      public static void main(String[] args) 
     {
	String name = "Ramanpreet kaur747948`4&&#%#^(#)!_($ljfhfhw";
	
      char[] u= 	name.toCharArray();
     
      for(int i=0;i<name.length();i++)
    	  
      {
    	  boolean a1=Character.isAlphabetic(u[i]);//when we want to calculate
    	 
			boolean a2=Character.isDigit(u[i]);
      
      if(a1==true)
      {
    	  Alpha++;
      
     }
     if(a2==true)
     	{
     		Count++;
     		
     	}
     }
      System.out.println(Alpha);
      System.out.println(Count);
      System.out.println(name.length()-(Alpha-Count));
}
}
