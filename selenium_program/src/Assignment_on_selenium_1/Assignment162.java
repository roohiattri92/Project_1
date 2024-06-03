//Program to launch Google, type India and press Enter using Keys.ENTER

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment162 {

	public static void main(String[] args) 
	{
       ChromeDriver god=new ChromeDriver();
       god.get("https://www.google.com/");
       
   WebElement k= god.findElement(By.name("q"));
   k.sendKeys("india");
   k.sendKeys(Keys.ENTER);
       
       
       
       
       
       
       
       
       
       
       
       
	}

}
