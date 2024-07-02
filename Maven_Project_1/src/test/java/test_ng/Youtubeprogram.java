package test_ng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Youtubeprogram 
{
	@Test
	public void youtube_program()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("hhttps://www.youtube.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
      
	}

}
