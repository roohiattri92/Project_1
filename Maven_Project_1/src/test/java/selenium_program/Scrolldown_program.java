package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldown_program 
{	WebDriver driver;
	@Test
	public void Scrolldrown() throws InterruptedException

	{
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement scrollbar=driver.findElement(By.xpath("//a[.='Twitter']"));
	   Point p1=scrollbar.getLocation();
	    int a=  p1.getX();
	    int b=p1.getY();
	    Thread.sleep(1000);
	    JavascriptExecutor j1= (JavascriptExecutor) driver;
	    j1.executeScript("window.scrollBy(0,1000)");
	    
	    
	    
	    
	    
	    
	    
	    
	    
	 
		
	}
}
