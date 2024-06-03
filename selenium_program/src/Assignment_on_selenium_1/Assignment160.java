//Program to Launch the amazon, click the search the Category Dropdown and select the Amazon Devices using select by value.

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment160 {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver god=new ChromeDriver();
		  god.get("https://www.amazon.in/");
		WebElement j= god.findElement(By.id("twotabsearchtextbox"));
		 WebElement g= god.findElement(By.id("searchDropdownBox"));
		 Select h=new Select(g);
		 h.selectByValue("search-alias=amazon-devices");
		// j.sendKeys("world war");
		 Thread.sleep(1000);
		 g.sendKeys(Keys.ENTER);
		 

	}

}
