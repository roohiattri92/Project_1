package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase_2  extends Launch_Quit
{
	//validate login functionality with valid un & pswd
	@Test
	public void Login() throws InterruptedException
	{
		Home_page h1=new Home_page(driver);
		h1.login();
		h1.mobile_no();
		h1.password();
		Thread.sleep(2000);
		h1.login_button();
		
	}

}



