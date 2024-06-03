
//Handle Autosuggestion for Myntra application(search box)
package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handleautosugestion_Assignment189 {

	public static void main(String[] args)
	{
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		Driver.get("https://www.myntra.com/personal-care");
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		Driver.findElement(By.xpath("(//div[@class=' desktop-autoSuggest desktop-showContent']/ul/li)[4]")).click();
              
	}

}
