package SourceFilePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Short_shoe_product 
{
	WebDriver driver;
	
   @FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
   WebElement Four_start;
   
   @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[1]")
   WebElement Select_brand1;
   
   @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[2]")
   WebElement Select_brand2;
   
   @FindBy(xpath="(//i[@class='a-icon a-icon-checkbox'])[3]")
   WebElement Select_brand3;
   
   public void four_start()
   {
	   Four_start.click();
   }
   public void select_brand1()
   {
	   Select_brand1.click();
   }
   public void select_brand2()
   {
	   Select_brand2.click();
   }
   public void select_brand3()
   {
	   Select_brand3.click();
   }
   
   public Short_shoe_product(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
