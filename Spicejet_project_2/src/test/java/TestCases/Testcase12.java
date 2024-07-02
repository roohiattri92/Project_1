package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;
import Source.Logout_page;

public class Testcase12  extends Launch_Quit
{
	//login to spice  search the flight and logout
	@Test
	public void login_search_logout() throws InterruptedException
	{
		Home_page h1=new Home_page(driver);
		h1.login();
		h1.mobile_no();
		h1.password();
		Thread.sleep(2000);
		h1.login_button();
		
		Thread.sleep(3000);
		h1.source_city();
		h1.source_name();
		h1.destination_city();
		h1.destination_name();
		h1.date_forward_button();
		h1.date_select();
		h1.flight_search_button();
		Thread.sleep(5000);
		
		Logout_page l1= new Logout_page(driver);
		l1.logout_click();
		l1.logout_button();
	}

}
