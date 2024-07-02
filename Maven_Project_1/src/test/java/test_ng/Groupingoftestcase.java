package test_ng;

import org.testng.annotations.Test;

public class Groupingoftestcase
{
	@Test(groups= {"smoke","integration"})
	public void grouping()
	{
		System.out.println("hello");
	}
	
	@Test(groups= {"smoke","regration","integration"})
	public void grouping1()
	{
		System.out.println("grouping1");
	}

	
	@Test(groups= {"smoke","integration"})
	public void grouping2()
	{
		System.out.println("grouping2");
	}

	
	@Test(groups= {"regration","system"})
	public void grouping3()
	{
		System.out.println("grouping3");
	}

	
	@Test(groups= {"regration","Whitebox"})
	public void grouping4()
	{
		System.out.println("grouping4");
	}

	
	@Test(groups= {"whitebox"})
	public void grouping5()
	{
		System.out.println("grouping5");
	}


}
