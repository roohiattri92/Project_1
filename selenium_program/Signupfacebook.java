package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signupfacebook {

	public static void main(String[] args) {
		ChromeDriver house=new ChromeDriver();
		house.get("https://www.facebook.com/signup");
		house.findElement(By.name("firstname")).sendKeys("roohi");
		house.findElement(By.name("firstname")).sendKeys(Keys.CONTROL +"c");
		house.findElement(By.name("firstname")).sendKeys(Keys.CONTROL+"a");
		//house.findElement(By.name("lastname")).sendKeys(Keys.CONTROL+"v");
		house.findElement(By.name("lastname")).sendKeys("roohi");
		house.findElement(By.name("reg_email__")).sendKeys("roohikohli92@gmail.com");
		house.findElement(By.id("password_step_input")).sendKeys("Welcome");
		WebElement element=	house.findElement(By.id("month"));
		Select l1=new Select(element);
		l1.selectByIndex(0);
		WebElement element1=	house.findElement(By.id("day"));
		Select l2=new Select(element1);
		l2.selectByIndex(6);
		WebElement element2=	house.findElement(By.id("year"));
		Select l3=new Select(element2);
		l3.selectByValue("1992");

	}
}
