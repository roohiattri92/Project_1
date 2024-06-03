package selenium_program;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_math_random {

	public static void main(String[] args) throws IOException {
		ChromeDriver h=new ChromeDriver();
		h.navigate().to("https://www.google.com/");
		h.manage().window().maximize();
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		h.findElement(By.name("q")).sendKeys("india");
		
		TakesScreenshot t=(TakesScreenshot)h;
	   File source=	t.getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\Screenshortfile\\"+Math.random()+".png");
		FileHandler.copy(source, destination);
		
	}

}
