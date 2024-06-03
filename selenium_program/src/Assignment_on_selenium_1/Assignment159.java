//Program to Launch the amazon, click the search the Category Dropdown and select the Amazon Devices using select by index class

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment159 {

	public static void main(String[] args) throws InterruptedException 
	{
      ChromeDriver god=new ChromeDriver();
	  god.get("https://www.amazon.in/");
	/*WebElement j= god.findElement(By.id("twotabsearchtextbox"));
	 WebElement g= god.findElement(By.id("searchDropdownBox"));
	 Select h=new Select(g);
	 h.selectByIndex(11);
	 j.sendKeys("world war");
	 j.sendKeys(Keys.ENTER);*/
	 
	// -----------------------------------------------------
	 
	 
	 WebElement u= god.findElement(By.id("twotabsearchtextbox"));
	 WebElement l= god.findElement(By.id("searchDropdownBox"));
	 l.click();
	 Thread.sleep(1000);
	 for(int i=0;i<11;i++)
	 {
	 Select h=new Select(l);
	 h.selectByIndex(i);
	 u.sendKeys("world war");
	 u.sendKeys(Keys.ENTER);
	 l.sendKeys(Keys.ARROW_DOWN);
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
