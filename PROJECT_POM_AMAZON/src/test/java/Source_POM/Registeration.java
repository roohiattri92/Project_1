package Source_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration
{    WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	WebElement Hoverover;
    @FindBy(xpath="//a[.='Start here.']")
    WebElement Starthere_button;
    @FindBy(id="ap_customer_name")
    WebElement Name_tf;
    @FindBy(id="ap_phone_number")
    WebElement Telephone_tf;
    @FindBy(id="ap_password")
    WebElement Password_tf;
	@FindBy(id="continue")
	WebElement Verify_phone_number;
	public void Hoverover(WebDriver driver)
	{
		Actions A1=new Actions(driver);
		A1.moveToElement(Hoverover).perform();
	}
	
	public void start_here()
	{
		Starthere_button.click();
	}
	
	public void name_tf()
	{
		Name_tf.sendKeys("Ramanpreet kaur");
	}
	
	public void Telephone_tf()
	{
		Telephone_tf.sendKeys("2896237862");
	}
	
	public void Password_tf()
	{
		Password_tf.sendKeys("PAPAmami@777");
	}
	
	public void Verify_phone_number()
	{
		Verify_phone_number.click();
	}
	
	
	public Registeration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}

