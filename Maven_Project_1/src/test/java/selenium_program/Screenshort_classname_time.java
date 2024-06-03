package selenium_program;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshort_classname_time {

	public static void main(String[] args) throws IOException 
	{
		Date d1=new Date(0);
	long date=d1.getTime();
String j=	d1.toString();
	
	
		ChromeDriver h=new ChromeDriver();
		h.navigate().to("https://www.google.com/");
		h.manage().window().maximize();
		h.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		h.findElement(By.name("q")).sendKeys("india");
		
		TakesScreenshot t=(TakesScreenshot)h;
	   File source=	t.getScreenshotAs(OutputType.FILE);
	   File destination=new File("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\Screenshortfile\\"+new Screenshort_classname_time().getClass()+ j+".png");
		FileHandler.copy(source, destination);
		

	}

}
