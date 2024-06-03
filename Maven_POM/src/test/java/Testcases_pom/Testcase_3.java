package Testcases_pom;

import org.testng.annotations.Test;

import SourceFilePOM.Addtowish_list;
import SourceFilePOM.Home_toAmazon;
import SourceFilePOM.Login_toAmazon;

//Login->Serach->click 1st product->cart->reach till payments page

public class Testcase_3 extends Launch_quit
{
	@Test
	public void Login_to_payment() throws InterruptedException
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
	}

}
