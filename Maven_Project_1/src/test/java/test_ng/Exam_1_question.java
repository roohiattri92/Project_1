package test_ng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Exam_1_question 
{
	
	@Test
	public void search() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement w1=	driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	    w1.sendKeys("mouse");
	    List<WebElement> w2= driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
	    int y=w2.size();
    	System.out.println(y);
        Thread.sleep(3000);
        w2.get(y-6).click();
      
        driver.findElement(By.xpath("(//a[@class='wjcEIp'])[2]")).click();
        Thread.sleep(3000);
       
      
        Set<String> d1=driver.getWindowHandles();
        Iterator<String> browser_id= d1.iterator();
         String p_window1=  browser_id.next();
         String child_window=  browser_id.next();
          driver.switchTo().window(child_window);
        
       TakesScreenshot h= (TakesScreenshot) driver;
        File source=  h.getScreenshotAs(OutputType.FILE);
        File Destination= new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\ScreenShort_Revision1\\"+ Math.random()+".jpeg");
        FileHandler.copy(source, Destination);
        Thread.sleep(2000);
   	    driver.close();
        }
	}
