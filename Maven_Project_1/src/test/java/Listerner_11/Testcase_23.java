package Listerner_11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listener_123.class )
public class Testcase_23 extends Listener_123
{ 
	@Test
	public void amazon_home() throws InterruptedException
	{
		
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("shoes");
	List<WebElement> w1=	driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		int count=	w1.size();
	System.out.println(count);
	Thread.sleep(2000);
	
	w1.get(count-6).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[@class='WKTcLC'])[3]")).click();
	
		
		
		
	}

}
