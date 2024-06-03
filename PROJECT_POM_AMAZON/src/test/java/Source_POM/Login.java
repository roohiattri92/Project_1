package Source_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement sign_in;
	
	@FindBy(id="ap_email")
	WebElement UN;
	
	@FindBy(id="continue")
	WebElement cont_button;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	public void signin()
	{
		sign_in.click();

	}
	public void un()
	{
		UN.sendKeys("roohikohli92@gmail.com");
     }
	
	public void incorrect_un()
	{
		UN.sendKeys("roohikohli91@gmail.com");
     }
	
	
	public void cont_button()
	{
		cont_button.click();
     }
	
	public void password()
	{
		password.sendKeys("PAPAmami@786");
     }
	
	public void incorrect_password()
	{
		password.sendKeys("PAPAmami@977");
     }
	
	
	public void signin_button()
	{
		signin_button.click();
     }
	
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
