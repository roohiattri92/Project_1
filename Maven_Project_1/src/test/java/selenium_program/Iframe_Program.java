package selenium_program;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Program {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement search_field=	driver.findElement(By.id("twotabsearchtextbox"));
		search_field.sendKeys("shoes");
		search_field.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	    WebElement h=	driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	    String h1=h.getText();
	    System.out.println(h1);
	    Set<String> get_control=driver.getWindowHandles();
	    Iterator<String> Browserid=    get_control.iterator();
	     String parent_id=  Browserid.next();
	     String child_id=  Browserid.next();
	     System.out.println(parent_id);
	     System.out.println(child_id);
	     driver.switchTo().window(child_id);
	     Thread.sleep(2000);
	     
	 WebElement textmassageprint=    driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]"));
	String k= textmassageprint.getText();
	 System.out.println(k);
	     driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
	  
	  
	}

}
