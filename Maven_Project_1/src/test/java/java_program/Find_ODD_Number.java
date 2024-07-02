package java_program;

import java.util.Scanner;

public class Find_ODD_Number {

	public static void main(String[] args) 
	
	{
		Scanner number=new Scanner(System.in);
		int p=number.nextInt();
		System.out.println(p);
		
		
		
		
		if(p%2==0)
		{
			System.out.println("this is even number");
		}
		else
		{
			System.out.println("number is odd");
		}

	}

}
