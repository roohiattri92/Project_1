package Assignment_on_selenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_3 {

	public static void main(String[] args) {
		ChromeDriver god=new ChromeDriver();
		god.get("https://www.google.com/");
		god.get("https://www.flipkart.com/");
		god.close();
	}

}
