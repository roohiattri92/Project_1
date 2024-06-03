package Collection_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Upcasting_arraylist_list1 {

	public static void main(String[] args) 
	{
List r1=(List)new ArrayList();
r1.add(1234);
r1.add(43);
r1.add(12);
r1.add("p");
r1.add(true);
r1.add(false);
r1.add(656.1);
r1.add("yes");
r1.add(null);
r1.add(null);
r1.add(null);
r1.add(null);
System.out.println(r1);

Iterator n1=r1.iterator();
while(n1.hasNext()==true) {
	System.out.println(n1.next());
}
  ListIterator g1=r1.listIterator();
  while(g1.hasNext()==true)
  {
	  System.out.println(g1.next());
  }
while(g1.hasPrevious()==true)
{
	System.out.println(g1.previous());
}










	}

}
