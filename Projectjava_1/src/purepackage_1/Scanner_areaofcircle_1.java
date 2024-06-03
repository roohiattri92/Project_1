package purepackage_1;

import java.util.Scanner;

public class Scanner_areaofcircle_1 {
	
	static float pi=3.14f;
	static int r;
	static float rf;
      static float A;

	

	public static void main(String[] args) {
		
	Scanner s1=new Scanner(System.in);
	r=s1.nextInt();
	rf=s1.nextFloat();
	pi=s1.nextFloat();
	A=pi*r*rf;
	System.out.println(A);
	
	
	
		

	}

}
