package test_ng;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Parentclass_Childclass_comandprogram 
{
	WebDriver driver;
	@Test 
	public void addproduct1() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.amazon.in/");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		Thread.sleep(1000);
		List<WebElement> y=	driver.findElements(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])"));
		y.size();
		System.out.println(y.size());
		y.get(y.size()-4).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
		Thread.sleep(1000);
	 	driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).click();
	 	
        Set<String> parent_window=driver.getWindowHandles();
        Iterator<String> g=parent_window.iterator();
        String parent=g.next();
        String Child1=g.next();
        String Child2=g.next();
        System.out.println(parent);
        System.out.println(Child1);
        System.out.println(Child2);
        
        driver.switchTo().window(Child1);
        WebElement r=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String childsite= r.getText().replaceAll(",", "");
        double f= Double.parseDouble(childsite);
        System.out.println(f);
        driver.findElement(By.id("add-to-cart-button")).click();
        
       driver.switchTo().window(Child2);
       WebElement f1= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
       String t= f1.getText().replaceAll(",","");
       double n=Double.parseDouble(t);
       System.out.println(n);
       driver.findElement(By.id("add-to-cart-button")).click();
       double k=f+n;
       System.out.println(k);
     
       WebElement u= driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
       String house=u.getText().replaceAll(",", "");
       double m=Double.parseDouble(house);
       System.out.println(m);
       Assert.assertEquals(k, m);
       
       
    
       
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*List <WebElement> k=driver.findElements(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		k.size();
		System.out.println(k.size());
	    k.get(k.size()-4).click();
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[4]")).click();
		Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")).click();*/
		
		
		
		
		
		
		

		
		
		
		
		

}
}
