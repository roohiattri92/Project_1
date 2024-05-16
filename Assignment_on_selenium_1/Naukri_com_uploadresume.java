package Assignment_on_selenium_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_com_uploadresume {

public static void main(String[] args) {
ChromeDriver god= new ChromeDriver();
god.get("https://grotechminds.com/registration/");
god.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

WebElement yes=god.findElement(By.xpath("//input[@id='file']"));
yes.sendKeys("C:\\Users\\roohi\\Pictures\\Screenshots\\Screenshots(8).png");
	}

}
