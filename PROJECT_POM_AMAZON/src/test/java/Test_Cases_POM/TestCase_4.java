package Test_Cases_POM;

import org.testng.annotations.Test;

import Source_POM.Login;
import Source_POM.Profile_Edit;
import Source_POM.Home_page;

//check if user can successfully edit their profile information.

public class TestCase_4 extends Launch_Quit
{
   @Test
   public void edit_profile() throws InterruptedException
   {
	   Home_page j1=new Home_page(driver);
	   j1.hoverover(driver);
	  
	   
	   Login g1=new Login(driver);
		g1.signin();
		g1.un();
		g1.cont_button();
		g1.password();
		g1.signin_button();
		
		j1.hoverover(driver);
		 Thread.sleep(1000);
		 j1.manageprofile();
		 Thread.sleep(1000);
	     j1.view_button();
	     
	     Profile_Edit k1=new Profile_Edit(driver);
	     Thread.sleep(1000);
	     k1.Edit_icon();
	     k1.Name_change();
	     Thread.sleep(1000);
	     k1.click_on_continue();
	     Thread.sleep(1000);
	     k1.Pereferred_department();
	     k1.Add_option_select();
	     k1.Women_select();
	     Thread.sleep(2000);
	     k1.save_button();
   }
}
