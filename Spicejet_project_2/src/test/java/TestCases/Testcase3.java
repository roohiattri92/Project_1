package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;

public class Testcase3 extends Launch_Quit
{
	//login with invalid credentials.
	@Test
	public void Login() throws InterruptedException
	{
		Home_page h1=new Home_page(driver);
		h1.login();
		h1.mobile_no();
		h1.invalid_password();
		Thread.sleep(2000);
		h1.login_button();
	}

}