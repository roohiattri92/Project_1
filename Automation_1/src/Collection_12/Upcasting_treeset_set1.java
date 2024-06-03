package Collection_12;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class Upcasting_treeset_set1 {

	public static void main(String[] args) 
	{
		Set h1=(Set)new TreeSet();
		h1.add(123);
		h1.add(54);
		h1.add(23);//only accept integer value and give value in ascending order
		h1.add(8);
		//h1.add("roohi");
		/*h1.add(true);
		h1.add(null);
		h1.add(null);
		h1.add(null);
		h1.add("i");
		h1.add(5567);
		h1.add(876);
		h1.contains(null);*/
		System.out.println(h1);
		Iterator k1= h1.iterator();
		while(k1.hasNext()==true)
		{
			System.out.println(k1.next());
		}
		//ListIterator k2=h1.listIterator();//ListIterator can use in list only not in list
		//ListIterator g1=r1.listIterator();
		
	}
}
	


