package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Login;
import Source_POM.Registeration;

//Ensure login is fail with incorrect email and password.

public class TestCase3 extends Launch_Quit
{
	@Test
	public void login_with_incorrect_email_password()
	
	{
		
		Registeration R1=new Registeration(driver);
		R1.Hoverover(driver);
		
		
		Login j1=new Login(driver);
		j1.signin();
		j1.incorrect_un();
		j1.cont_button();
		j1.incorrect_password();
		j1.signin_button();
		
	}

}
