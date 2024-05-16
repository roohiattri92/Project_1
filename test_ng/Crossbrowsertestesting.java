package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertestesting 
{ 
	WebDriver driver;
	@Test
	@Parameters("testing")
	public void crossbrowser(String google_search)
	{
		if(google_search.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(google_search.equals("chrome"))
		{
		 driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
	}

}
