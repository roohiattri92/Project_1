package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_onedimention 
{
	@Test (dataProvider="data1")
	public void one_dimentions(String Search)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.className("gLFyf")).sendKeys(Search);
	}
	
	
	
	@DataProvider(name="data1")
	public  Object[]method1()
	{
		
		return new Object[][] {
			{"kalanaur"},
			{"gurdaspur"}
			};
	}
	
 
	

	

}


