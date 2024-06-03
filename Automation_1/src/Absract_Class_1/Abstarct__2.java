package Absract_Class_1;

import java.util.Arrays;

abstract class parent
 {
	 abstract void student_name();
	 abstract void age();
      abstract void Roll_no();
	 abstract void class_no();
	 static void father()
	 {
		 System.out.println("Ram teri Ganga");// Abstract class have abstract method and other methods as well static and non static method
	 }
 }

public class Abstarct__2 extends parent
{

	public static void main(String[] args) {
		Abstarct__2 w1=new Abstarct__2();
		w1.student_name();
		w1.Roll_no();
		father();
	}
	
	

	
	void student_name() {
		int age[]=new int[4];
		age[0]=12;
			age[1]=14;
			age[2]=16;
			for (int i=0;i<age.length;i++)
			{
				System.out.println(age[i]);
			}
			
		
		System.out.println(Arrays.toString(age));
	}

	
	void Roll_no() {
		String student_name[]=new String[4];
		student_name[0]="roohi";
		student_name[1]="Tania";
		student_name[2]="Sourav";
		for (int i=0;i<student_name.length;i++)
		{
			System.out.println(student_name[i]);
		
		
		System.out.println(Arrays.toString(student_name));
			
		}
	}

	
	void class_no() {
		
	}


	void age() {
		
	}

}
