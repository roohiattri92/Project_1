package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Login;
import Source_POM.Registeration;

//Verify login is successful with correct email and password
public class TestCase_2 extends Launch_Quit
{
	@Test
	public void login_Amazon()
	{
		Registeration R1=new Registeration(driver);
		R1.Hoverover(driver);
		
		Login g1=new Login(driver);
		g1.signin();
		g1.un();
		g1.cont_button();
		g1.password();
		g1.signin_button();
	}

}
