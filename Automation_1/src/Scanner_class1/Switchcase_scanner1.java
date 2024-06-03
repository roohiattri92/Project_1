package Scanner_class1;

import java.util.Scanner;

public class Switchcase_scanner1 
{
public static void main(String[] args)
{
Scanner t1=new Scanner(System.in);
System.out.println("this my switch value");
int y=t1.nextInt();
switch(1)
{
case 1:
	System.out.println("my first number a");
    int a=t1.nextInt();
    System.out.println("my second number b");
     int b=t1.nextInt();
 	System.out.println("addition of two number");
     int sum=y+a+b;
	System.out.println(sum);
	break;
case 2:
	System.out.println("my first number a");
    int h=t1.nextInt();
    System.out.println("my second number b");
     int k=t1.nextInt();
 	System.out.println("addition of two number");
     int sub=y-k+h;
	System.out.println(sub);
	break;
	}
	
}
}



