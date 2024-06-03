package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DROP_Down {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		/*//c1.findElement(By.linkText("Customer Service")).click();
		//c1.findElement(By.className("a-spacing-none a-text-normal")).click();

		WebElement Element=c1.findElement(By.id("twotabsearchtextbox"));
		Select w=new Select(Element);
	//	w.selectByVisibleText("All Categories");
		w.selectByIndex(0);
		w.selectByVisibleText("Books");*/
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
		dropdown.click();
		
		for(int i=0;i<10;i++)
		{
		Thread.sleep(1000);
		Select h1=new Select(dropdown);
		h1.selectByIndex(i);
		}
	WebElement searchfield=	driver.findElement(By.id("twotabsearchtextbox"));
	searchfield.sendKeys("shoes");
	searchfield.sendKeys(Keys.ENTER);
		
	//	h1.selectByValue("search-alias=fashion");
	//	h1.selectByVisibleText("Amazon Fashion");
	
		
		
		

	}
}



