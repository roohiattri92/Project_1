package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Product_page;
import Source_POM.Home_page;
import Source_POM.Login;

// ensure that the product detail page displays all necessary information(price,review,description)
public class TestCase_7 extends Launch_Quit
{
  @Test
  public void Display_information() throws InterruptedException
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
		b1.Print_price(driver);//print price of the shoes in source file
		b1.click_shoe(driver);
		
		Product_page w=new Product_page(driver);
	    // w.review_rating(driver);
	     w.Rating_check();
	    
		//w.wishlisit();
	// w.Check_Review();
		
  }
}
