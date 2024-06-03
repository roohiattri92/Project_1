package test_ng;

import org.testng.annotations.Test;

public class Grouping_testcases
{
	@Test(groups= {"Smoke"})
	public void add()
	{
		System.out.println("roohi");
	}
	@Test(groups= {"Smoke","regression"})
	public void add1()
	{
		System.out.println("roohi1");
	}
	@Test(groups= {"Smoke","System"})
	public void add2()
	{
		System.out.println("roohi2");
	}
	@Test(groups= {"Smoke","system"})
	public void add3()
	{
		System.out.println("roohi3");
	}
	@Test(groups= {"System"})
	public void add4()
	{
		System.out.println("roohi4");
	}
	

}
