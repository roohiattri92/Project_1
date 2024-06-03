package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_acess_1 {

	public static void main(String[] args) {
		ChromeDriver r1=new ChromeDriver();
		r1.get("https://www.naukri.com/");
		r1.findElement(By.id("register_Layer")).click();
		
	}

}
