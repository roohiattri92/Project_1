package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Home_page;
import Source_POM.Login;

//Very that searching with filters( eg. category, price range) yield accurate result
public class TestCase_6 extends Launch_Quit
{
	@Test
	public void search_with_filters()
	{
		 Home_page j1=new Home_page(driver);
		   j1.hoverover(driver);
		  
		   
		   Login g1=new Login(driver);
			g1.signin();
			g1.un();
			g1.cont_button();
			g1.password();
			g1.signin_button();
			
			Home_page b1=new Home_page(driver);
			b1.search_text_field();
			b1.Select_men_seneaker();
			
	}
	

}
