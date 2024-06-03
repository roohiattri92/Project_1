package Source_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout_page 
{
	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
	WebElement use_this_address;
	@FindBy(xpath="(//input[@name='submissionURL'])[3]")
	WebElement radio_button_select;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[1]")
	WebElement Select_credit_card;
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement enter_card_detail;
	
	@FindBy(xpath="//iframe[@name='ApxSecureIframe']")
	WebElement Iframe_solve;
	
	@FindBy(xpath="//input[@name='addCreditCardNumber']")
	WebElement Iframe_solve_1;
	
	@FindBy(xpath="//input[@class='a-input-text a-form-normal a-width-large a-span9 pmts-claim-code']")
    WebElement Enter_Coupon_code;
	
	public void use_this_address() throws InterruptedException
	{
		use_this_address.click();
		Thread.sleep(1000);
	}
	
	
	public void radio_button_select()
	{
		radio_button_select.click();
	}
	
	public void Select_credit_card()
	{
		Select_credit_card.click();
	}
	public void enter_card_detail()
	{
		enter_card_detail.click();
	}
	public void Enter_Coupon_code()
	{
		Enter_Coupon_code.sendKeys("Summer123");
	}
	
	public void Iframe_solve(WebDriver driver)
	{
		driver.switchTo().frame(Iframe_solve);
		Iframe_solve_1.sendKeys("44657848884");
		
		
	}
	
	
	 public Checkout_page(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
}
