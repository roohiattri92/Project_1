package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoveroverinSelenium1 {

	public static void main(String[] args) 
	{
   ChromeDriver t1=new ChromeDriver();
   t1.get("https://www.amazon.in/");
WebElement you=t1.findElement(By.className("nav-line-2"));
Actions a1=new Actions(t1);
a1.moveToElement(you).perform();
//a1.findElement(By.linkText("sign in"))
you.click();

   
	}

}
