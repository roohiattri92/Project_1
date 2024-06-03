package Source_POM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement Hover_over;
	
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement Manage_profile;
	
	@FindBy(xpath="//a[.='View']")
	WebElement view_button;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement Search_text_field;
	
	@FindBy(xpath="(//span[@class='a-size-base a-color-base'])[9]")
	WebElement Select_men_seneaker;
	
	@FindBy(xpath="(//span[@class='a-color-base'])[2]")
	WebElement Print_price;
	
	@FindBy(xpath="(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")
	WebElement click_shoe;
	
	@FindBy (xpath="//span[.='6.5']")
	WebElement sort_Men_size;
	
	
	
	
	public void hoverover(WebDriver driver)
	{
		Actions h1=new Actions(driver);
		h1.moveToElement(Hover_over).perform();
	}
	
	public void manageprofile()
	{
		Manage_profile.click();
	}
	
	public void view_button()
	{
		view_button.click();
		
	}
	
	public void search_text_field()
	{
		Search_text_field.sendKeys("Shoes");
		Search_text_field.sendKeys(Keys.ENTER);
	}
	
	public void Select_men_seneaker()
	{
		Select_men_seneaker.click();
		
	}
	
	
	public void Print_price(WebDriver driver)
	{
		String h=Print_price.getText();
		System.out.println(h);
		
	}
	public void click_shoe(WebDriver driver)
	{
		click_shoe.click();
		
		Set<String> H1=	driver.getWindowHandles();
		Iterator<String> Browser_ID= H1.iterator();
		String Parent_Id=Browser_ID.next();
		String child_Id=Browser_ID.next();
		driver.switchTo().window(child_Id);
	}
	public void sort_Men_size()
	{
	  sort_Men_size.click();

	}
	
	
	
	
	
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
