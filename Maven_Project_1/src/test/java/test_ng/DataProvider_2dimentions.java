package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_2dimentions
{
	@Test(dataProvider="data1")
	public void two_dimention(String user_name, String password)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys(user_name);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
}

	@DataProvider(name="data1")
	public Object[][] method()
	{
		Object l1 [][]  =new Object[3][2];
		
		l1[0][0]= "roohikohli92@gmail.com";
		l1[0][1]= "PAPAmami@777";
		
		l1[1][0]= "roohikohli92@gmail.com";
		l1[1][1]= "PAPAmami@778";
		
		return l1;
		
	}

	
	}
	
	
	


