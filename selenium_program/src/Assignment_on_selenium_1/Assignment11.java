
//Program to launch Amazon application and do the Sign in
package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment11 {

	public static void main(String[] args) {
		ChromeDriver p1=new ChromeDriver();
		p1.get("https://www.amazon.in/");
		p1.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		p1.findElement(By.id("ap_email")).sendKeys("roohikohli92@gmail.com");
		p1.findElement(By.id("continue")).click();
		p1.findElement(By.id("ap_password")).sendKeys("PAPAmami@786");
		p1.findElement(By.id("signInSubmit")).click();


	}

}
