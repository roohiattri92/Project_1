package TestCases_Yatra;

import org.testng.annotations.Test;

import Source.Registeration_page;

//Validate the login functionality with valid credentials
public class TestCase_2 extends Launch_Quit
{
	@Test
	public void Login()
	{
		Registeration_page r1=new Registeration_page(driver);
		r1.My_account(driver);
		r1.Login_Button();
		r1.email_textfield();
		r1.continue_button();
	}

}
