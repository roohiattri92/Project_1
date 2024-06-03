package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hoverover_amazon_clickontshirt_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver p1=new ChromeDriver();
		   p1.get("https://www.amazon.in/");
		   
		/* WebElement u1=  p1.findElement(By.linkText("Best Sellers"));
		 Actions a1=new Actions(p1);
		 a1.moveToElement(u1).perform();
		 u1.click();*/
		   
		  /* WebElement u1=p1.findElement(By.xpath("(//input)[5]"));
			 Actions a1=new Actions(p1);
			 a1.moveToElement(u1).perform();
			 u1.sendKeys("Roohi");*/
		   
		   WebElement u1=p1.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		   Thread.sleep(5000);
			 Select v1=new Select(u1);
			 v1.selectByIndex(11);
		   
		 
		 
	}

}
