package selenium_program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleJavaScripPopUp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//instead of thread sleep we can use this .will automaticaly check how much time needs to wait 
		WebElement search=	driver.findElement(By.xpath("//button[.='Click ']"));
		search.click();
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
		
		//serach.click();//birth to java script pop up
	//	Thread.sleep(2000);
			
			//Thread.sleep(2000);
			//serach.click();//birth to java script pop up
	}

}
