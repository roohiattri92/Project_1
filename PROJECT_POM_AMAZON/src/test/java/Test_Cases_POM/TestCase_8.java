package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Home_page;
import Source_POM.Login;

//Check if the product can be sorted by relevance (price,rating etc)

public class TestCase_8 extends Launch_Quit
{
   @Test
   public void Sorting_product()
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
		b1.sort_Men_size();
   }
}
