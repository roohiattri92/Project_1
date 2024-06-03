package selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_programaftercrosskit_1 {

	public static void main(String[] args)
	{
     ChromeDriver d1=new ChromeDriver();
     //EdgeDriver e1=new EdgeDriver();
     d1.get("https://www.facebook.com/");
   // d1.quit();
     d1.get("https://www.facebook.com/");
    d1.close();
   String w1= d1.getTitle();
   System.out.println(w1);
	}

}
