//Write a program for Case2 Annotation

package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment201 
{
	@Test
	void add()
	{
     System.out.println("one");
	}
	@Test(priority=2)
	void add8()
	{
		System.out.println("six");
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
