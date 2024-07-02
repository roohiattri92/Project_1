package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_testing 
{
	WebDriver driver;
	@Test 
	@Parameters("cross_browser")
	public void crossbrowser( String cross_browsertesting)
	{
		if(cross_browsertesting.equals("chrome"))
		{
			driver=new ChromeDriver();
			
		}
		if(cross_browsertesting.equals("edge"))
		{
			driver=new EdgeDriver();
			
		}
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
