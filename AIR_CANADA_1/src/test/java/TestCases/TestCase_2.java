package TestCases;

import org.testng.annotations.Test;

import Source.Registeration_Login_Pge;

//validate the login functionality with valid credential.

public class TestCase_2 extends Launch_Quit
{
  @Test
  public void login() throws InterruptedException
  {
	  Registeration_Login_Pge r1=new Registeration_Login_Pge(driver);
		Thread.sleep(2000);
		r1.Click_Signin();
		r1.Signin_button();
		r1.Email_tf_login();
		r1.Password_tf_login();
		Thread.sleep(2000);
		r1.Sign_in_login();
  }
}
