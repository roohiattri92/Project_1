package String_12;

import java.util.Arrays;

public class OnecopyArray_12 {

	public static void main(String[] args) {
    int age[]= new int[4];
    age[0]=23;
    age[1]=24;
    age[2]=6;
    age[3]=13;
    int roll_no[]=new int[4];
    roll_no[0]=23;
    roll_no[1]=76;
    roll_no[2]=6;
    roll_no[3]=11;
   System.out.println(age.length);
   System.out.println(roll_no.length);
  
System.out.println(Arrays.toString(age));

System.out.println(Arrays.toString(roll_no));

for(int i=0; i<4;i++)
{
	System.out.println(age[i]);
	System.out.println(roll_no[i]);
	if(age[i]==roll_no[i])
	{
		System.out.println(" both are equal");
	}
	else
	{
		System.out.println("both are not equal");
	}
}






	}

}
