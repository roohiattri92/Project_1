package test_ng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import selenium_program.Screenshort_classname_time;

public class NewProgramforexam 
{
	@Test
	public void program() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mouse");
        List<WebElement> w1=driver.findElements(By.xpath("(//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li)"));
         int p= w1.size();
        System.out.println(p);
         w1.get(w1.size()-6).click();
         
         TakesScreenshot t=(TakesScreenshot)driver;
  	   File source=	t.getScreenshotAs(OutputType.FILE);
  	   File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\Screenshortfile\\"+new Screenshort_classname_time().getClass()+".png");
  		FileHandler.copy(source, destination);
		
         
         
	}

}
