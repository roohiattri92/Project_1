package Assignment_on_selenium_1;

import java.time.Duration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Onetabtoanothertab_24apr {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();//maximize
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//for wait//syncronisation in selenium
WebElement god=	driver.findElement(By.xpath("(//input[@id=\"twotabsearchtextbox\"])"));
	god.sendKeys("shoes");
	god.sendKeys(Keys.ENTER);
	WebElement firstshoe=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[2]"));
	firstshoe.click();
	
	// to find Id of child and parent site
	
	String parent =driver.getWindowHandle();
	System.out.println(parent);
	java.util.Set<String> child=driver.getWindowHandles();
       System.out.println(child);
     
     //  Wanted to know what happen after using iterator
 Iterator<String> two= child.iterator();
 String parent1=two.next();
 String child1=two.next();
 

 System.out.println(parent1);
driver.switchTo().window(child1);//one window to another window
//Thread.sleep(2000);
//driver.close();

WebElement y=driver.findElement(By.xpath("(//input[@id='buy-now-button'])"));
y.click();
Thread.sleep(2000);
WebElement y1=driver.findElement(By.xpath("(//input[@id='ap_email'])"));
y1.sendKeys("roohikohli92@gmail.com");

WebElement y2=driver.findElement(By.xpath("(//input[@id='continue'])"));

 y2.sendKeys(Keys.ENTER);
       
       
       
	}

	
		
	}



