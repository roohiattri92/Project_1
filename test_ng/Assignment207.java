package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment207 
{
	WebDriver driver;
	
	@BeforeMethod
	void add() 
	{
	 driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
	
	}
	@Test
	void y() 
	{
		WebElement o=driver.findElement(By.name("q"));
		o.sendKeys("india");
		o.click();
		System.out.println("two");
	}
	@AfterMethod
	void t() 
	{
		System.out.println("roohi");
		driver.close();
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
