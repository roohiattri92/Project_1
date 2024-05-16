
//Hover over on Amazon website on using moveToElement()

package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_ {

	public static void main(String[] args) 
	{
		
		ChromeDriver p1=new ChromeDriver();
		   p1.get("https://www.amazon.in/");
		   
		   WebElement papa= p1.findElement(By.className("nav-line-2"));
		   Actions a1=new Actions(p1);
		   a1.moveToElement(papa).perform();
		   papa.click();
		   }

}
