package test_ng;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import selenium_program.Screenshort_classname_time;

public class Narendermodi 
{
	@Test
	public void youtube_narendermodi() throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement search=	driver.findElement(By.xpath("//input[@name='search_query']"));
	search.sendKeys("Narender Modi");
	search.sendKeys(Keys.ENTER);
	
	
	 
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[6]"));
	
	
	TakesScreenshot t=(TakesScreenshot)driver;
	   File source=	t.getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\Screenshortfile\\"+new Screenshort_classname_time().getClass()+".png");
		FileHandler.copy(source, destination);
	}

}
