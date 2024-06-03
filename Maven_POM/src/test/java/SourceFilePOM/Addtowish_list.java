package SourceFilePOM;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtowish_list 
{
	WebDriver driver;
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement add_to_wishlist;
	@FindBy(xpath="//a[.='View Your List']")
	WebElement View_your_list;
	
	
	public void parentwindowhandler(WebDriver driver) 
	{
		
	Set<String> parent_window=driver.getWindowHandles();
    Iterator<String> g=parent_window.iterator();
    String parent=g.next();
    String Child1=g.next();
    driver.switchTo().window(Child1);
}
	public void Add_to_wishlist()
	{
		add_to_wishlist.click();
	
	}
	public void view_your_list()
	{
		View_your_list.click();
	}
	public Addtowish_list(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
