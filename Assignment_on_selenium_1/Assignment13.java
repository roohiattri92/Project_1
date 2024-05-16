package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment13 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver god=new ChromeDriver();
	    god.get("https://grotechminds.com/drag-and-drop/");
	    Thread.sleep(5000);
	  WebElement drag=  god.findElement(By.id("drag11"));
	  WebElement drop = god.findElement(By.id("div2"));
	  Actions b= new Actions(god);
	  b.dragAndDrop(drag, drop).perform();	  
	}

}
