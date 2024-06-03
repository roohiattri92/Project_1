package String_12;

import java.util.Date;

public class EpochTime_11 {

	public static void main(String[] args) {
		 Date d1=new Date();
		 System.out.println(d1);
		 
		long q1=d1.getTime();
		System.out.println(q1);
		
		long Q2=d1.getTime()+(1*24*60*60*1000);
		//Date D2= new Date(d1.getTime()-(10*24*60*60*1000));
		//System.out.println(D2);
		
		System.out.println(Q2);

	}

}
