package TestCases;

import org.testng.annotations.Test;

import Source.Registeration_Login_Pge;

//login with invalid credential
public class TestCase_3 extends Launch_Quit

{
	@Test
	public void Login_invalid_Credential() throws InterruptedException
	{
		 Registeration_Login_Pge r1=new Registeration_Login_Pge(driver);
			Thread.sleep(2000);
			r1.Click_Signin();
			r1.Signin_button();
			r1.InvalidEmail_tf_login();
			r1.invalidPassword_tf_login();
			Thread.sleep(2000);
			r1.Sign_in_login();
	}

}
