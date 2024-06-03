package Dataprovider_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_class 
{
	WebDriver driver;
	@Test(dataProvider="search")
	public void dataset(String input,String paswd)
	{
       System.out.println(input + paswd);
		
	}
	@DataProvider(name="search")
	public Object[][] dataset1()
	{
		Object dataset2 [][]= new Object [5][2];
		dataset2[0][0]="roohikohli92@gmail.com";
		dataset2[0][1]="Papalami@786";
		
		dataset2[1][0]="roohikohli92@gmail.com";
		dataset2[1][1]="Papakami@786";
		
		dataset2[2][0]="roohikohli92@gmail.com";
		dataset2[2][1]="Papanami@786";
		
		dataset2[3][0]="roohikohli92@gmail.com";
		dataset2[3][1]="Papamimi@786";
		return dataset2;
		
	}
}

	
	
	
	
	
	
	
	
	
	
	


