package TestCases_Yatra;

import org.testng.annotations.Test;

import Source.Registeration_page;

//Verify that users can successfully register for a new account
public class TestCase_1 extends Launch_Quit

{
	@Test
	public void Registeration()
	{
		Registeration_page r1=new Registeration_page(driver);
		r1.My_account(driver);
		r1.Sign_up_button();
		r1.email_textfield();
		r1.continue_button();
		r1.signin_with_google();
	}

}
