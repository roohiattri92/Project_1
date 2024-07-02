package Iretrying_123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Retryingtestcase 
{
WebDriver driver;
	@Test(retryAnalyzer=Iretrying_123.Iretry_3.class)
	public void Retryingtest()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.elementToBeClickable(By.id("APjFqb")));
	 
	 driver.findElement(By.id("APjFqb")).sendKeys("india"+Keys.ENTER);
		
		
		
		
		
		
		
	}

}
