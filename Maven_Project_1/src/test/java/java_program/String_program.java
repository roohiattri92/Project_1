package java_program;

public class String_program {
	static int alpha=0;
	static int numeric=0;
	static int space=0;
 

	public static void main(String[] args) 
	{
		String name="Pankaj 123 ^%(*^&@#%(*^&!@";
				System.out.println(name.length());
				
				char[] c1=name.toCharArray();//use to change string value to array
				System.out.println(c1[0]);
				
				for(int i=0;i<name.length();i++)
				{
					boolean a1=Character.isAlphabetic(c1[i]);//when we want to calculate
					boolean a2=Character.isDigit(c1[i]);
					boolean a3=Character.isSpaceChar(c1[i]);
					System.out.println(a1);
					
					if(a1==true)
					{
						alpha++;
					}
					if(a2==true)
					{
						numeric++;
					}
					if(a3==true)
					{
						space++;
					}
				}
				System.out.println(alpha);
				System.out.println(numeric);
				System.out.println(space);
				int q=name.length()-(alpha+numeric+space);
				System.out.println(q);
				String e1=name.replaceAll("[a-zA-Z0-9]"," ");//want to show not to count special character
				System.out.println(e1);
				}
		 
		
	}


