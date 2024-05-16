package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteindiaandEnter_1 {

	public static void main(String[] args) {
		ChromeDriver p1=new ChromeDriver();
		p1.get("https://www.google.com/");
		p1.findElement(By.className("gLFyf")).sendKeys("india");
		p1.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);//use keyboard how to use enter
		

	}

}
