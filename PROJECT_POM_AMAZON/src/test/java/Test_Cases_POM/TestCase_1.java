package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Registeration;

//Test if new user can successfully register
public class TestCase_1 extends Launch_Quit
{
	@Test
	public void New_clientRegisteration()
	{
		Registeration R1=new Registeration(driver);
		R1.Hoverover(driver);
		R1.start_here();
		R1.name_tf();
		R1.Telephone_tf();
		R1.Password_tf();
		R1.Verify_phone_number();
				
	}

}
