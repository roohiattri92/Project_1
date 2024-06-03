package Source_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_Edit 
{
	@FindBy(xpath="//span[@class='a-declarative']")
	WebElement Edit_icon;
	
	@FindBy(id="editProfileNameInputId")
	WebElement Name_change;
	@FindBy(className="a-button-input")
	WebElement click_on_continue;
	@FindBy(xpath="//div[.='Preferred department']")
	WebElement Pereferred_department;
	@FindBy(className="attribute-action")
	WebElement Add_option_select;
	@FindBy(xpath="//button[.='Women']")
	WebElement Women_select;
	
	//@FindBy(xpath="(//input[@class='a-button-input'])[1]")
	@FindBy(xpath="(//input[@type='submit'])[1]")
	WebElement Save_button;
	
	public void Edit_icon()
	{
		Edit_icon.click();
	}

	public void Name_change()
	{
		Name_change.sendKeys(Keys.CONTROL +"A");
		Name_change.sendKeys("roohi");
	}
	
	public void click_on_continue()
	{
		click_on_continue.click();
	}
	
	public void Pereferred_department()
	{
		Pereferred_department.click();
	}
	
	public void Add_option_select()
	{
		Add_option_select.click();
	}
	public void Women_select()
	{
		Women_select.click();
	}
	
	public void save_button()
	{
		Save_button.click();
	}
	public Profile_Edit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
