//tagname locator



package Assignment_on_selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_1 {

	public static void main(String[] args) {
   //  ChromeDriver k=new ChromeDriver();
    /* k.get("https://www.facebook.com/login");
     k.findElement(By.tagName("button")).click()*/
     ChromeDriver k=new ChromeDriver();

     k.get("file:///C:/Users/roohi/Downloads/learningHTML1.html");
     k.findElement(By.tagName("a")).click();
;
	}

}
