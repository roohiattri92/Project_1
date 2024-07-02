package test_ng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//@Listeners(Exam_program2_Listener.class)
public class Exam_program2 //extends Exam_program2_Listener

{
	
	@Test
	public void program2() throws InterruptedException
	{ WebDriver driver;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement w1=driver.findElement(By.xpath("//input[@id='search']"));
		w1.sendKeys("Narender Modi");
		w1.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[6]")).click();
		
	}

}
