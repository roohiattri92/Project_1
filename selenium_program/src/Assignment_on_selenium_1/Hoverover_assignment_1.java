
//Launch flipkart applicatio, hover over fashion and click mens-tshirt

package Assignment_on_selenium_1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_assignment_1 {

	public static void main(String[] args) {

		ChromeDriver our=new ChromeDriver();
		// Driver.manage().window().fullscreen();

		   our.get("https://www.amazon.in/");
		   WebElement papa=   our.findElement(By.linkText("Best Sellers"));
		   Actions h1= new Actions(our);
		   h1.moveToElement(papa).perform();
		   papa.click();
		   
	}

}
