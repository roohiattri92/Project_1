package TestCases;

import org.testng.annotations.Test;

import Source.Home_page;
import Source.Signup_page;

public class Testcase_1 extends Launch_Quit
{
	@Test
	public void SingUp()
	{
		Home_page h1=new Home_page(driver);
		h1.signup(driver);
		
		Signup_page s1=new Signup_page(driver);
		s1.title_dropdown(driver);
		s1.FirstName_TextField();
		s1.LastName_TextField();
		s1.country_dropdown(driver);
		s1.Date_button();
		s1.month_dropdown(driver);
		s1.year_dropdown(driver);
		s1.date_selection();
		s1.mobile_no();
		s1.email(driver);
		s1.password();
		s1.con_password();
		s1.checkbox();
		s1.submit();
		
	}
	
	
}