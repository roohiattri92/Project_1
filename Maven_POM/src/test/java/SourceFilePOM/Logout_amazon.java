package SourceFilePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Logout_amazon 
{
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement HoverOver;
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signout;
	
	
	public void Hover_over(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(HoverOver).perform();
	}
	@Test(dependsOnMethods="Hover_over")
	public void signout()
	{
		signout.click();
	}
	
	
	public Logout_amazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
}



