//Program to launch Amazon India from cat dropdown select the books, type world war and click on search button


package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment163 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver god=new ChromeDriver();
		  god.get("https://www.amazon.in/");
		WebElement j= god.findElement(By.id("twotabsearchtextbox"));
		 WebElement g= god.findElement(By.id("searchDropdownBox"));
		 Select h=new Select(g);
		 h.selectByIndex(11);
		// j.sendKeys("world war");
		 Thread.sleep(1000);
		 g.sendKeys(Keys.ENTER);
		 j.sendKeys("world war");
		 j.sendKeys(Keys.ENTER);

	}

}
