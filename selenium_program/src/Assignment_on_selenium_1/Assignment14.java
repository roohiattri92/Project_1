
//Program to launch Amazon.in, click on Customer service, in that select Your Order


package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment14 {

	public static void main(String[] args) 
	{
		ChromeDriver god= new ChromeDriver();
		god.get("https://www.amazon.in/");
		god.findElement(By.linkText("Customer Service")).click();
		god.findElement(By.xpath("(//h3[@class=\"a-spacing-none a-text-normal\"])[1]")).click();

	}

}
