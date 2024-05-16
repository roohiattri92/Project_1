package selenium_program;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_allUrlcode_anyWesite {

	public static void main(String[] args) {
 ChromeDriver Driver=new ChromeDriver();
 	Driver.get("https://www.google.com/");
 	Driver.manage().window().maximize();
 	Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 	Driver.navigate().refresh();
 	
   List	<WebElement> room=Driver.findElements(By.tagName("a"));
 	int b=room.size();
 	for(int i=0;i<b;i++)
 	{
 		WebElement r1=room.get(i);
 		r1.getAttribute("href");
 		
 		
 	}
 	
 	
	}

}
