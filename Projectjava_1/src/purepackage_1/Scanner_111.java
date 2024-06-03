package purepackage_1;

import java.util.Scanner;

public class Scanner_111 {
	static int a;
	static int b;
	static int sum;
	
	void mul()
	{
		a=34;
		b=65;
		System.out.println(a*b);
	}

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		sum =a+b;
		System.out.println(sum);
		
		Scanner_111 d1=new Scanner_111();
		d1. mul();
	}
}
