package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class print_ALL_URLlink {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> l1=driver.findElements(By.tagName("a"));
		System.out.println(l1.size());
	int a1=	l1.size();
	System.out.println(a1);
		
		
		for(int i=0;i<l1.size();i++)
		{
			WebElement a2=l1.get(i);
			String v1=a2.getAttribute("href");
			System.out.println(v1);
			}
	}
	

}
