import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptPopup {

	public static void main(String[] args) {
ChromeDriver god=new ChromeDriver();
god.get("https://grotechminds.com/javascript-popup/");
god.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement we=god.findElement(By.xpath("(//button[@class='btnjs'])"));
we.click();

god.switchTo().alert().accept();


	}

}
