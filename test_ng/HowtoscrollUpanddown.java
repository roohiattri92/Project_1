package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class HowtoscrollUpanddown 

{
	@Test
	public void Scrollupanddown() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement search=	driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("shoes");
	search.sendKeys(Keys.ENTER);
	WebElement f1=driver.findElement(By.xpath("//a[.='Facebook']"));
    Point p1= f1.getLocation();
    int x=p1.getX();
    int y=p1.getY();
    JavascriptExecutor h1= (JavascriptExecutor) driver;
    Thread.sleep(2000);
    
    
    
    for(int i=0;i<2;i--) 
    {
    h1.executeScript("window.scrollBy(0,200)");
		
		
	}

}
}
