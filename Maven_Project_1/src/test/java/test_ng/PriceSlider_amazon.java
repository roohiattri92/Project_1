package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PriceSlider_amazon
{   
	@Test
	public void Priceslider() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
	    search.sendKeys("shoes"+ Keys.ENTER);
	    WebElement slider= driver.findElement(By.xpath("(//input[@class='s-range-input'])[1]"));
	    Thread.sleep(3000);
	    Actions D1=new Actions(driver);
	    
	    D1.dragAndDropBy(slider, 50, 0).perform();
	    
	    
	
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
