package Data_provider_revision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 
{ 
	
	@Test(dataProvider= "data3")
	public void you_tube(String name)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement w1=driver.findElement(By.xpath("//input[@id='search']"));
		w1.sendKeys(name);
		w1.sendKeys(Keys.ENTER);
	}	
	
	@DataProvider(name= "data3")
	public Object[][] method1()
	
	{
		return new Object[][] { {"Nrender Modi"},{"Sonam Bajwa"},{"Salman Khan "},};

}
}
