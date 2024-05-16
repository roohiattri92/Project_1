package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvider1 
{
	@Test(dataProvider="search")
	public void datasheet( String input,String passward)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(input);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passward);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@DataProvider(name="search")
	public Object datasite()
	{
		Object l1 [][]  =new Object[4][2];
		l1[0][0]="roohikohli92@gmail.com";
		l1[0][1]="Papalami@786";
		
		l1[1][0]="roohikohli92@gmail.com";
	    l1[1][1]="Papakami@786";
		
		l1[2][0]="roohikohli92@gmail.com";
	    l1[2][1]="Papanami@786";
		
		l1[3][0]="roohikohli92@gmail.com";
		l1[3][1]="Papamimi@786";
		return l1;
		
	}
}

	
