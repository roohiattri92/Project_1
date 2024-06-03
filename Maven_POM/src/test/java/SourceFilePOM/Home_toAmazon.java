package SourceFilePOM;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_toAmazon 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")
	WebElement first_shoes;
	
	public void search_shoes()
	{
	search_tf.sendKeys("shoes");
	search_tf.sendKeys(Keys.ENTER);
	 }
	public void firstshoes()
	{
	first_shoes.click();
	}
	
	 public Home_toAmazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
