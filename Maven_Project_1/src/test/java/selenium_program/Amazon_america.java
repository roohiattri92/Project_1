package selenium_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_america {
	
	public static void main(String[] args) throws InterruptedException 
	{ 
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement search_field=driver.findElement(By.id("twotabsearchtextbox"));
	search_field.sendKeys("shoes");
	search_field.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).click();
   	driver.findElement(By.xpath("(//span[@class=\"a-dropdown-prompt\"])[1]")).click();
    driver.findElement(By.xpath("//li[@id=\"size_name_6\"]")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]")).click();
    driver.findElement(By.xpath("//input[@name=\"proceedToRetailCheckout\"]")).click();
    driver.findElement(By.cssSelector("#ap_email")).sendKeys("roohikohli92@gmail.com");
    driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
    driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys("PAPAmami@786");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-radio'])[2]")).click();
    driver.findElement(By.xpath("(//input[@class='a-button-input'])[3]")).click();
    driver.findElement(By.xpath("//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link']")).click();
    Thread.sleep(1000);
    WebElement y=driver.findElement(By.id("pp-W5iuFL-115"));
    driver.switchTo().frame(y);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='pp-f5CVwC-17']")).sendKeys("7527920");
    
  
	}
}


