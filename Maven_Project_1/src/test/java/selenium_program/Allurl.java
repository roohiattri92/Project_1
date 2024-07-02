package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allurl {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement>w1= driver.findElements(By.tagName("a"));
         int k=   w1.size();
         System.out.println(k);
         for(int i=0;i<k;i++)
         {
        	WebElement u= w1.get(i);
           String m=	u.getAttribute("href");
            System.out.println(m);
        	 
         }
        
        

	}

}
