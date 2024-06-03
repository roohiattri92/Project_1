//Program to Launch the Microsoft Edge, open the Flipkart application, display title of the page and close the application 

package Assignment_on_selenium_1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		ChromeDriver god=new ChromeDriver();
		god.get("https://www.google.com/");
		god.get("https://www.flipkart.com/");
		god.close();

	}

}
