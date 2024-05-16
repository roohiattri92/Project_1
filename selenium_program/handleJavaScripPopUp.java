package selenium_program;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleJavaScripPopUp {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//instead of thread sleep we can use this .will automaticaly check how much time needs to wait 
		WebElement serach=	driver.findElement(By.xpath("//button[.='Click ']"));
		serach.click();//birth to java script pop up
		Thread.sleep(2000);
			driver.switchTo().alert().accept();//handled the JSP
			Thread.sleep(2000);
			//serach.click();//birth to java script pop up
	}

}
