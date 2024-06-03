
//Program to launch the google and click on Gmail link partial link text

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment158 {

	public static void main(String[] args)
	{
		ChromeDriver god= new ChromeDriver();
	    god.get("https://www.google.com/");
	    god.findElement(By.className("gb_J")).click();
      
	}

}
