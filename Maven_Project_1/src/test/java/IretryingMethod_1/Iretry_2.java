package IretryingMethod_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Iretry_2 
{
	WebDriver driver;
   @Test(retryAnalyzer=IretryingMethod_1.Iretry_1.class)
   public void retry_same_testcase()
   {
	  driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.name("q")).sendKeys("india");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
   }
	
}
