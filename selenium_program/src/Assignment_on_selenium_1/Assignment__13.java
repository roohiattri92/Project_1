

//Program to launch the google and click on Images link
package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment__13 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver p1=new ChromeDriver();
		p1.get("https://www.google.com/");
		Thread.sleep(1000);
		p1.findElement(By.linkText("Images")).click();
		
	}

}
