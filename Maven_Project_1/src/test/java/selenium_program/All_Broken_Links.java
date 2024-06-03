package selenium_program;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Broken_Links {
	String G1;

	public static void main(String[] args) throws IOException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        List<WebElement> h1= driver.findElements(By.tagName("a"));
         System.out.println( h1.size()); 
         for(int i=0;i<h1.size();i++)
         {
        	WebElement j1= h1.get(i);
        	String h=j1.getAttribute("href");
        	//String h=j1.getText();
        	System.out.println(h);
        	verify_allbrokenlinks(h);
        	}
}
	
	public static void verify_allbrokenlinks(String h) throws IOException 
	{ 
		try {
		URL G= new URL(h);
	HttpURLConnection k=(HttpURLConnection) G.openConnection();
	k.connect();
	if(k.getResponseCode()==200)
	{
		System.out.println("Link is valid" +" "+ h +k.getResponseCode()+""+k.getResponseMessage()+""  );
	}
	else
	{
		System.out.println("Link is not valid"+" "+ h +k.getResponseCode()+""+k.getResponseMessage()+"" );
	}
	}
	catch(MalformedURLException n1)
	{
		System.out.println("Exception handled");
	}
	
		
	}

}
