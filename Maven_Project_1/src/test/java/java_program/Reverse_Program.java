package java_program;

public class Reverse_Program {

	public static void main(String[] args) 
	{
		String name="Ramanpreet kaur";
		
		int f=name.length();
		System.out.println(f);
		
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i));
		}

		String[] word=name.split(" ");
	     String r1= word[0];
	     String r2= word[1];
	     System.out.println("  ");
	     System.out.println(r1);
	     System.out.println(r2);
	     
	     for(int i=r1.length()-1;i>=0;i--)
	     {
	    	 
	    	 System.out.print(r1.charAt(i));
	    	 
	     }
	     for(int i=r2.length()-1;i>=0;i--)
	     {
	    	 
	    	 System.out.print(r2.charAt(i));
	    	 
	     }
		
	}

}
