package Iretryanalyzer_exam;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testcase_12 

{
	@Test(retryAnalyzer= Iretryanalyzer_exam.Iretry_analyzer.class)
	public void amazon_search1()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.ca/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement w1=	driver.findElement(By.id("twotabsearchtextbox"));
	    w1.sendKeys("Mobile"+Keys.ENTER);
	    Assert.assertTrue(false);
		
		
		
	}

}
