package selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launc_Browser {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("india");
	List<WebElement> urls=driver.findElements(By.tagName("span"));
     int q=urls.size();
     System.out.println(q);
     for (int i=0;i<q;i++)
    	 
     {
    	WebElement t= urls.get(i);
    	t.getAttribute("href");
    	 
     }

	}

}
