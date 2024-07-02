package test_ng;
/*Data-driven testing (DDT) is a testing method where you execute 
the same test scenario across a wide range of data input.
Instead of creating separate test scripts for each input data, 
DDT allows you to reuse your test code*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DDT_Excelfile
{

	@Test
	public void ddt() throws FileNotFoundException,IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\NewDDT_EXCELfile\\Untitled spreadsheet (3).xlsx");
        Workbook g=WorkbookFactory.create(file);
      String user_name=  g.getSheet("login").getRow(1).getCell(0).getStringCellValue();
     // String password=   g.getSheet("login").getRow(1).getCell(1).getStringCellValue();
      
    String password1 = NumberToTextConverter.toText(g.getSheet("login").getRow(2).getCell(1).getNumericCellValue());
    WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user_name);
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password1);
	 driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
	  
	  
		
	}

}
