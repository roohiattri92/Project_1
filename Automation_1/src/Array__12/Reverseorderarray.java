package Array__12;

import java.util.Arrays;

public class Reverseorderarray {

	public static void main(String[] args) {
int age[]= new int[7];
int roll_no[]=new int[7];
int l= age.length-1;
age[0]=11;
age[1]=12;
age[2]=21;
age[3]=22;
age[4]=23;
age[5]=24;
age[6]=25;

System.out.println(Arrays.toString(age));

for(int i=0;i<age.length;i++)
{
	System.out.println(age[i]);
	
	roll_no[l]= age[i];
	l--;
	System.out.println("first array " + Arrays.toString(age));
	System.out.println( "reverse array" + Arrays.toString(roll_no));
	//System.out.println(roll_no[l]= age[i]);
}


	}

}
