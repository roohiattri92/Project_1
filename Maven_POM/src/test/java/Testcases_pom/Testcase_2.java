package Testcases_pom;
//Login->serach->Sort the products->logout[Sort using 4* ratings,Delivery by Today]	

import org.testng.annotations.Test;

import SourceFilePOM.Home_toAmazon;
import SourceFilePOM.Login_toAmazon;
import SourceFilePOM.Logout_amazon;
import SourceFilePOM.Short_shoe_product;

public class Testcase_2 extends Launch_quit
{
	@Test
	public void login_to_logout() throws InterruptedException
	{
		Login_toAmazon l1=new Login_toAmazon(driver);
		l1.un();
		l1.cont();
		l1.pswd();
		l1.signin();
		Home_toAmazon l2=new Home_toAmazon(driver);  
		l2.search_shoes();
		
		Short_shoe_product l4=new Short_shoe_product(driver);
		Thread.sleep(1000);
		l4.four_start();
		l4.select_brand1();
		Thread.sleep(1000);
		l4.select_brand2();
		Thread.sleep(1000);
		l4.select_brand3();
		
		Logout_amazon l5=new Logout_amazon(driver);
		l5.Hover_over(driver);
		l5.signout();
		
		
		
	}
}
