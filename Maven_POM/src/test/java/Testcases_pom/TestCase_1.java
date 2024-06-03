package Testcases_pom;

import org.testng.annotations.Test;

import SourceFilePOM.Addtowish_list;
import SourceFilePOM.Home_toAmazon;
import SourceFilePOM.Login_toAmazon;

//Login->Search the product->clicking on 1st product->wishlist->cart
public class TestCase_1 extends Launch_quit
{
	@Test
	public void login_to_cart() throws InterruptedException
	{
		Login_toAmazon l1=new Login_toAmazon(driver);
		l1.un();
		l1.cont();
		l1.pswd();
		l1.signin();
		
		Home_toAmazon l2=new Home_toAmazon(driver);  
		l2.search_shoes();
		l2.firstshoes();
		
		Addtowish_list l3=new Addtowish_list(driver);
	    l3.parentwindowhandler(driver);
	    Thread.sleep(2000);
	    l3.Add_to_wishlist();
	    l3.view_your_list();
		
		
	}
	

}


