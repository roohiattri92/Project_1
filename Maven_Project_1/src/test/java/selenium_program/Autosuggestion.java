package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion 
{
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
         driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.amazon.ca/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
       WebElement search_bar=  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
       search_bar.sendKeys("shoes");
       Thread.sleep(1000);
     List<WebElement> n=driver.findElements(By.xpath("//div[@class='s-suggestion-container']/div"));
   int o=    n.size();
   System.out.println(o);
       n.get(o-2).click();
       Thread.sleep(2000);
     /* WebElement k1= driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[4]"));
      k1.click() ;      */
       
       
       
       
         
		
		
       
	}

}
