package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.name("q")).sendKeys("banglore");
       List<WebElement> w2= driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
    int y=   w2.size();
    System.out.println(y);
     w2.get(y-8).click();
    
	
	
	
	
	
	
	
	
	
	}

}
