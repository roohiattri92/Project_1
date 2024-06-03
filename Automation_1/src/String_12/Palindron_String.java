package String_12;

public class Palindron_String {
	
    
   
    
	public static void main(String[] args) 
	{
		String name="radar";
	    String House="";
            
               for( int i=0;i<=name.length()-1;i++)
            {
            	//System.out.println(name.charAt(i));
            	 House = House+name.charAt(i);
            	 System.out.println(House);
            	
            }
               
               if(name.equals(House))
               {
            	   System.out.println("it is palindrom");
               }
               else {
            	   System.out.println("it is not palindrom");
               }
          
	}

}
