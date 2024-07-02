package String_12;

public class String_Reverse_with_splitfx {

	public static void main(String[] args)
	{
		
		String name="Grotech Minds";
		String[]j=name.split("");
		 String w1=j[0];
		 String w2=j[1];
		 System.out.println(w1);
		 
		 for(int i=w1.length()-1;i>=0;i--)
		 {
			 System.out.print(w1.charAt(i));
		 }
		 
	StringBuffer n=new StringBuffer(name);
	StringBuffer h=	n.reverse();
	System.out.println(h);
		
		

	}

}
