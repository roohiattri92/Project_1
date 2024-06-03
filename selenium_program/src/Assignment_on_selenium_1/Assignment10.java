//Program to launch Facebook and Login

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment10 {

	public static void main(String[] args) {
		ChromeDriver p1=new ChromeDriver();
		p1.get("https://www.facebook.com/");
		p1.findElement(By.id("email")).sendKeys("roohikohli92@gmail.com");
		p1.findElement(By.id("pass")).sendKeys("PAPAmami@776");
		p1.findElement(By.name("login")).click();

		
		
		
		
	}

}
