//Program to launch the google and click on Gmail link

package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment__12 {

	public static void main(String[] args) {
		ChromeDriver p1=new ChromeDriver();
		p1.get("https://www.google.com/");
		p1.findElement(By.className("gb_J")).click();
		
		
		
		
		
		
		
		
		
	}

}
