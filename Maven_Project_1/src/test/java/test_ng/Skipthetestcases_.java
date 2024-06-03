package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Skipthetestcases_ 
{
	@Test
	public void skiptestcase() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement h=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    h.click();
	    Thread.sleep(1000);
	    Actions g=new Actions(driver);
	    g.moveToElement(h).perform();
	    Thread.sleep(2000);
	    
	   
	   
	 }

}
