package selenium_program;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.zeromq.ZStar.Set;

public class Movethecontrolfromonewindowtoanother_bymunish {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement serach=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		serach.sendKeys("shoe");
		serach.sendKeys(Keys.ENTER);
			

		WebElement firstshoe=	driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
		firstshoe.click();
		String pid=	driver.getWindowHandle();
		java.util.Set<String> pandcid=	driver.getWindowHandles();
		System.out.println(pid);
		System.out.println(pandcid);
		
			Iterator<String> pc=pandcid.iterator();
			String parentid=		pc.next();
			String childid=		pc.next();
			System.out.println(parentid);
			System.out.println(childid);
		driver.switchTo().window(childid);
			Thread.sleep(2000);
			driver.close();
	}

}
