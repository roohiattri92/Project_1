package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Departing_flight 
{
	@FindBy(xpath="(//div[@class='display-on-hover'])[1]")
	WebElement Economy;
	
	@FindBy(xpath="(//span[.='Select'])[2]")
	WebElement Select_button_for_economy;
	
	@FindBy(xpath="(//div[@class='abc-ripple-wrapper'])[4]")
	WebElement choose_comfort;
	
	public void Economy()
	{
		Economy.click();
	}

	public void Select_button_for_economy()
	{
		Select_button_for_economy.click();
	}
	public void choose_comfort()
	{
		choose_comfort.click();
	}
	
	public Departing_flight(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
