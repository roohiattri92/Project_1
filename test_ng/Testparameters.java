//197Write a program with differenr paramters like priority, enabled, timeOut adn innvocation Count of TestNG


package test_ng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testparameters 
{
	@Test(priority=1)
	public void add()
	{
		System.out.println("");
	}
	
	@Test(priority=2)
	public void add1()
	{
		System.out.println("roohi1");
	}
	@BeforeMethod(enabled=false)
	public void add4()
	{
		System.out.println("roohi2");
	}
	@Test(priority=9)
	public void add3()
	{
		System.out.println("roohi3");
	}
	
	@Test(timeOut=1000)
	public void add5()
	{
		System.out.println("roohi4");
	} 
	
	@Test(priority=7)
	public void add6()
	{
		System.out.println(" roohi5");
	}
	
	
	@Test(invocationCount=3)
	public void add9()
	{
		System.out.println("two");
	}
	
	@Test
	public void add7()
	{
		System.out.println("seven");
	}
}
