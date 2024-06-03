package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{
	 WebDriver driver;
	   @BeforeMethod
	   public void Launch()
	   {
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.aircanada.com/ca/en/aco/home.html");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   
	   }
	   @AfterMethod
	   public void Quit()
	   {
		   //Thread.sleep(1000);
		 //  driver.quit();
	   }
	}
	
