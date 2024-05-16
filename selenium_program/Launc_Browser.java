package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launc_Browser {

	public static void main(String[] args) 
	{
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.google.com/");
	/*c1.findElement(By.id("APjFqb")).sendKeys("xvideos");
	c1.findElement(By.id("APjFqb")).click();*/
		/*c1.findElement(By.className("gLFyf")).sendKeys("xvideos");
	c1.findElement(By.id("input")).click();*/
	c1.findElement(By.className("gLFyf")).sendKeys("india");
;	c1.findElement(By.id("input")).click();

	}

}
