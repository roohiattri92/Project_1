package dataprovider_1_revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 
{
	WebDriver driver;
	@Test(dataProvider="data1")
	public void Dp(String user_name)
	{
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys(user_name);
}
	
	@DataProvider(name="data1")
	public Object[][]method1()
	
	{
		return new Object[][] {{"narender modhi"},{"Salman khan"},{"deepika"}};
		
	}
	

}
