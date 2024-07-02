package test_ng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Robot_class 
{
	@Test
	public void click_on_link() throws AWTException, InterruptedException 
	{ 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
	WebElement y=	driver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[2]"));
		Actions h=new Actions(driver);
		h.contextClick(y).perform();
		Thread.sleep(2000);
		Robot y1=new Robot();
		y1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		y1.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		y1.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
