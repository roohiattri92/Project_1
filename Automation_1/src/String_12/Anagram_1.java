package String_12;

import java.util.Arrays;

public class Anagram_1 {

	public static void main(String[] args) 
	{   
		String A="Roohi";
		String B="hoori";
		
		String first_leter=A.toLowerCase();
		String second_leter=B.toLowerCase();
		boolean b= A.equals(B);
		System.out.println(b);
		
		
		char[]	h=first_leter.toCharArray();
		char[]	l=second_leter.toCharArray();
		
		 Arrays.sort(h);
		 Arrays.sort(l);
		 
		 boolean J1=Arrays.equals(h, l);
		 if(J1)
		 {
			 System.out.println("it is anagram");
		 }
		 else
		 {
			 System.out.println("it is not anagram");
		 }
		
		
		}
	}


