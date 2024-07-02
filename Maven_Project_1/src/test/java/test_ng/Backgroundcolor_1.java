package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Backgroundcolor_1 
{
	@Test 
	public void backgroundcolor()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement e1=	driver.findElement(By.xpath("(//a[@role='button'])[2]"));
        Color t=Color.fromString(e1.getCssValue("background-color"));
         String g= t.asHex();
         System.out.println(g);
		
	}

}
