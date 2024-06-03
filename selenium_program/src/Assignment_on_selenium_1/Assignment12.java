package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment12 {

	public static void main(String[] args) {
		ChromeDriver god=new ChromeDriver();
	    god.get("https://www.myntra.com/");
	   // Thread.sleep(5000);
	  WebElement Autosugestion=  god.findElement(By.className("desktop-searchBar"));
	  Autosugestion.sendKeys("shoes");
	}

}
