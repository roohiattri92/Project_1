package purepackage_1;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		Scanner s1=new Scanner (System.in);
		int a=s1.nextInt();
		float b=s1.nextFloat();
		float sum=a+b;
		System.out.println(sum);
		s1.close();
	}

}
