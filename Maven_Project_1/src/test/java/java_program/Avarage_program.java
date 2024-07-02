package java_program;

import java.util.Scanner;

public class Avarage_program {

	

	public static void main(String[] args)
	{
		Scanner num=new Scanner(System.in);
		
		int a=num.nextInt();
		int b=num.nextInt();
		int c=num.nextInt();
		int d=num.nextInt();
		int e=num.nextInt();
		int f=num.nextInt();
		double addition=a+b+c+d+e+f;
		System.out.println(addition);
		
		double avarage=addition/6;
		System.out.println(avarage);
		
		 
	 }

	}


