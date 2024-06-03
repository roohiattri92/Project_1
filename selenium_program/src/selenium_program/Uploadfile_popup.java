package selenium_program;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile_popup {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement upload=		driver.findElement(By.xpath("//input[@id='file']"));
		
		upload.sendKeys("C:\\Users\\MKT\\Downloads\\manish\\ab40.png");
	}

}
