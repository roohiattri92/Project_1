package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_icons {

	public static void main(String[] args) 
	{
      ChromeDriver green=new ChromeDriver();
      green.get("https://grotechminds.com/drag-and-drop/");
     WebElement Blue= green.findElement(By.id("div1"));
     WebElement Flower= green.findElement(By.id("div2"));
     Actions g=new Actions(green);
     g.dragAndDrop(Blue, Flower).perform();

	}

}
