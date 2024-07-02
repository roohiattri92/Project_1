package Listener_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(Listerner_11.class)
public class Testcase_1 
{ 
	@Test
	public void findcoloroflogin()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	     WebElement e1=	driver.findElement(By.id("loginbutton"));
	      Color j= Color.fromString(e1.getCssValue("background-color"));
	     String h= j.asHex();
	     System.out.println(h);
		
		
		
	}

}
