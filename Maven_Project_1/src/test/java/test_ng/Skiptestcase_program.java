package test_ng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Skiptestcase_program 
{
	WebDriver driver;
	@Test(enabled=false)
	public void skiptestcase()
	{
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/login/");
	    WebElement d=	driver.findElement(By.xpath("//input[@type='text']"));
	    d.sendKeys("roohikohli92@gmail.com");
	    d.sendKeys(Keys.ENTER);
}
	@Test
	public void workone()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("p")).sendKeys("india");
	}
	
	    @Test(dependsOnMethods="workone")
	    public void skippedtest()
	{
		System.out.println("Roohi");
		
	}
}

