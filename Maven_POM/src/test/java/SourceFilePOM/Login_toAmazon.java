package SourceFilePOM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_toAmazon 
{   WebDriver driver;
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement username;
	@FindBy(xpath="//input[@type='submit']")
	WebElement continue_button;
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement password;
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement sign_in;
	
    public void un()
{
	username.sendKeys("roohikohli92@gmail.com");
	
}
    public void cont()
    {
    	continue_button.sendKeys(Keys.ENTER);
    	
    }
    public void pswd()
    {
    	password.sendKeys("PAPAmami@786");;
    	
    }
    public void signin()
    {
    	
    	sign_in.sendKeys(Keys.ENTER);
    }
    
    public Login_toAmazon(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
}
