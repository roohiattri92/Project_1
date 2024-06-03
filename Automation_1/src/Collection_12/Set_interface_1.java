package Collection_12;

import java.util.Set;
import java.util.TreeSet;

public class Set_interface_1 {

	public static void main(String[] args) {

		Set v1=new TreeSet();//upcasting treeset inherite the set.
		v1.add(235);
	
		v1.add(198);
		v1.add(875);
	//	v1.add(-41);
	//	v1.add(23.12);
	//	v1.add(true);//follow sort
	//	v1.add(null);
		System.out.println(v1);
		
	}

}
