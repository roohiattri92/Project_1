package TestCases;

import org.testng.annotations.Test;

import Source.Registeration_Login_Pge;

//verify user can successfully register their account.
public class TestCase_1 extends Launch_Quit

{
	@Test
	public void Registeration() throws InterruptedException
	{
		Registeration_Login_Pge r1=new Registeration_Login_Pge(driver);
		Thread.sleep(2000);
		r1.Click_Signin();
		r1.Signin_button();
		r1.Create_an_account();
		r1.email_tf();
		r1.password_tf();
		Thread.sleep(1000);
		r1.Accept_condition_box();
		r1.continue_button();
	}

}
