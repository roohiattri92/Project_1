package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExam {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mouse");
        List<WebElement> w1=driver.findElements(By.xpath("(//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li)"));
         int p= w1.size();
     System.out.println(p);
       w1.get(w1.size()-6).click();
	}

}
