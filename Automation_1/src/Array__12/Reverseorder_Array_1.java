package Array__12;

import java.util.Arrays;

public class Reverseorder_Array_1 {

	public static void main(String[] args) {
		int age[]=new int[5];
		int roll_no[]=new int[5];
		int k=age.length-1;
		age[0]=12;
		age[1]=22;
		age[2]=92;
		age[3]=19;
		age[4]=18;
		
	System.out.println(k);
for(int i=0;i<age.length;i++)
		{
			roll_no[k]=age[i];
			k--;
			System.out.println("first array " + Arrays.toString(age));
			System.out.println( "reverse array" + Arrays.toString(roll_no));
		}

	}

}
