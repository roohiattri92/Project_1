package test_ng;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excelsheetgettinginput1 
{
	@Test
	public void excelsheet() throws EncryptedDocumentException, IOException
	{
	FileInputStream h=new FileInputStream("C:\\Users\\roohi\\eclipse-workspace\\Maven_Project_1\\excelfile\\roohi.xlsx");
	 Workbook wb=WorkbookFactory.create(h);
	 String un=wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
	 String password=wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
	 System.out.println(un);
	 System.out.println(password);
	 
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(un);
	 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(password);
	 driver.findElement(By.id("loginbutton")).sendKeys(Keys.ENTER);
	  
	  
	  
	  
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
