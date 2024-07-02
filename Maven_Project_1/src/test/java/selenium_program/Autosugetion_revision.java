package selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugetion_revision {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement search=driver.findElement(By.className("Pke_EE"));
		search.sendKeys("Book");
		List<WebElement> AutoSuggestion=driver.findElements(By.xpath("//form[@class=\"_2rslOn header-form-search OpXDaO\"]/ul/li"));
		System.out.println(AutoSuggestion.size());

	}

}
