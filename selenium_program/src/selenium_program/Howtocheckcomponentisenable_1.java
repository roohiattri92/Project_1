package selenium_program;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Howtocheckcomponentisenable_1 {

	public static void main(String[] args) {
 
		ChromeDriver h=new ChromeDriver();
		h.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
	//	driver.manage().window().maximize();
		WebElement l=h.findElement(By.name("lname"));
	boolean tom=l.isDisplayed();
	boolean yes=l.isEnabled();
	if(tom&&yes)
	{
		System.out.println("yes it enable");
	}
	l.click();
	}

}
