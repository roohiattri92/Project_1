package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickongamil_1 {

	public static void main(String[] args) {
		ChromeDriver r=new ChromeDriver();
		r.get("https://www.facebook.com/");
		//r.findElement(By.className("gb_J")).click();
r.findElement(By.name("email")).sendKeys("roohikohli92@gmail.com");
r.findElement(By.name("pass")).sendKeys("PAPAmai@764");
r.findElement(By.name("login")).click();
		   
	}

}
