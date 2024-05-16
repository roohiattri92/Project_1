package test_ng;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment199
{
	@BeforeSuite
	public void add1()
	{
		System.out.println("one");
	}

	
	@BeforeTest
	public void add2()
	{
		System.out.println("two");
	}

	
	@BeforeClass
	public void add3()
	{
		System.out.println("three");
	}

	@BeforeMethod
	public void add4()
	{
		System.out.println("four");
	}

	@Test
	public void add5()
	{
		System.out.println("Five");
	}

	@AfterMethod
	public void add6()
	{
		System.out.println("Six");
	}

	@AfterClass
	public void add7()
	{
		System.out.println("Seven");
	}

	@BeforeTest
	public void add8()
	{
		System.out.println("Eight");
	}

	@BeforeSuite
	public void add9()
	{
		System.out.println("Nine");
	}

	
}
