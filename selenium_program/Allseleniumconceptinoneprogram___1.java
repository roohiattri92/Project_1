package selenium_program;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Allseleniumconceptinoneprogram___1 
{
        @Test
		public void Amazon_Cart() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.navigate().to("https://www.amazon.in/");
			WebElement HoverOver=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
			Actions a1=new Actions(driver);// HoverOver
			a1.moveToElement(HoverOver).perform();
			WebElement signin=driver.findElement(By.className("nav-action-inner"));
			signin.click();
			WebElement username=driver.findElement(By.id("ap_email"));
			username.sendKeys("roohikohli92@gmail.com");
			username.sendKeys(Keys.ENTER);
			WebElement password=driver.findElement(By.id("ap_password"));
			password.sendKeys("PAPAmami@786");
			password.sendKeys(Keys.ENTER);
			WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
			search.sendKeys("shoes");
			Thread.sleep(1000);
			List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));// Auto suggestion
			int count=autosuggestion.size();
			autosuggestion.get(count-6).click();
			driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[5]")).click();
			Set<String> browser_id=driver.getWindowHandles();// to move control from parent to child
			Iterator<String> b1=browser_id.iterator();
			String parent_ID=b1.next();
			String child_ID=b1.next();
			System.out.println(child_ID);
			driver.switchTo().window(child_ID);
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.switchTo().window(parent_ID);
			driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[8]")).click();
			String Child_2=b1.next();
			System.out.println(Child_2);
			driver.switchTo().window(Child_2);
			Thread.sleep(1000);
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.id("proceed-to-checkout-action")).click();

	}

}
