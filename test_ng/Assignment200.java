//Write a program for Case1 Annotation


package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment200 
{
	@Test
	void add()
	{
		System.out.println("one");
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
