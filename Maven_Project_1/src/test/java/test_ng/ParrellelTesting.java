package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParrellelTesting 
{	WebDriver driver;
	
	@Test
   @Parameters( "paralleltesting")
	public void parallel(String Browser)
	{
	    if (Browser.equals("Chrome"))
	    {
	    	driver=new ChromeDriver();
	    	
	    }
	  
	    if (Browser.equals("edge"))
	    {
	    	driver=new EdgeDriver();
	    }
	driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("india"+Keys.ENTER);
		
		
		
		
		   
		
		
		
		
		
		
	}

}
