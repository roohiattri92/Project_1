package TestCases;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit extends Listener_spicejet
{
		
		@BeforeMethod
		public void Launch()
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));	
		}
		@AfterMethod
		public void Quit() throws InterruptedException
		{
			Thread.sleep(2000);
			//driver.quit();
		}

	

}

