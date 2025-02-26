package Test_Cases_POM;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Source_POM.Checkout_page;
import Source_POM.Home_page;
import Source_POM.Login;
import Source_POM.Product_page;
import Source_POM.Registeration;

//check if user can able to apply coupon code or not
@Listeners(Listner_Amazon.class)
public class TestCase_13 extends Launch_Quit
{
   @Test
   public void check_Able_to_apply_Cupon() throws InterruptedException 
   {
	   Registeration R1=new Registeration(driver);
		R1.Hoverover(driver);
		
		Login g1=new Login(driver);
		g1.signin();
		g1.un();
		g1.cont_button();
		g1.password();
		g1.signin_button();
		
		Home_page b1=new Home_page(driver);
		b1.search_text_field();
		b1.click_shoe(driver);
		
		Product_page p1=new Product_page(driver);
		Thread.sleep(1000);
		p1.Add_to_cart();
		Thread.sleep(1000);
		
		p1.No_of_item_display(driver);
		Thread.sleep(1000);
		p1.proceed_to_buy();
		p1.proceed_to_buy();
		
		Checkout_page k=new Checkout_page(driver);
		k.radio_button_select();
		Thread.sleep(2000);
		
		k.use_this_address();
		Thread.sleep(3000);
		
		k.Enter_Coupon_code();
		
   }
   
}
