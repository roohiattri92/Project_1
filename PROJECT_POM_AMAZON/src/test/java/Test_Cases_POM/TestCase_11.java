package Test_Cases_POM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Source_POM.Checkout_page;
import Source_POM.Home_page;
import Source_POM.Login;
import Source_POM.Product_page;
import Source_POM.Registeration;

//Validate the entire checkout process,including address selection,payment method selection.
public class TestCase_11 extends Launch_Quit
{
	@Test
	public void Checkout_process() throws InterruptedException, IOException
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
	p1.proceed_to_buy();
	
	Checkout_page k=new Checkout_page(driver);
	k.radio_button_select();
	k.use_this_address();
	Thread.sleep(2000);
	k.Select_credit_card();
	Thread.sleep(2000);
	k.enter_card_detail();
	Thread.sleep(1000);
	k.Iframe_solve(driver);
	
	TakesScreenshot t=(TakesScreenshot)driver;
	File source=	t.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\PROJECT_POM_AMAZON\\Screenshot_AmazonPROJECT\\"+ "TestCase.Pass.png");
	FileHandler.copy(source, destination);

		
}
	
}

