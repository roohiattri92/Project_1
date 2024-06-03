package IRetrying;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iretryingprogram
{
	WebDriver driver;
	@Test(retryAnalyzer=IRetrying.Iretryingprogram2.class)
	public void repeat()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com/");
		driver.findElement(By.name("p")).sendKeys("india");
	   
	}

}
