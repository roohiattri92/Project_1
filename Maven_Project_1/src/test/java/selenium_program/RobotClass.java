package selenium_program;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       WebElement t= driver.findElement(By.className("gb_I"));
       Actions h= new Actions(driver);
       h.contextClick(t).perform();
       for(int i=0;i<=4;i++)
       {
    	   Robot y=new Robot();
    	   y.keyPress(KeyEvent.VK_DOWN);
           
           Thread.sleep(3000);
           y.keyPress(KeyEvent.VK_ENTER);
    	   }
      
	}

}
