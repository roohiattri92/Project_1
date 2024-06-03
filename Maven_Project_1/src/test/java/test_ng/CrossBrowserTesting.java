package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting
{
	 WebDriver Driver;
	
	@Test
	@Parameters("browser")
	public  void add(String login)
	{
		if(login.equals("chrome"))
		{
		Driver= new ChromeDriver();	
		}
		if(login.equals("Edge"))
		{
		Driver= new EdgeDriver();	
			
		}
		Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Driver.get("https://www.google.com/");
	WebElement w1=Driver.findElement(By.name("q"));
	w1.sendKeys("india");
	w1.sendKeys(Keys.ENTER);
	}

}
