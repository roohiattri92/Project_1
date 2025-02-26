package Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeration_Login_Pge 
{
	@FindBy(xpath="(//div[@class='abc-ripple-wrapper'])[2]")
	WebElement Click_Signin;
	
	@FindBy(xpath="(//div[@class='abc-ripple-wrapper'])[18]")
	WebElement Signin_button;
	
	@FindBy(xpath="//a[.='Create an account']")
	WebElement Create_an_account;
	
	@FindBy(xpath="//input[@name='emailAddress']")
	WebElement email_tf;
	

	@FindBy(xpath="//input[@formcontrolname='password']")
	WebElement password_tf;
	
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container']")
	WebElement Accept_condition_box;
	
	@FindBy(xpath="(//div[.=' Continue '])[2]")
	WebElement continue_button;
	
	@FindBy(xpath="(//input[@class='gigya-input-text'])[12]")
	WebElement Email_tf_login;
	
	@FindBy(xpath="(//input[@class='gigya-input-password'])[13]")
	WebElement Password_tf_login;
	
	@FindBy(xpath="(//input[@class='gigya-input-submit'])[18]")
	WebElement Sign_in_login;
	
	
	public void Click_Signin()
	{
		Click_Signin.click();
	}
	public void Signin_button()
	{
		Signin_button.click();
	}
	public void Create_an_account()
	{
		Create_an_account.click();
	}
	public void email_tf()
	{
		email_tf.sendKeys("Ramanpreetkaur07011992@gmail.com");
	}
	public void password_tf() throws InterruptedException
	{
		password_tf.sendKeys("PAPAmami@786");
		Thread.sleep(2000);
		password_tf.sendKeys(Keys.TAB);
		
		password_tf.sendKeys(Keys.TAB);
		Thread.sleep(2000);
		password_tf.click();
	}
	public void Accept_condition_box()
	{
		Accept_condition_box.click();
	}
	public void continue_button()
	{
		continue_button.click();
	}
	public void Email_tf_login()
	{
		Email_tf_login.sendKeys("Ramanpreetkaur07011992@gmail.com");
	}
	
	public void InvalidEmail_tf_login()
	{
		Email_tf_login.sendKeys("Ramanpreetkaur02@gmail.com");
	}
	public void Password_tf_login()
	{
		Password_tf_login.sendKeys("PAPAmami@786");
	}
	public void invalidPassword_tf_login()
	{
		Password_tf_login.sendKeys("PAPAmami@86");
	}
	
	public void Sign_in_login()
	{
		Sign_in_login.click();
	}
	
	
	
	
	
	
	public Registeration_Login_Pge(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
