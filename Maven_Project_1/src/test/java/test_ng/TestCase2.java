package test_ng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase2
{
@Test(priority=1)
public void method1()
{
	System.out.println("welcome");
	
}
@AfterMethod
public static void Method3()

{
	System.out.println("Hello roohi");
}

@BeforeMethod
public static void Method4()

{
	System.out.println("Hello jyoti");
}

@Test(priority=2)
public void method5()
{
	System.out.println("tum bin");
}
@Test
public void method6()
{
	System.out.println("tum ho");
}








}
