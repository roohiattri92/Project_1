
//program given by munish in testng for screenshot

package test_ng;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment208 
{
	static WebDriver god;
	
	@BeforeMethod
	public void method1()
	{
		god=new ChromeDriver();
		god.navigate().to("https://www.google.in/");
		god.manage().window().maximize();
		WebElement p=god.findElement(By.name("q"));
		p.sendKeys("india");
		p.sendKeys(Keys.ENTER);
		}
	@Test
	public static void method2() throws IOException
	{
    TakesScreenshot j=(TakesScreenshot)god;	
    File room=j.getScreenshotAs(OutputType.FILE);
    File house=new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\src\\test\\java\\test_ng\\ScreenshotinTESTNG\\"+".png");
    FileHandler.copy(room, house);
    }
	@AfterMethod
	public static void method3()
	{
		System.out.println("outbound call only");
		god.close();
	}
	}
