package Array__12;

import java.util.Arrays;

public class Average_array_1 {

	public static void main(String[] args) {
int age []= new int[5];
age[0]=1;
age[1]=2;
age[2]=3;
age[3]=4;
age[4]=5;

int Sum=0;
for(int i=0;i<5;i++) 
{
	System.out.println(age[i]);
	
	 Sum+=age[i];

	 System.out.println(Sum);
	int a1= age.length;
	//System.out.println(a1);
	double average=(double)Sum/a1;
	System.out.println(average);
	
	
	
}

	

}
}
