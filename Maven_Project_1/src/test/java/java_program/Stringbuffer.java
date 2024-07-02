package java_program;

public class Stringbuffer {

	public static void main(String[] args) 
	{
		
		
		StringBuffer j=new StringBuffer("Ramanpreet kaur");
		StringBuffer k=j.reverse();
		System.out.println(k);
		
		StringBuffer k1=j.append("roohi");
		System.out.println(k1);
		
		StringBuilder b=new StringBuilder("hello i am univers");
		int b1=	b.capacity();
		System.out.println(b1);
		
		
		

	}

}
