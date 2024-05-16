package selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazonandclick_logintoapp_1 {

	public static void main(String[] args) {
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://www.amazon.in/");
		//c1.findElement(By.linkText("Customer Service")).click();
		//c1.findElement(By.className("a-spacing-none a-text-normal")).click();

		WebElement Element=c1.findElement(By.id("twotabsearchtextbox"));
		Select w=new Select(Element);
	//	w.selectByVisibleText("All Categories");
		w.selectByIndex(0);
		w.selectByVisibleText("Books");

	}

}
