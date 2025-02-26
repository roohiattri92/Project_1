package Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page_aircanada 
{
	@FindBy(xpath="//input[@id='bkmgFlights_tripTypeSelector_O']")
	WebElement One_way_select;
	
	@FindBy(xpath="//input[@name='bkmgFlights_origin_trip_1']")
	WebElement From_city;
	
	@FindBy(xpath="//input[@id='bkmgFlights_destination_trip_1']")
	WebElement to_city;
	
	
	
	@FindBy(xpath="//span[@class='abc-form-element-suffix-icon ngx-ac-icon ngx-ac-icon-calendar']")
	WebElement Calender;
	
//	@FindBy(xpath="(//div[@class=\"date\"])[53]")
	@FindBy(xpath="(//div[.=' 22 '])[2]")
	WebElement Date_Select;
	
	@FindBy(xpath="//div[@class='abc-form-element-input abc-form-element-main text-transform-none']")
	WebElement Adults;
	
	@FindBy(xpath="(//span[.='+'])[1]")
	WebElement Plus_one_adult;
   
	@FindBy(xpath="(//span[.='+'])[3]")
	WebElement add_one_youth;
	
	@FindBy(xpath="(//div[@class=\"abc-ripple-wrapper\"])[17]")
	WebElement Close_adult_option;
	
	@FindBy(xpath="(//div[@class='abc-ripple-wrapper'])[16]")
	WebElement Search_select;
	
	@FindBy(xpath="//input[@id='bkmgFlights_tripTypeSelector_R']")
	WebElement Round_trip;
	
	@FindBy(xpath="//span[@class='abc-form-element-suffix-icon ngx-ac-icon ngx-ac-icon-calendar']")
	WebElement Return;
	
	@FindBy(xpath="(//div[@class='date'])[91]")
	
	WebElement Select_return_date;
	
	@FindBy(xpath="(//div[@class='abc-ripple-wrapper'])[19]")
	WebElement Select_option_button;
   
	@FindBy(xpath="//input[@id='bkmgFlights_tripTypeSelector_M']")
	WebElement Multi_city;
	
	@FindBy(xpath="//input[@id='bkmgFlights_origin_trip_2']")
	WebElement Flight2_from_city;
	
	@FindBy(xpath="//input[@id='bkmgFlights_destination_trip_2']")
	WebElement Flight2_To_city;
	
     @FindBy(xpath="(//span[@class='abc-form-element-suffix-icon ngx-ac-icon ngx-ac-icon-calendar'])[1]")
      WebElement Traveldate_1;
     
     @FindBy(xpath="(//div[@class='date'])[50]")
     WebElement Selectdate_multiwayflight;
     
     @FindBy(xpath="//span[@class='abc-form-element-suffix-icon ngx-ac-icon ngx-ac-icon-calendar']")
     WebElement Click_on_second_clender;
	
	public void One_way_select()
	{
		One_way_select.click();
	}
	
	public void From_city()
	{
		From_city.sendKeys(Keys.CONTROL +"A");
		From_city.sendKeys("Montreal");

	}
	
	public void to_city() throws InterruptedException
	{
		to_city.sendKeys("Delhi");
		Thread.sleep(1000);
		to_city.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		to_city.sendKeys(Keys.TAB);
	}
	
	public void Calender()
	{
		Calender.click();
	}
	public void Date_Select()
	{
		Date_Select.click();
	}
	public void Adults()
	{
		Adults.click();
	}
	
	
	public void Plus_one_adult()
	{
		Plus_one_adult.click();
	}
	
	public void add_one_youth()
	{
		add_one_youth.click();
	}
	
	public void Close_adult_option()
	{
		Close_adult_option.click();
	}
	
	public void Search_select()
	{
		Search_select.click();
	}
	
	public void Round_trip()
	{
		Round_trip.click();
	}
	
	public void Return()
	{
		Return.click();
	}
	public void Select_return_date()
	{
		
		Select_return_date.click();
		Select_return_date.sendKeys(Keys.ENTER);
		
	}
	
	public void Select_option_button()
	{
		
		Select_option_button.click();
	}
	
	
	
	
	
	
	public void Multi_city()
	{
		Multi_city.click();
	}
	
	public void Flight2_from_city()
	{
		Flight2_from_city.sendKeys("Delhi");
	}
	
	public void Flight2_To_city()
	{
		Flight2_To_city.sendKeys("Toronto");
	}
	
	public void Traveldate_1() throws InterruptedException
	{
		Thread.sleep(1000);
		Traveldate_1.click();
	}
	
	
	public void Selectdate_multiwayflight()
	{
		Selectdate_multiwayflight.click();
	}
	
	
	public void Click_on_second_clender()
	{
		Click_on_second_clender.click();
	}
	
	
	
	public Home_Page_aircanada(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
}
