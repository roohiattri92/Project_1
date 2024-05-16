
//Write a program for Case3 Annotation
package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment202 
{@Test
	void add()
	{
     System.out.println("one");
	}
	@Test(priority=2)
	void add8()
	{
		System.out.println("six");
	}
    @Test (priority=1)
   public void add0()
    {
	System.out.println("roohi");
    }
	@BeforeMethod
	public void add2()
	{
		System.out.println("two");
	}
	@AfterMethod
	public void add3()
	{
		System.out.println("three");
	}
	


}
