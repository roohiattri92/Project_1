
//Automate SBI New User registration page ( https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm )


package Assignment_on_selenium_1;

import java.time.Duration;

import org.bouncycastle.util.Selector;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assignment_14 {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver god=new ChromeDriver();
    god.get("https://retail.onlinesbi.sbi/retail/userdrivenregdetails.htm");
    
    god.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Thread.sleep(5000);
    god.navigate().refresh();//to use  to refresh whole page.
    god.findElement(By.name("accountNo")).click();
   /* Thread.sleep(2000);
    god.switchTo().alert().accept();*/

   god.findElement(By.name("accountNo")).sendKeys("1356476895");
      god.findElement(By.xpath("//input[@id=\"cifNo\"]")).sendKeys("56548259");
      god.findElement(By.xpath("(//input[@id=\"branchCode\"])")).sendKeys("786786");

     WebElement yes= god.findElement(By.xpath("//select[@name=\"countryCode\"]"));
      Select s1=new Select(yes);
      s1.selectByIndex(5);
      god.findElement(By.name("mobileNo")).sendKeys("289623782");
    WebElement house=  god.findElement(By.name("txnRights"));
    Select j=new Select (house);
    j.selectByIndex(1);
    god.findElement(By.name("captchaValue")).sendKeys("roohikohli92@gmail.com");
    god.findElement(By.name("I Agree")).click();
      
      
      
      
      
      
      
      
      
	}
}
