package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Color_class
{
	@Test
	public void color()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/youtube");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement h=driver.findElement(By.xpath("(//div[@class='x6s0dn4 x78zum5 xl56j7k x1608yet xljgi0e x1e0frkt'])[4]"));
	    Color button_color=	Color.fromString(h.getCssValue("background-color"));
	    String k=  button_color.asHex();
	    System.out.println(k);
	    System.out.println(button_color);
		
		
		
		
		
	}

}
